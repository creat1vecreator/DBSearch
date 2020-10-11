package com.dreamteam.rbsearch.form;

import lombok.Data;

@Data
public class LegalEntityForm {
    private Integer price;

    public LegalEntityForm(String price) {
        this.price = Integer.parseInt(price);
    }

    @Override
    public String toString() {
        return "price: " + this.price + "\n";
    }
}
