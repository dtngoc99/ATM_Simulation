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
public class Transaction extends ATM{
    private int tradingCode;//mã giao dịch
    private String tradingName;//tên giao dịch
    protected int transactionMoney;//tiền giao dịch
    protected int cost;//chi phí giao dịch
    final int FIVE_HUNDRED_THOUSAND =500000;
    final int TWO_HUNDRED_THOUSAND =200000;
    final int ONE_HUNDRED_THOUSAND =100000;
    final int FIFTY_THOUSAND =50000;
    final int TWEENTY_THOUSAND =20000;
    final int TEN_THOUSAND =10000;
    protected int fiveHund;//đếm số tờ tiền sẽ rút được theo từng mệnh giá tiền
    protected int twoHund;
    protected int oneHund;
    protected int fift;
    protected int tweent;
    protected int tent;
    
    public void input(){
        do{
            Scanner scan=new Scanner(System.in);
            System.out.println("Nhập số tiền cần rút: ");
            this.transactionMoney=scan.nextInt();
        }while(transactionMoney%10!=0);
    }
    public Boolean check(int a,int b){
        return a<=b;
    }
    public Boolean checkATM(){
        return this.totalMoney>=this.transactionMoney;
    }
    public void Withdrawal(){//rút tiền
        int money=transactionMoney;
        if(checkATM()==false){
            System.out.println("Không thể thực hiện giao dịch.");
            cost=0;
            transactionMoney=0;
            return;
        }
        if(money>=this.FIVE_HUNDRED_THOUSAND){
            fiveHund=money/FIVE_HUNDRED_THOUSAND;
            if(check(fiveHund,this.fiveHundredThousand)){
                this.fiveHundredThousand-=fiveHund;
            }
            else{
                fiveHund=this.fiveHundredThousand;
                this.fiveHundredThousand=0;
            }
            money-=(fiveHund*FIVE_HUNDRED_THOUSAND);
            this.totalMoney-=(fiveHund*FIVE_HUNDRED_THOUSAND);
            System.out.println("Mệnh giá "+this.FIVE_HUNDRED_THOUSAND +":  "+fiveHund);
        }
        if(money>=this.TWO_HUNDRED_THOUSAND){
            twoHund=money/TWO_HUNDRED_THOUSAND;
            if(check(twoHund,this.twoHundredThousand)){
                this.twoHundredThousand-=twoHund;
            }
            else{
                twoHund=this.twoHundredThousand;
                this.twoHundredThousand=0;
            }
            money-=(twoHund*TWO_HUNDRED_THOUSAND);
            this.totalMoney-=(twoHund*TWO_HUNDRED_THOUSAND);
            System.out.println("Mệnh gia "+this.TWO_HUNDRED_THOUSAND+": "+twoHund);
        }
        if(money>=this.ONE_HUNDRED_THOUSAND){
            oneHund=money/ONE_HUNDRED_THOUSAND;
            if(check(oneHund,this.oneHundredThousand)){
                this.oneHundredThousand-=oneHund;
            }
            else{
                oneHund=this.oneHundredThousand;
                this.oneHundredThousand=0;
            }
            money-=(oneHund*ONE_HUNDRED_THOUSAND);
            this.totalMoney-=(oneHund*ONE_HUNDRED_THOUSAND);
            System.out.println("Mệnh giá "+this.ONE_HUNDRED_THOUSAND+": "+oneHund);
        }
        if(money>=this.FIFTY_THOUSAND){
            fift=money/FIFTY_THOUSAND;
            if(check(fift,this.fiftyThousand)){
                this.fiftyThousand-=fift;
            }
            else{
                fift=this.fiftyThousand;
                this.fiftyThousand=0;
            }
            money-=(fift*FIFTY_THOUSAND);
            this.totalMoney-=(fift*FIFTY_THOUSAND);
            System.out.println("Mệnh giá "+this.FIFTY_THOUSAND+": "+fift);
        }
        if(money>=this.TWEENTY_THOUSAND){
            tweent=money/TWEENTY_THOUSAND;
            if(check(tweent,this.tweentyThousand)){
                this.tweentyThousand-=tweent;
            }
            else{
                tweent=this.tweentyThousand;
                this.tweentyThousand=0;
            }
            money-=(tweent*TWEENTY_THOUSAND);
            this.totalMoney-=(tweent*TWEENTY_THOUSAND);
            System.out.println("Mệnh giá "+this.TWEENTY_THOUSAND+": "+tweent);
        }
        if(money>=this.TEN_THOUSAND){
            tent=money/TEN_THOUSAND;
            if(check(tent,this.tenThousand)){
                this.tenThousand-=tent;
            }
            else{
                tent=this.tenThousand;
                this.tenThousand=0;
            }
            money-=(tent*TEN_THOUSAND);
            this.totalMoney-=(tent*TEN_THOUSAND);
            System.out.println("Mệnh giá "+this.TEN_THOUSAND+ ": "+tent);
        }
        System.out.println("Phí dịch vụ: "+cost);
    }
}
