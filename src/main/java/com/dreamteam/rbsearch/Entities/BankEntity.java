package com.dreamteam.rbsearch.Entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity(name = "entity_name")
@AllArgsConstructor
@NoArgsConstructor
public class BankEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int price;

}
