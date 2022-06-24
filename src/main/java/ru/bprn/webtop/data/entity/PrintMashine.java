package ru.bprn.webtop.data.entity;

import ru.bprn.webtop.data.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
public class PrintMashine extends AbstractEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "id")
    private TypeOfPrinter typeOfPrinterSet;

    @ManyToOne
    @JoinColumn(name = "id")
    private QuantityColors quantityColorsSet;


    public PrintMashine() {
    }

}
