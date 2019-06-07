package de.dc.javafx.bootstrap.dashboard.controller

import javafx.event.ActionEvent
import org.springframework.stereotype.Controller

@Controller
class LoginPageController extends BaseLoginController {
	
	override protected void onCreateANewAccountLinkAction(ActionEvent event) {
		registerPane.toFront
	}

	override protected void onForgotPasswordLinkAction(ActionEvent event) { 
	}

	override protected void onLoginButtonAction(ActionEvent event) {
		indexPane.toFront
	}

	override protected void onLoginWithFacebookButtonAction(ActionEvent event) { // TODO Auto-generated method stub
	}

	override protected void onLoginWithGoogleButtonAction(ActionEvent event) { // TODO Auto-generated method stub
	}
}
