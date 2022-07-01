package ru.bprn.webtop.data.entity;

import lombok.Data;
import ru.bprn.webtop.data.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class TypeOfPrinter extends AbstractEntity {
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "typeOfPrinter")
    private List<PrintMashine> printMashine;

    public TypeOfPrinter(){};

    public TypeOfPrinter (String name) {
        this.name = name;
    }

}
