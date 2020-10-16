package com.dreamteam.rbsearch.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Deprecated
@Data
@Entity(name = "individual_bank_list")
@AllArgsConstructor
@NoArgsConstructor
public class IndividualEntity_old extends BaseEntity {

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
