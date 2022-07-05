package ru.bprn.webtop.views.helloworld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import ru.bprn.webtop.data.AbstractEntity;


import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class CrudForm extends FormLayout {

    Button save = new Button("Save");
    Button delete = new Button("Delete");
    Button close = new Button("Cancel");
    private Object ent;

    public CrudForm(Class<? extends AbstractEntity>  entity) {

        List<Field> fields = Arrays.stream(entity.getDeclaredFields()).toList();
        for (Field field: fields
        ) {


            add(new TextField(field.getName()));
            }
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
        close.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        add( new HorizontalLayout(save, delete, close));

    }

    public <T> void setData (T ent) {
        this.ent = ent;
    }
}
