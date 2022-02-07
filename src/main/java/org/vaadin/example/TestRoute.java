package org.vaadin.example;

import com.vaadin.flow.router.Route;
import com.vaadin.mpr.MprRouteAdapter;

@Route(value = "test", layout = MainView.class)
class TestRoute extends MprRouteAdapter<TestScreen> {

}