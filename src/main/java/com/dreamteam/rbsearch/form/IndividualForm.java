package com.dreamteam.rbsearch.form;

import lombok.Data;

import java.util.Arrays;

@Data
public class IndividualForm {
    private Integer price;
    private String app;

    public IndividualForm(String price, String app) {
        this.price = Integer.parseInt(price);
        this.app = app == null ? "" : masterApp(app);
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
        return "price: " + this.price + "\n" +
               "app: "   + this.app + "\n";
    }
}
