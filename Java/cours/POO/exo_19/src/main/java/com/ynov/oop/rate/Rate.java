package com.ynov.oop.rate;

public class Rate {
    private String fromCurrency;
    private String toCurrency;
    private Double rate;

    public Rate(String from, String to, Double rate) {
        this.fromCurrency = from;
        this.toCurrency = to;
        this.rate = rate;
    }

    public String getFrom() {
        return this.fromCurrency;
    }

    public String getTo() {
        return this.toCurrency;
    }

    public Double getRate() {
        return this.rate;
    }
}
