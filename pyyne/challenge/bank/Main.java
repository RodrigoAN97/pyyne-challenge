package com.pyyne.challenge.bank;

public class Main {
    public static void main(String[] args) {
        new BankController().printBalances();
        new BankController().printTransactions();
    }
}
