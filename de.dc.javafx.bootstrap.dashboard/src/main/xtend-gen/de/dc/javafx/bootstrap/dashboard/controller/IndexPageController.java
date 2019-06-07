package de.dc.javafx.bootstrap.dashboard.controller;

import de.dc.javafx.bootstrap.dashboard.controller.BaseIndexController;
import de.dc.javafx.bootstrap.dashboard.controller.index.feature.NavigationItemCellFactory;
import de.dc.javafx.bootstrap.dashboard.controller.index.model.NavigationItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import org.springframework.stereotype.Controller;

@Controller
@SuppressWarnings("all")
public class IndexPageController extends BaseIndexController {
  private ObservableList<NavigationItem> navigationItems = FXCollections.<NavigationItem>observableArrayList();
  
  public void initialize() {
    NavigationItem _navigationItem = new NavigationItem("", "Dashboard");
    this.navigationItems.add(_navigationItem);
    NavigationItem _navigationItem_1 = new NavigationItem("", "Components");
    this.navigationItems.add(_navigationItem_1);
    NavigationItem _navigationItem_2 = new NavigationItem("", "Utilities");
    this.navigationItems.add(_navigationItem_2);
    NavigationItem _navigationItem_3 = new NavigationItem("", "Pages");
    this.navigationItems.add(_navigationItem_3);
    NavigationItem _navigationItem_4 = new NavigationItem("", "Charts");
    this.navigationItems.add(_navigationItem_4);
    NavigationItem _navigationItem_5 = new NavigationItem("", "Tables");
    this.navigationItems.add(_navigationItem_5);
    final Callback<ListView<NavigationItem>, ListCell<NavigationItem>> _function = (ListView<NavigationItem> view) -> {
      return new NavigationItemCellFactory();
    };
    this.navigationListView.setCellFactory(_function);
    this.navigationListView.setItems(this.navigationItems);
  }
}
