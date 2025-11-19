package org.example.prog5_wallet.entity;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private String color;
    private double mass;
    private String brand;
    private double account;

    private List<String> porteCards = new ArrayList<>();

    public void getMoney(double montant) {
        account -= montant;
    }
    public void addMoney(double montant) {
        account += montant;
    }
    public double checkMoney() {
        return account;
    }

    public void addCard(String card) {
        porteCards.add(card);
    }
        
    public void lostMoney(double montant){
        account -= montant;
    }
}
