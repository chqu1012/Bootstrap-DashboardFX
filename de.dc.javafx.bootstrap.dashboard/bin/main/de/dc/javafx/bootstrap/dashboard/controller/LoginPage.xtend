package de.dc.javafx.bootstrap.dashboard.controller

import javafx.event.ActionEvent
import javafx.fxml.FXMLLoader

class LoginPage extends BaseLoginController {
	
	new() {
		val fxmlLoader = new FXMLLoader(class.getResource("/de/dc/javafx/bootstrap/dashboard/login.fxml"))
        fxmlLoader.setRoot(this)
        fxmlLoader.setController(this)
        fxmlLoader.load()
	}
	
	override protected void onCreateANewAccountLinkAction(ActionEvent event) {
		root.toBack
	}

	override protected void onForgotPasswordLinkAction(ActionEvent event) { 
	}

	override protected void onLoginButtonAction(ActionEvent event) {
		root.toBack
	}

	override protected void onLoginWithFacebookButtonAction(ActionEvent event) { // TODO Auto-generated method stub
	}

	override protected void onLoginWithGoogleButtonAction(ActionEvent event) { // TODO Auto-generated method stub
	}
}
