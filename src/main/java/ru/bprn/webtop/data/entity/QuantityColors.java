package ru.bprn.webtop.data.entity;

import ru.bprn.webtop.data.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.LinkedList;
import java.util.List;

@Entity
public class QuantityColors extends AbstractEntity {

    @OneToMany (mappedBy = "colors", fetch = FetchType.EAGER)
    private List<PrintMashine> printMashine = new LinkedList<>();


}
