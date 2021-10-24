package ru.bprn.webtop.data.entity;

import ru.bprn.webtop.data.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class QuantityColors extends AbstractEntity {
    @ManyToOne
    private String name;
}
