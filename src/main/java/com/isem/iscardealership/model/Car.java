package com.isem.iscardealership.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "brand")
    @Enumerated(EnumType.STRING)
    private Brand brand;
    @Column(name = "horsepower")
    private int horsePower;
    @Column(name = "price")
    private int price;
    @Column(name = "enginetype")
    @Enumerated(EnumType.STRING)
    private EngineType engineType;


}
