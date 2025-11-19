package org.example.prog5_wallet.entity;

public class Wallet {
    private String color;
    private boolean portCard;
    private double mass;
    private String brand;
    private double account;

    public void getMoney(double montant) {
        account -= montant;
    }
    public void addMoney(double montant) {
        account += montant;
    }
    public double checkMoney() {
        return account;
    }
    //public void addCard();
    public void lostMoney(double montant){
        account -= montant;
    }
}
