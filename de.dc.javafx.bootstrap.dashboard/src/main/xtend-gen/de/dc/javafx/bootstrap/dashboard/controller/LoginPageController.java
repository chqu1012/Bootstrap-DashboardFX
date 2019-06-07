package de.dc.javafx.bootstrap.dashboard.controller;

import de.dc.javafx.bootstrap.dashboard.controller.BaseLoginController;
import javafx.event.ActionEvent;
import org.springframework.stereotype.Controller;

@Controller
@SuppressWarnings("all")
public class LoginPageController extends BaseLoginController {
  @Override
  protected void onCreateANewAccountLinkAction(final ActionEvent event) {
    this.registerPane.toFront();
  }
  
  @Override
  protected void onForgotPasswordLinkAction(final ActionEvent event) {
  }
  
  @Override
  protected void onLoginButtonAction(final ActionEvent event) {
    this.indexPane.toFront();
  }
  
  @Override
  protected void onLoginWithFacebookButtonAction(final ActionEvent event) {
  }
  
  @Override
  protected void onLoginWithGoogleButtonAction(final ActionEvent event) {
  }
}
