package de.dc.javafx.bootstrap.dashboard.controller;

import de.dc.javafx.bootstrap.dashboard.controller.BaseLoginController;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class LoginPage extends BaseLoginController {
  public LoginPage() {
    try {
      URL _resource = this.getClass().getResource("/de/dc/javafx/bootstrap/dashboard/login.fxml");
      final FXMLLoader fxmlLoader = new FXMLLoader(_resource);
      fxmlLoader.setRoot(this);
      fxmlLoader.setController(this);
      fxmlLoader.<Object>load();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  protected void onCreateANewAccountLinkAction(final ActionEvent event) {
  }
  
  @Override
  protected void onForgotPasswordLinkAction(final ActionEvent event) {
  }
  
  @Override
  protected void onLoginButtonAction(final ActionEvent event) {
  }
  
  @Override
  protected void onLoginWithFacebookButtonAction(final ActionEvent event) {
  }
  
  @Override
  protected void onLoginWithGoogleButtonAction(final ActionEvent event) {
  }
}
