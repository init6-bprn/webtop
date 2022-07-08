package ru.bprn.webtop.views.helloworld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import ru.bprn.webtop.data.AbstractEntity;


import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class CrudForm extends FormLayout {

    private final Button save = new Button("Save");
    private final Button delete = new Button("Delete");
    private final Button close = new Button("Cancel");
    private AbstractEntity entity;

    public <T extends AbstractEntity> CrudForm(T entity, Class<? extends AbstractEntity> classe) {

        this.entity = entity;

        List<Field> fields = Arrays.stream(classe.getDeclaredFields()).toList();
        String o;
        for (Field field: fields
        ) {
            o = field.getType().getName();
            if (o.contains("String")) add(new TextField(field.getName()));
            if (o.contains("entity")) add(new ComboBox<>(field.getName()));
        }

        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
        close.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        add( new HorizontalLayout(save, delete, close));

    }

    public <T extends AbstractEntity> void setData (T ent) {
        this.entity = ent;
    }
}
