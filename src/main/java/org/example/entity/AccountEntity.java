package org.example.entity;

public class AccountEntity {

    private int id;
    private String acc_name;
    private double balance;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", acc_name='" + acc_name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
