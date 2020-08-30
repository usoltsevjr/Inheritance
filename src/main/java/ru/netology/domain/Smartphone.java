package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(){}

    public Smartphone(int id, String name, int price, String manufacturer){
        super(id, name, price);
        this.manufacturer = manufacturer;
    }
}
