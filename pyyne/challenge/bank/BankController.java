package com.pyyne.challenge.bank;

import com.pyyne.challenge.bank.AdaptersImpl.Bank1AdapterImpl;
import com.pyyne.challenge.bank.AdaptersImpl.Bank2AdapterImpl;

/**
 * Controller that pulls information form multiple bank integrations and prints them to the console.
 *
 * Created by Par Renyard on 5/12/21.
 */
public class BankController {

    public void printBalances() {
    	System.out.println("BANK 1: " + new Bank1AdapterImpl().getBankBalance() + new Bank1AdapterImpl().getBankCurrency());
    	System.out.println("BANK 2: " + new Bank2AdapterImpl().getBankBalance() + new Bank2AdapterImpl().getBankCurrency());
    }

    public void printTransactions() {
    	System.out.println(new Bank1AdapterImpl().getTransactionsInfo());
    	System.out.println(new Bank2AdapterImpl().getTransactionsInfo());
    }
}
