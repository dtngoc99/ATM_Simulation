/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_demo;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGOC TY
 */
public class JFrameATM extends javax.swing.JFrame{
    Account acc=new Account();
    ArrayList<Account> accountList=new ArrayList<>();
    /**
     * Creates new form JFrameATM
     */
    public JFrameATM() {
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tfAccount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnTransaction = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCheckMoney = new javax.swing.JButton();
        tfToTalMoney = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfTranMoney = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        tfName = new javax.swing.JTextField();
        btnLogin = new javax.swing.JToggleButton();

        jLabel6.setText("jLabel6");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Account");

        tfAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfAccountMouseClicked(evt);
            }
        });
        tfAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAccountActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        jLabel3.setText("Transaction");

        btnTransaction.setText("Get Money");
        btnTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransactionMouseClicked(evt);
            }
        });
        btnTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionActionPerformed(evt);
            }
        });

        jLabel4.setText("TransactionMoney");

        btnCheckMoney.setText("CheckMoney");
        btnCheckMoney.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckMoneyMouseClicked(evt);
            }
        });
        btnCheckMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckMoneyActionPerformed(evt);
            }
        });

        tfToTalMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfToTalMoneyActionPerformed(evt);
            }
        });

        jLabel5.setText("MoneyOfCard");

        tfTranMoney.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfTranMoneyMouseClicked(evt);
            }
        });
        tfTranMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTranMoneyActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLoginMouseReleased(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCheckMoney)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(tfToTalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(tfTranMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransaction))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnCheckMoney))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfToTalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTranMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransaction))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAccountActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAccountActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfToTalMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfToTalMoneyActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tfToTalMoneyActionPerformed

    private void tfTranMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTranMoneyActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_tfTranMoneyActionPerformed

    private void btnCheckMoneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckMoneyMouseClicked
        tfToTalMoney.setText(String.valueOf(acc.getTotalMoneyCard()));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckMoneyMouseClicked

    private void jTextArea2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea2AncestorAdded
        tfToTalMoney.setText(String.valueOf(acc.getTotalMoneyCard()));
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea2AncestorAdded

    private void tfTranMoneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTranMoneyMouseClicked
        tfTranMoney.setText("");
        acc.fiveHund=0;
        acc.twoHund=0;
        acc.oneHund=0;
        acc.fift=0;
        acc.tweent=0;
        acc.tent=0;
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTranMoneyMouseClicked

    private void tfAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfAccountMouseClicked
        tfAccount.setText("");
        tfPassword.setText("");
        tfName.setText("");
        tfToTalMoney.setText("");
        tfTranMoney.setText("");
        jTextArea2.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_tfAccountMouseClicked

    private void btnCheckMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckMoneyActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if(btnLogin.getText()=="LogOut"){
            tfAccount.setText("");
            tfPassword.setText("");
            tfName.setText("");
            tfToTalMoney.setText("");
            tfTranMoney.setText("");
            jTextArea2.setText("");
            btnLogin.setText("Login");
            acc.setTotalMoneyCard(0);
            acc.setAccountName("");
            acc.setAccountNumber(0);
            acc.setCardType("");
            acc.setPassword(0);
            return;
        }
        try {
            accountList.clear();
            Scanner scan;
            scan = new Scanner(Paths.get("E:\\ATM\\ATM_Simulation\\ATM.txt"),"UTF-8");
            while(scan.hasNextLine()){
            Account ac=new Account();
            ac.setAccountNumber(scan.nextInt());
            ac.setPassword(scan.nextInt());
            ac.setTotalMoneyCard(scan.nextInt());
            ac.setAccountName(scan.nextLine());
            StringTokenizer token=new StringTokenizer(ac.getAccountName(),",");
            ac.setAccountName(token.nextToken());
            ac.setCardType(token.nextToken());
            accountList.add(ac);
        }
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(JFrameATM.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(tfAccount.getText().trim().length()>0 && tfPassword.getText().trim().length()>0){
            acc.fiveHund=0;
            acc.twoHund=0;
            acc.oneHund=0;
            acc.fift=0;
            acc.tweent=0;
            acc.tent=0;
            jTextArea2.setText("");
            acc.setAccountNumber(Integer.parseInt(tfAccount.getText()));
            acc.setPassword(Integer.parseInt(tfPassword.getText()));
            Boolean kt=false;
            for(Account a: accountList){
                if(acc.getAccountNumber()==a.getAccountNumber() && acc.getPassword()==a.getPassword())
                {
                    tfName.setText(a.getAccountName());
                    acc.setTotalMoneyCard(a.getTotalMoneyCard());
                    acc.setCardType(a.getCardType());
                    btnLogin.setText("LogOut");
                    kt=true;
                }
            }
            if(kt==false){
                jTextArea2.setText("Tài khoản không đúng");
            }
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransactionActionPerformed

    private void btnTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransactionMouseClicked
        // TODO add your handling code here:
        if(tfTranMoney.getText().trim().length()>0){
            acc.transactionMoney=Integer.parseInt(tfTranMoney.getText().trim());
            if(acc.transactionMoney==0) return;
            if(acc.totalMoney==0 || acc.getTotalMoneyCard()<10000 || acc.transactionMoney>acc.getTotalMoneyCard()||acc.transactionMoney%10000!=0){
                jTextArea2.setText("Không thể giao dịch");
                return;
            }
            if("Agribank".equals(acc.getCardType())){
                acc.cost=1100;
            }
            else{
                acc.cost=3300;
            }
            if(acc.transactionMoney+acc.cost>acc.getTotalMoneyCard()){
                jTextArea2.setText("Không thể giao dịch");
                return;
            }

            acc.Withdrawal();
            acc.setTotalMoneyCard( acc.getTotalMoneyCard()-acc.transactionMoney-acc.cost);
            String valu="";
            if(acc.fiveHund>0){
               valu+=("Denominations 500,000: "+String.valueOf(acc.fiveHund)+"\n"); 
            }
            if(acc.twoHund>0){
                valu+=("Denominations 200,000: "+String.valueOf(acc.twoHund)+"\n");
            }
            if(acc.oneHund>0){
                valu+=("Denominations 100,000: "+String.valueOf(acc.oneHund)+"\n");
            }
            if(acc.fift>0){
                valu+=("Denominations 50,000: "+String.valueOf(acc.fift)+"\n");
            }
            if(acc.tweent>0){
                valu+=("Denominations 20,000: "+String.valueOf(acc.tweent)+"\n");
            }
            if(acc.tent>0){
                valu+=("Denominations 10,000: "+String.valueOf(acc.tent)+"\n");
            }
            valu+=("Cost: "+String.valueOf(acc.cost));
            jTextArea2.setText(valu);
            tfToTalMoney.setText(String.valueOf(acc.getTotalMoneyCard()));

        }
        
    }//GEN-LAST:event_btnTransactionMouseClicked

    private void btnLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginMouseReleased

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameATM().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckMoney;
    private javax.swing.JToggleButton btnLogin;
    private javax.swing.JButton btnTransaction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField tfAccount;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfToTalMoney;
    private javax.swing.JTextField tfTranMoney;
    // End of variables declaration//GEN-END:variables
}
