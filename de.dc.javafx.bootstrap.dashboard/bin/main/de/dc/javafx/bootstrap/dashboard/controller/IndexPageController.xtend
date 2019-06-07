package de.dc.javafx.bootstrap.dashboard.controller

import de.dc.javafx.bootstrap.dashboard.controller.index.feature.NavigationItemCellFactory
import de.dc.javafx.bootstrap.dashboard.controller.index.model.NavigationItem
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import org.springframework.stereotype.Controller

@Controller
class IndexPageController extends BaseIndexController {
	
	ObservableList<NavigationItem> navigationItems = FXCollections.observableArrayList
	
	def initialize(){
		navigationItems += new NavigationItem("", "Dashboard")
		navigationItems += new NavigationItem("", "Components")
		navigationItems += new NavigationItem("", "Utilities")
		navigationItems += new NavigationItem("", "Pages")
		navigationItems += new NavigationItem("", "Charts")
		navigationItems += new NavigationItem("", "Tables")

		navigationListView.cellFactory = [ view | new NavigationItemCellFactory]
		navigationListView.items = navigationItems
	}
}
