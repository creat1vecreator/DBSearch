package com.dreamteam.rbsearch.form;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Setter
@Getter
public class BankForm {
    private String price;
    private String app;
    private Map<String, Object> formFromModel;

    public BankForm (Map<String, Object> map) {
        this.formFromModel = map;
//        this.price = map.get("price").toString();
//        this.app = map.get("app").toString();
        for (Map.Entry<String, Object> entry : formFromModel.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
