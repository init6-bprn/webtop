package ru.bprn.webtop.views.helloworld;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import ru.bprn.webtop.data.AbstractEntity;
import ru.bprn.webtop.data.entity.PrintMashine;
import ru.bprn.webtop.data.service.PrintMashineService;
import ru.bprn.webtop.views.MainLayout;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@AnonymousAllowed
public class HelloWorldView extends HorizontalLayout {

    private Grid<PrintMashine> grid = new Grid<>(PrintMashine.class);
    private PrintMashineService printMashineService;
    private String name = "";
    private CrudForm form;

    public HelloWorldView(PrintMashineService printMashineService) {
        this.printMashineService = printMashineService;
        addClassName("hello-world-view");
        setSizeFull();
        configureGrid();
        add(grid);
        updateList();
        form = new CrudForm(grid. asSingleSelect().getValue(), PrintMashine.class);
        add (form);

    }
    private void configureGrid() {
        grid.addClassName("printmashine-grid");
        grid.setSizeFull();

        grid.asSingleSelect().addValueChangeListener(event ->
                editContact(event.getValue()));

    }

    public <T extends AbstractEntity> void editContact(T contact) {
        if (contact == null) {
            closeEditor();
        } else {
            form.setData(contact);
            form.setVisible(true);
            addClassName("editing");
        }
    }
    private void closeEditor() {
        form.setData(null);
        form.setVisible(false);
        removeClassName("editing");
    }

    private  void updateList (){
        grid.setItems(printMashineService.findAll());
    }

}
