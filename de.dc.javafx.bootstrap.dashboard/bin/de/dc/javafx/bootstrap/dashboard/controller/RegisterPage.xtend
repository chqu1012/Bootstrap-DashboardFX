package de.dc.javafx.bootstrap.dashboard.controller

import javafx.event.ActionEvent
import javafx.fxml.FXMLLoader

class RegisterPage extends BaseRegisterController {
	
	new() {
		val fxmlLoader = new FXMLLoader(class.getResource("/de/dc/javafx/bootstrap/dashboard/register.fxml"))
        fxmlLoader.setRoot(this)
        fxmlLoader.setController(this)
        fxmlLoader.load()
	}
	
	override protected void onAlreadyHaveAnAccountLinkAction(ActionEvent event) { // TODO Auto-generated method stub
	}

	override protected void onForgotPasswordLinkAction(ActionEvent event) { // TODO Auto-generated method stub
	}

	override protected void onRegisterButtonAction(ActionEvent event) { // TODO Auto-generated method stub
	}

	override protected void onRegisterWithGoogleButtonAction(ActionEvent event) { // TODO Auto-generated method stub
	}

	override protected void onRegisterithFacebookButtonAction(ActionEvent event) { // TODO Auto-generated method stub
	}
}
