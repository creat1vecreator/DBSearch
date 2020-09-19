package com.dreamteam.rbsearch.entities;

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
    private Integer price;

    @Column
    private String app;

}
