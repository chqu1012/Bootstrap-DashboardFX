package de.dc.javafx.bootstrap.dashboard

import de.dc.javafx.bootstrap.dashboard.controller.LoginPage
import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.scene.layout.StackPane
import de.dc.javafx.bootstrap.dashboard.controller.RegisterPage

class Dashboard extends Application {
	
	override start(Stage stage) throws Exception {
		val pane = new StackPane
		pane.children += new RegisterPage
		pane.children += new LoginPage
		stage.setScene(new Scene(pane, 1200, 700))
		stage.show
	}

	def static void main(String[] args) {
		args.launch
	}
}
