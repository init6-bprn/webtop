package ru.bprn.webtop.data.entity;

import lombok.Data;
import lombok.ToString;
import ru.bprn.webtop.data.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@ToString (exclude = "printMashine")
@Entity
public class QuantityColors extends AbstractEntity {

    private String name;

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "quantityColors")
    private Set<PrintMashine> printMashine;

    public QuantityColors(){};

    public  QuantityColors(String name) {
        this.name = name;
    }

}
