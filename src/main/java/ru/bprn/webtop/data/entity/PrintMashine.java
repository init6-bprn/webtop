package ru.bprn.webtop.data.entity;

import lombok.Data;
import ru.bprn.webtop.data.AbstractEntity;

import javax.persistence.*;

@Data
@Entity
public class PrintMashine extends AbstractEntity {

    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "type_of_printer", nullable = false )
    private TypeOfPrinter typeOfPrinter;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "quantity_colors_id", nullable = false)
    private QuantityColors quantityColors;


    public PrintMashine() {
    }

}
