package de.dc.javafx.bootstrap.dashboard

import de.dc.javafx.bootstrap.dashboard.controller.IndexPage
import de.dc.javafx.bootstrap.dashboard.controller.LoginPage
import de.dc.javafx.bootstrap.dashboard.controller.RegisterPage
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.Pane
import javafx.stage.Stage

class Dashboard extends Application {
	
	override start(Stage stage) throws Exception {
		val pane = new AnchorPane
		
		pane.children += anchor(new RegisterPage)
		pane.children += anchor(new IndexPage)
		pane.children += anchor(new LoginPage)
		
		stage.setScene(new Scene(pane, 1200, 700))
		stage.show
	}
	
	def static anchor(Pane pane){
		AnchorPane.setBottomAnchor(pane, 0d)
		AnchorPane.setTopAnchor(pane, 0d)
		AnchorPane.setLeftAnchor(pane, 0d)
		AnchorPane.setRightAnchor(pane, 0d)
		return pane
	}

	def static void main(String[] args) {
		args.launch
	}
}
