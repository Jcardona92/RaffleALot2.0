package edu.csudh.jcardona2toromail.rafflealot20;

/**
 * Created by akajo on 4/1/2017.
 */

public class Payment {
    String NameofCard;
    int CardNum;
    int SecurityCode;
    int exp_date;
    double balance =200.00;

    public Payment(String nameofCard, int cardNum, int securityCode, int exp_date) {
        NameofCard = nameofCard;
        CardNum = cardNum;
        SecurityCode = securityCode;
        this.exp_date = exp_date;
    }

    public void depositmoney(double money){
        balance = balance + money;
    }

    public String getNameofCard() {
        return NameofCard;
    }

    public int getCardNum() {
        return CardNum;
    }

    public int getSecurityCode() {
        return SecurityCode;
    }

    public int getExp_date() {
        return exp_date;
    }

    public double getBalance() {
        return balance;
    }

    public void charging(double price){
        if(balance< 0){
            System.out.println("Add some money to your account");
        }else{
            balance = balance - price;
            System.out.println("Transaction Completed ");
        }

    }

    @Override
    public String toString() {
        return "paymentprocess{" +
                "NameofCard='" + NameofCard + '\'' +
                ", CardNum=" + CardNum +
                ", SecurityCode=" + SecurityCode +
                ", exp_date=" + exp_date +
                ", balance=" + balance +
                '}';
    }

    public void setNameofCard(String nameofCard) {
        NameofCard = nameofCard;
    }

    public void setCardNum(int cardNum) {
        CardNum = cardNum;
    }

    public void setSecurityCode(int securityCode) {
        SecurityCode = securityCode;
    }

    public void setExp_date(int exp_date) {
        this.exp_date = exp_date;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
