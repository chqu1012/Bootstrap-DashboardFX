package de.dc.javafx.bootstrap.dashboard.controller

import org.springframework.stereotype.Controller
import javafx.collections.ObservableList
import javafx.collections.FXCollections

@Controller
class IndexPageController extends BaseIndexController {
	
	ObservableList<String> navigationItems = FXCollections.observableArrayList
	
	def initialize(){
		navigationItems += "Dashboard"
		navigationItems += "Components"
		navigationItems += "Utilities"
		navigationItems += "Pages"
		navigationItems += "Charts"
		navigationItems += "Tables"

		navigationListView.items = navigationItems
	}
}
