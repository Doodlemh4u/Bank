package net.doodle;

public class account {

    public double total = 0.0;

    public account (double total){

        this.total = total;

    }

    public void deposit(double amount){
        total = total + amount;
    }

    public void withdraw(double amount){
        total = total - amount;
    }
}
