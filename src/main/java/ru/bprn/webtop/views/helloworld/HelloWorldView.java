package ru.bprn.webtop.views.helloworld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import ru.bprn.webtop.data.entity.PrintMashine;
import ru.bprn.webtop.data.service.PrintMashineService;
import ru.bprn.webtop.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@AnonymousAllowed
public class HelloWorldView extends HorizontalLayout {

    private Grid<PrintMashine> grid = new Grid<>(PrintMashine.class);
    private PrintMashineService printMashineService;

    public HelloWorldView(PrintMashineService printMashineService) {
        this.printMashineService = printMashineService;
        addClassName("hello-world-view");
        setSizeFull();
        configureGrid();
        add(grid);
        updateList();

/*

        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        add(name, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });

 */
    }
    private void configureGrid() {
        grid.addClassName("printmashine-grid");
        grid.setSizeFull();
        grid.setColumns("name", "typeOfPrinter", "quantityColors");
    }

    private  void updateList (){
        grid.setItems(printMashineService.findAll());
    }

}
