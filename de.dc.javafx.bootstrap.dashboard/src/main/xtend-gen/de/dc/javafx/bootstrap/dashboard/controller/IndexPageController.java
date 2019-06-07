package de.dc.javafx.bootstrap.dashboard.controller;

import de.dc.javafx.bootstrap.dashboard.controller.BaseIndexController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.springframework.stereotype.Controller;

@Controller
@SuppressWarnings("all")
public class IndexPageController extends BaseIndexController {
  private ObservableList<String> navigationItems = FXCollections.<String>observableArrayList();
  
  public void initialize() {
    this.navigationItems.add("Dashboard");
    this.navigationItems.add("Components");
    this.navigationItems.add("Utilities");
    this.navigationItems.add("Pages");
    this.navigationItems.add("Charts");
    this.navigationItems.add("Tables");
    this.navigationListView.setItems(this.navigationItems);
  }
}
