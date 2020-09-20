package com.dreamteam.rbsearch.form;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter
public class BankForm {
    private String price;
    private String app;

    public BankForm(String price, String app) {
        this.price = price;
        this.app = masterApp(app);
    }

    private String masterApp(String app) {
        String[] apps = app.split(",");
        Arrays.sort(apps);
        StringBuilder ans = new StringBuilder();
        for (String app_item : apps) {
            ans.append(app_item).append(", ");
        }
        return ans.substring(0, ans.length() - 2);
    }

    @Override
    public String toString() {
        return "price: " + this.price +
               "app: "   + this.app;
    }
}
