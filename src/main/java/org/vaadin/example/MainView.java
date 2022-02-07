package org.vaadin.example;

import com.vaadin.addon.spreadsheet.Spreadsheet;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.PWA;
import com.vaadin.mpr.core.HasLegacyComponents;
import com.vaadin.mpr.core.MprTheme;

import java.io.File;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@MprTheme("mytheme")
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout implements HasLegacyComponents, RouterLayout {

    public MainView() {
        try {
            File file = new File("D:\\test.xlsx");
            Spreadsheet spreadsheet = new Spreadsheet(file);
            add(spreadsheet);
            spreadsheet.setWidth("1000px");
            spreadsheet.setHeight("1000px");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

}
