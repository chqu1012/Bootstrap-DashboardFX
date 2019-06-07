package de.dc.javafx.bootstrap.dashboard.controller

import javafx.fxml.FXMLLoader

class IndexPage extends BaseIndexController {
	
	static final String BASE_PATH = "/de/dc/javafx/bootstrap/dashboard/";
	
	new() {
		val fxmlLoader = new FXMLLoader(class.getResource(BASE_PATH+"index.fxml"))
        fxmlLoader.setRoot(this)
        fxmlLoader.setController(this)
        fxmlLoader.load()
	}
}
