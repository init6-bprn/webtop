package ru.bprn.webtop.data.entity;

import ru.bprn.webtop.data.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class PrintMashine extends AbstractEntity {

    private String name;
    @OneToMany
    private Set<TypeOfPrinter> typeOfPrinterSet;
    @OneToMany
    private Set<QuantityColors> quantityColorsSet;


    public PrintMashine() {
    }

}
