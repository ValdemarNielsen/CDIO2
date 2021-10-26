package spil;

import java.util.*;
import java.lang.*;

public class Account {

    //En klasse "Account" som er vores to spillere skal bruge til at holde styr på deres beholdning af point, hvor der
    //gives og fratrækkes point efter hvilket felt man lander på.

    //Spillerne starter med en pengebeholdning på 1000.- og spiller lander på felterne hvor der gives og trækkes point
    //indtil man når en pengebeholdning på 3000.-

    private int startbal = 1000;
    private int balance;


    public Account() {
        this.balance = startbal;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void newBalance (int ubalance){
        this.balance += ubalance;
        
        if(this.balance < 0){
            this.balance = 0;
        }

    }


}