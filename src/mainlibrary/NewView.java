
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


public class NewView extends javax.swing.JFrame {

   
    public NewView() throws SQLException {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        initComponents();
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
       
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from Books,IssuedBook where Books.BookID=IssuedBook.BookID;",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        NameRadio = new javax.swing.JRadioButton();
        BookIDRadio = new javax.swing.JRadioButton();
        ALL = new javax.swing.JRadioButton();
        SearchField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        UserIDRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Book ID","User ID", "Book Name", "Issued Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("Issued Books");

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

        BookIDRadio.setText("BookID");
        BookIDRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIDRadioActionPerformed(evt);
            }
        });

        ALL.setText("ALL");
        ALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALLActionPerformed(evt);
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

        UserIDRadio.setText("UserID");
        UserIDRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addComponent(NameRadio)
                                .addGap(47, 47, 47)
                                .addComponent(BookIDRadio)
                                .addGap(43, 43, 43)
                                .addComponent(UserIDRadio)
                                .addGap(46, 46, 46)
                                .addComponent(ALL)
                                .addGap(57, 57, 57)
                                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Search))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(699, 699, 699)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(662, 662, 662)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameRadio)
                    .addComponent(BookIDRadio)
                    .addComponent(ALL)
                    .addComponent(UserIDRadio)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
        LibrarianSuccess.ThisLogined.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
       
        
                    DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        while(model.getRowCount()>0)
            model.removeRow(model.getRowCount()-1);
        if(NameRadio.isSelected())
        {
       
            String Search = "%"+SearchField.getText()+"%";
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from Books,IssuedBook where Books.BookID=IssuedBook.BookID and Books.BookName like ?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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
                NoRow[1]="NO";
                NoRow[2]="RESULT";
                NoRow[0]="";
                NoRow[3]="";
                NoRow[4]="";
                NoRow[5]="";
                NoRow[6]="";
                model.addRow(NoRow);
                
                
            }
   
                    
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    } }
        
        else if(BookIDRadio.isSelected())
        {
            
       
            String Search = SearchField.getText();
            int BookIDV;
        BookIDV = Integer.parseInt(Search);
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from Books,IssuedBook where Books.BookID=IssuedBook.BookID and IssuedBook.BookID=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setInt(1,BookIDV);
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
                NoRow[1]="NO";
                NoRow[2]="RESULT";
                NoRow[0]="";
                NoRow[3]="";
                NoRow[4]="";
                NoRow[5]="";
                NoRow[6]="";
                model.addRow(NoRow);
                
                
            }
   
                    
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    }
        }
         else if(UserIDRadio.isSelected())
        {
       
     
            String Search = SearchField.getText();
            int UserIDV;
        UserIDV = Integer.parseInt(Search);
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from Books,IssuedBook where Books.BookID=IssuedBook.BookID and IssuedBook.UserID=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setInt(1,UserIDV);
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
                NoRow[1]="NO";
                NoRow[2]="RESULT";
                NoRow[0]="";
                NoRow[3]="";
                NoRow[4]="";
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
            
				JOptionPane.showMessageDialog(NewView.this, "Select Name or Author","No Selection!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void BookIDRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIDRadioActionPerformed
       
        NameRadio.setSelected(false);
        ALL.setSelected(false);
        UserIDRadio.setSelected(false);
    }//GEN-LAST:event_BookIDRadioActionPerformed

    private void NameRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameRadioActionPerformed
       
        BookIDRadio.setSelected(false);
        ALL.setSelected(false);
        UserIDRadio.setSelected(false);
        
    }//GEN-LAST:event_NameRadioActionPerformed

    private void ALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALLActionPerformed
        
        SearchField.setText("");
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        while(model.getRowCount()>0)
            model.removeRow(model.getRowCount()-1);
          try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from Books,IssuedBook where Books.BookID=IssuedBook.BookID;",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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

    private void UserIDRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDRadioActionPerformed
       
        ALL.setSelected(false);
        NameRadio.setSelected(false);
        BookIDRadio.setSelected(false);    
    }//GEN-LAST:event_UserIDRadioActionPerformed

   
    public static void main(String args[]) {
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NewView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ALL;
    private javax.swing.JRadioButton BookIDRadio;
    private javax.swing.JRadioButton NameRadio;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JRadioButton UserIDRadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
