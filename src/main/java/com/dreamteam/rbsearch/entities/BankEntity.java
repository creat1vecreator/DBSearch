package com.dreamteam.rbsearch.entities;

import lombok.*;

import javax.persistence.*;

// name of data table // bank_list_table abd bank_entity_list

@Data
//@Entity(name = "bank_list_table")
@Entity(name = "bank_entity_list")
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
