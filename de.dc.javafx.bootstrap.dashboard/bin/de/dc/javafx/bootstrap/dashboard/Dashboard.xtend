package de.dc.javafx.bootstrap.dashboard

import de.dc.javafx.bootstrap.dashboard.controller.LoginPage
import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage

class Dashboard extends Application {
	
	override start(Stage stage) throws Exception {
		stage.setScene(new Scene(new LoginPage, 1200, 700))
		stage.show
	}

	def static void main(String[] args) {
		args.launch
	}
}
