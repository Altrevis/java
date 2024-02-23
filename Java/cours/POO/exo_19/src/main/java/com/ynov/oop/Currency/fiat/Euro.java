package com.ynov.oop.Currency.fiat;

import com.ynov.oop.Currency.CryptoCurrency;

public class Euro implements Fiat, CryptoCurrency{
    private Double owned;
    @Override
    public void buy(Double amount) {
        owned += amount;
    }
    @Override
    public void sell(Double amount) {
        owned -= amount;
    }
    @Override
    public void deposit(Double amount) {
        owned += amount;
    }
    @Override
    public void withdraw(Double amount) {
        owned -= amount;
    }
}
