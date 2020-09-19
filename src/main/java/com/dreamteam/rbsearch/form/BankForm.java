package com.dreamteam.rbsearch.form;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Map;

@Setter
@Getter
public class BankForm {
    private String price;
    private String app;
    private Map<String, Object> formFromModel;

//    public BankForm (Map<String, Object> map) {
//        this.formFromModel = map;
////        this.price = map.get("price").toString();
////        this.app = map.get("app").toString();
//        for (Map.Entry<String, Object> entry : formFromModel.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }

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
