package ru.bprn.webtop.data.entity;

import ru.bprn.webtop.data.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class PrintMashine extends AbstractEntity {

    private String name;
    private Set<TypeOfPrinter> typeOfPrinterSet;
    private Set<QuantityColors> quantityColorsSet;


    public PrintMashine() {
    }

}
