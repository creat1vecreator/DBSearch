package com.dreamteam.rbsearch.form;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankForm {
    private String price;
    private String app;

    public BankForm(String price, String app) {
        this.price = price;
        this.app = app;
    }

    @Override
    public String toString() {
        return "price:" + this.price + "\n" +
                "app:" + this.app;

    }
}
