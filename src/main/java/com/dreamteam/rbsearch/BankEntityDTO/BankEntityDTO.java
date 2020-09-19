package com.dreamteam.rbsearch.BankEntityDTO;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
public class BankEntityDTO {

    public BankEntityDTO(Integer price, String app) {
        this.price = price;
        this.app = app;
    }

    private Long id;

    private String name;

    private Integer price;

    private String app;


}
