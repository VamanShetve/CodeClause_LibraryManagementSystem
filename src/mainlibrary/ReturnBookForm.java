
package mainlibrary;

import java.util.Calendar;
import javax.swing.JOptionPane;


public class ReturnBookForm extends javax.swing.JFrame {

    
    public ReturnBookForm() {
        initComponents();
           Calendar cal = Calendar.getInstance();

        IDate.setText(String.valueOf(cal.get(Calendar.DATE)));
        IMonth.setText(String.valueOf(cal.get(Calendar.MONTH)+1));
        IYear.setText(String.valueOf(cal.get(Calendar.YEAR)));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        UserID = new javax.swing.JTextField();
        BookID = new javax.swing.JTextField();
        IMonth = new javax.swing.JTextField();
        IYear = new javax.swing.JTextField();
        IDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel1.setText("Book ID");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel2.setText("User ID");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel4.setText("Return Date");

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });

        BookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIDActionPerformed(evt);
            }
        });

        IMonth.setEditable(false);
        IMonth.setBackground(new java.awt.Color(224, 218, 213));

        IYear.setEditable(false);
        IYear.setBackground(new java.awt.Color(224, 218, 213));
        IYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IYearActionPerformed(evt);
            }
        });

        IDate.setEditable(false);
        IDate.setBackground(new java.awt.Color(224, 218, 213));
        IDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel7.setText("-");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel8.setText("-");

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel3.setText("Return Book");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(IDate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IYear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(IMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(IYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int BookIDV;
        BookIDV = Integer.parseInt(BookID.getText());
        int UserIDV;
        UserIDV = Integer.parseInt(UserID.getText());
        
        String IFDate = IYear.getText() + "-"+IMonth.getText()+"-"+IDate.getText();
        System.out.println(IFDate);
      
     
        
        if(TransBookDao.BookValidate(BookID.getText()) && TransBookDao.UserValidate(UserID.getText()))
        {
               if(TransBookDao.CheckIssuedBook(BookIDV))
               {
                   
                   if(TransBookDao.ReturnBook(BookIDV, UserIDV)!=0)
                   {
                        JOptionPane.showMessageDialog(ReturnBookForm.this, "Book is returned by the User!","Returning Book Successfull!", JOptionPane.ERROR_MESSAGE);
                        UserID.setText("");
                        BookID.setText("");
                   }
                   else
                        JOptionPane.showMessageDialog(ReturnBookForm.this, "Unable to Return Book!","Returning Book Error!", JOptionPane.ERROR_MESSAGE);
                       
               }
               else
                JOptionPane.showMessageDialog(ReturnBookForm.this, "The Book  is NOT Issued by THIS User!","Issuing Book Error!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {    if(TransBookDao.UserValidate(UserID.getText()))
                    JOptionPane.showMessageDialog(ReturnBookForm.this, "The Book  is NOT available in Library Database!","Returning Book Error!", JOptionPane.ERROR_MESSAGE);
             else
                if(TransBookDao.BookValidate(BookID.getText()))
                    JOptionPane.showMessageDialog(ReturnBookForm.this, "The User is NOT available in Library Database!","Returning Book Error!", JOptionPane.ERROR_MESSAGE);
                 else
            JOptionPane.showMessageDialog(ReturnBookForm.this, "The Book  and User are NOT available in Library Database!","Returning Book Error!", JOptionPane.ERROR_MESSAGE);
       
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        this.dispose();
        LibrarianSuccess.ThisLogined.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        
    }//GEN-LAST:event_UserIDActionPerformed

    private void IYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IYearActionPerformed
        
    }//GEN-LAST:event_IYearActionPerformed

    private void BookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIDActionPerformed
        
    }//GEN-LAST:event_BookIDActionPerformed

    private void IDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDateActionPerformed
       
    }//GEN-LAST:event_IDateActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookID;
    private javax.swing.JTextField IDate;
    private javax.swing.JTextField IMonth;
    private javax.swing.JTextField IYear;
    private javax.swing.JTextField UserID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
