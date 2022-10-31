package com.drozdova.tms.lib6;

public class CreditCard {
    private int accountNumber;
    private int summ;

    public CreditCard(int accountNumber, int summ) {
        this.accountNumber = accountNumber;
        this.summ = summ;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    public void putMoney(int money) {
        summ += money;
    }

    public void withdrawMoney(int money) {
        if (summ < money) {
            System.out.println("Not enough money...");
        } else {
            summ -= money;
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accountNumber=" + accountNumber +
                ", summ=" + summ +
                '}';
    }
}
