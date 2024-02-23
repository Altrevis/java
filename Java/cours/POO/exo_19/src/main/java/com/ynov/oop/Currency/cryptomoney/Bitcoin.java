package com.ynov.oop.Currency.cryptomoney;

import com.ynov.oop.Currency.CryptoCurrency;

public class Bitcoin implements CryptoMoney, CryptoCurrency{
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
    public void mining() {
        owned += 6.5;
    }
}
