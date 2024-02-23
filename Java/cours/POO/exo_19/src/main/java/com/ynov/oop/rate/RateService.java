package com.ynov.oop.rate;

import java.util.ArrayList;

public class RateService {
    private ArrayList<Rate> rates;

    public RateService() {
        rates = new ArrayList<>();
        this.rates.add(new Rate("Bitcoin", "Bitcoin", 1.0));
        this.rates.add(new Rate("Bitcoin", "Ethereum", 19.63));
        this.rates.add(new Rate("Bitcoin", "Dollar", 43632.0));
        this.rates.add(new Rate("Bitcoin", "Euro", 39679.0));
        this.rates.add(new Rate("Ethereum", "Bitcoin", 0.05));
        this.rates.add(new Rate("Ethereum", "Ethereum", 1.0));
        this.rates.add(new Rate("Ethereum", "Dollar", 2225.0));
        this.rates.add(new Rate("Ethereum", "Euro", 2024.0));
        this.rates.add(new Rate("Dollar", "Bitcoin", 0.000023));
        this.rates.add(new Rate("Dollar", "Ethereum", 0.00045));
        this.rates.add(new Rate("Dollar", "Dollar", 1.0));
        this.rates.add(new Rate("Dollar", "Euro", 0.91));
        this.rates.add(new Rate("Euro", "Bitcoin", 0.000025));
        this.rates.add(new Rate("Euro", "Ethereum", 0.00049));
        this.rates.add(new Rate("Euro", "Dollar", 1.10));
        this.rates.add(new Rate("Euro", "Euro", 1.0));
    }

    public Double convert(String from, String to, Double amount) {
        for(Rate rate: rates) {
            if(rate.getFrom().equals(from) && rate.getTo().equals(to)) {
                return amount * rate.getRate();
            }
        }
        return 0.0;
    }
}
