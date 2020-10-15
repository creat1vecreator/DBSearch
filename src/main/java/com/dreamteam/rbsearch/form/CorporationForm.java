package com.dreamteam.rbsearch.form;

import lombok.Data;

@Deprecated
@Data
public class CorporationForm {
    private Integer price;

    public CorporationForm(String price) {
        this.price = Integer.parseInt(price);
    }

    @Override
    public String toString() {
        return "price: " + this.price + "\n";
    }
}
