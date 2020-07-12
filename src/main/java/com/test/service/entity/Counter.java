package com.test.service.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "counter")
@Data
@NoArgsConstructor
public class Counter {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column
    private String name;

    @Column(name = "value")
    private Integer value;
}
