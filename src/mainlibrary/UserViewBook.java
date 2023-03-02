
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


public class UserViewBook extends javax.swing.JFrame {

    
    public UserViewBook() throws SQLException {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        initComponents();
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
      
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select Books.BookID, Books.BookName,Books.Genre,Books.Author,Books.Publisher, Books.Row,Books.Shelf, IssuedBook.UserID from Books left outer join IssuedBook on Books.BookID= IssuedBook.BookID;",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
        
            
            
         
            String Row[];
            String Check="";
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    if(i==colnum)
                    {
                        if(rs.getString(i)==null)
                            Row[i-1]="Not Issued";
                        else
                            Row[i-1]="Issued";
                        System.out.println(rs.getString(i));
                    }
                  else
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        NameRadio = new javax.swing.JRadioButton();
        AuthorRadio = new javax.swing.JRadioButton();
        ALL = new javax.swing.JRadioButton();
        NotIssued = new javax.swing.JRadioButton();
        SearchField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        ShowALL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Book ID", "Name", "Genre", "Author", "Publisher", "Shelf", "Row", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false,  false,false
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

        AuthorRadio.setText("Author");
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

        NotIssued.setText("NOT ISSUED");
        NotIssued.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotIssuedActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        ShowALL.setText("Show All");
        ShowALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowALLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(698, 698, 698)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(NameRadio)
                        .addGap(30, 30, 30)
                        .addComponent(AuthorRadio)
                        .addGap(308, 308, 308)
                        .addComponent(ALL)
                        .addGap(40, 40, 40)
                        .addComponent(NotIssued)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(ShowALL))
                .addGap(122, 122, 122)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Search)
                .addGap(288, 288, 288))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameRadio)
                    .addComponent(AuthorRadio)
                    .addComponent(ALL)
                    .addComponent(NotIssued))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search)
                    .addComponent(ShowALL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        
        if(SearchField.getText()=="")
      JOptionPane.showMessageDialog(UserViewBook.this, "Search Filed is Empty","Search Error!", JOptionPane.ERROR_MESSAGE);

        if(!ALL.isSelected())
            if(!NotIssued.isSelected())
            ALL.setEnabled(true);
        
        int flag=0;
        if(ALL.isSelected())
            flag=0;
        if(NotIssued.isSelected())
            flag=1;
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        while(model.getRowCount()>0)
            model.removeRow(model.getRowCount()-1);
        if(NameRadio.isSelected())
        {
       
            String Search = "%"+SearchField.getText()+"%";
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select A.BookID, A.BookName,A.Genre,A.Author,A.Publisher, A.Row,A.Shelf, IssuedBook.UserID from (select * from Books where BookName like ?) as A left outer join IssuedBook on A.BookID= IssuedBook.BookID",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setString(1, Search);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
            
           
     
            
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    if(i==colnum)
                    {
                        if(rs.getString(i)==null)
                        {
                            Row[i-1]="Not Issued";
                            model.addRow(Row);
                        }
                        else
                        {
                            if(flag==1)
                                continue;
                            Row[i-1]="Issued";
                            model.addRow(Row);
                            
                        }
                        
            
                        
                        System.out.println(rs.getString(i));
                    }
                  else
                    Row[i-1]=rs.getString(i);
                
                        
                    }
        
               
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
            PreparedStatement ps=Con.prepareStatement("select A.BookID, A.BookName,A.Genre,A.Author,A.Publisher, A.Row,A.Shelf, IssuedBook.UserID from (select * from Books where Author like ?) as A left outer join IssuedBook on A.BookID= IssuedBook.BookID",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setString(1, Search);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
            
           
     
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    if(i==colnum)
                    {
                        if(rs.getString(i)==null)
                        {
                            Row[i-1]="Not Issued";
                            model.addRow(Row);
                        }
                        else
                        {
                            if(flag==1)
                                continue;
                            Row[i-1]="Issued";
                            model.addRow(Row);
                        }
                        System.out.println(rs.getString(i));
                    }
                  else
                    Row[i-1]=rs.getString(i);
                    }
          
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
            
				JOptionPane.showMessageDialog(UserViewBook.this, "Select Name or Author","No Selection!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void AuthorRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorRadioActionPerformed
        // TODO add your handling code here:
        NameRadio.setSelected(false);
    }//GEN-LAST:event_AuthorRadioActionPerformed

    private void NameRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameRadioActionPerformed
        // TODO add your handling code here:
        AuthorRadio.setSelected(false);
    }//GEN-LAST:event_NameRadioActionPerformed

    private void ALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALLActionPerformed
        // TODO add your handling code here:
        NotIssued.setSelected(false);
      
    }//GEN-LAST:event_ALLActionPerformed

    private void NotIssuedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotIssuedActionPerformed
        // TODO add your handling code here:
        ALL.setSelected(false);
        
    }//GEN-LAST:event_NotIssuedActionPerformed

    private void ShowALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowALLActionPerformed
        // TODO add your handling code here:
        AuthorRadio.setSelected(false);
        NameRadio.setSelected(false);
          DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
         while(model.getRowCount()>0)
            model.removeRow(model.getRowCount()-1);
         
         
         if(!ALL.isSelected()&&!NotIssued.isSelected())
         {
             ALL.setSelected(true);
         }
         
         
         int flag=0;
         if(ALL.isSelected())
             flag=0;
         if(NotIssued.isSelected())
             flag=1;
       
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select Books.BookID, Books.BookName,Books.Genre,Books.Author,Books.Publisher, Books.Row,Books.Shelf, IssuedBook.UserID from Books left outer join IssuedBook on Books.BookID= IssuedBook.BookID;",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
        
            
            
         
            String Row[];
            String Check="";
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    if(i==colnum)
                    {
                         if(rs.getString(i)==null)
                        {
                            Row[i-1]="Not Issued";
                            model.addRow(Row);
                        }
                        else
                        {
                            if(flag==1)
                                continue;
                            Row[i-1]="Issued";
                            model.addRow(Row);
                        }
                        System.out.println(rs.getString(i));
                    }
                  else
                    Row[i-1]=rs.getString(i);
            
                    }
                  
            }
   
                   
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    }
    }//GEN-LAST:event_ShowALLActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserViewBook().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserViewBook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ALL;
    private javax.swing.JRadioButton AuthorRadio;
    private javax.swing.JRadioButton NameRadio;
    private javax.swing.JRadioButton NotIssued;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton ShowALL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
