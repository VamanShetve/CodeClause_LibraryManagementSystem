
package mainlibrary;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ViewBook extends javax.swing.JFrame {

   
    public ViewBook() throws SQLException {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        initComponents();
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
      
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select * from Books",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
        
            NameRadio.setSelected(true);
            
            
       
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
   
                    
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NameRadio = new javax.swing.JRadioButton();
        SearchField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        AuthorRadio = new javax.swing.JRadioButton();
        ALL = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Book ID", "Name", "Genre", "AuthorRadio", "Publisher", "Shelf", "Row"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("Books");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        NameRadio.setText("Name");
        NameRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameRadioActionPerformed(evt);
            }
        });

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        AuthorRadio.setText("Author");
        AuthorRadio.setToolTipText("");
        AuthorRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorRadioActionPerformed(evt);
            }
        });

        ALL.setText("ALL");
        ALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(NameRadio)
                .addGap(30, 30, 30)
                .addComponent(AuthorRadio)
                .addGap(38, 38, 38)
                .addComponent(ALL)
                .addGap(115, 115, 115)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Search)
                .addContainerGap(407, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameRadio)
                    .addComponent(AuthorRadio)
                    .addComponent(ALL)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(698, 698, 698)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(672, 672, 672)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code hereset
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void NameRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameRadioActionPerformed
        // TODO add your handling code here:
        AuthorRadio.setSelected(false);
        ALL.setSelected(false);
    }//GEN-LAST:event_NameRadioActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        
                    DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        while(model.getRowCount()>0)
            model.removeRow(model.getRowCount()-1);
        if(NameRadio.isSelected())
        {
       
            String Search = "%"+SearchField.getText()+"%";
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select * from Books where BookName like ?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setString(1, Search);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
            
           
     
            
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
            int rowcount = model.getRowCount();
             System.out.println(rowcount);
            if(rowcount==0)
            {
                String NoRow[];
                NoRow = new String[7];
                NoRow[3]="NO";
                NoRow[4]="RESULT";
                NoRow[0]="";
                NoRow[1]="";
                NoRow[2]="";
                NoRow[5]="";
                NoRow[6]="";
                model.addRow(NoRow);
                
                
            }
   
                    
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    } }
        
        else if(AuthorRadio.isSelected())
        {
            
       
            String Search = "%"+SearchField.getText()+"%";
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select * from Books where Author like ?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setString(1, Search);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
            
           
     
            
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
            int rowcount = model.getRowCount();
             System.out.println(rowcount);
            if(rowcount==0)
            {
                String NoRow[];
                NoRow = new String[7];
                NoRow[3]="NO";
                NoRow[4]="RESULT";
                NoRow[0]="";
                NoRow[1]="";
                NoRow[2]="";
                NoRow[5]="";
                NoRow[6]="";
                model.addRow(NoRow);
                
                
            }
   
                    
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    }
        }
        
        else
        {
            
				JOptionPane.showMessageDialog(ViewBook.this, "Select Name or Author","No Selection!", JOptionPane.ERROR_MESSAGE);
        }
                
              
            
    }//GEN-LAST:event_SearchActionPerformed

    private void AuthorRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorRadioActionPerformed
        // TODO add your handling code here:
        NameRadio.setSelected(false);
        ALL.setSelected(false);
    }//GEN-LAST:event_AuthorRadioActionPerformed

    private void ALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALLActionPerformed
        // TODO add your handling code here:
          NameRadio.setSelected(false);
          AuthorRadio.setSelected(false);
          SearchField.setText("");
          DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
          while(model.getRowCount()>0)
            model.removeRow(model.getRowCount()-1);
      
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select * from Books",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
        
          
         
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
   
                    
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    }
    }//GEN-LAST:event_ALLActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewBook().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewBook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ALL;
    private javax.swing.JRadioButton AuthorRadio;
    private javax.swing.JRadioButton NameRadio;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
