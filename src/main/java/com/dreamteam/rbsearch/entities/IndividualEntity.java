package com.dreamteam.rbsearch.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity(name = "individual_bank_list")
@AllArgsConstructor
@NoArgsConstructor
public class IndividualEntity extends BaseEntity {

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
