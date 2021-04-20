/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_demo;

import java.util.Scanner;

/**
 *
 * @author NGOC TY
 */
public class Account extends Transaction{
    private int accountNumber;
    private String accountName;
    private int totalMoneyCard=0000000;
    private String cardType;
    private int password;

    public String getCardType() {
        return cardType;
    }
    
    public int getTotalMoneyCard() {
        return totalMoneyCard;
    }

    public int getPassword() {
        return password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setTotalMoneyCard(int totalMoneyCard) {
        this.totalMoneyCard = totalMoneyCard;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    
    Scanner scan=new Scanner(System.in);
    @Override
    public void input(){
        System.out.println("AccountNumber: ");
        this.accountNumber=scan.nextInt();
        System.out.println("AccountName: ");
        this.accountName=scan.nextLine();
//        System.out.println("TotalMoney: ");
//        this.totalMoneyCard=scan.nextInt();
        scan.nextLine();
        System.out.println("CardType: ");
        this.cardType=scan.nextLine();
        if("Agribank".equals(cardType)) super.cost=1100;
        else{
            super.cost=3300;
        }
        System.out.println("Password: ");
        this.password=scan.nextInt();
        super.input();
    }
    public void output(){
        System.out.println("AccountNumber: " +this.accountNumber);
        System.out.println("AccountName: " +this.accountName);
        System.out.println("TotalMoney: " +this.totalMoneyCard);
        System.out.println("CardType: " +this.cardType);
        System.out.println("Password: " +this.password);
        if(this.totalMoneyCard<super.transactionMoney){
            System.out.println("Không thể thực hiện");
            return;
        }
        super.Withdrawal();
        this.totalMoneyCard-=(cost+super.transactionMoney);
        System.out.println("Tổng tiền còn lại: "+this.totalMoneyCard);
    }
    
}
