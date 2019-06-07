package de.dc.javafx.bootstrap.dashboard.controller;

import de.dc.javafx.bootstrap.dashboard.controller.BaseRegisterController;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class RegisterPage extends BaseRegisterController {
  public RegisterPage() {
    try {
      URL _resource = this.getClass().getResource("/de/dc/javafx/bootstrap/dashboard/register.fxml");
      final FXMLLoader fxmlLoader = new FXMLLoader(_resource);
      fxmlLoader.setRoot(this);
      fxmlLoader.setController(this);
      fxmlLoader.<Object>load();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  protected void onAlreadyHaveAnAccountLinkAction(final ActionEvent event) {
  }
  
  @Override
  protected void onForgotPasswordLinkAction(final ActionEvent event) {
  }
  
  @Override
  protected void onRegisterButtonAction(final ActionEvent event) {
  }
  
  @Override
  protected void onRegisterWithGoogleButtonAction(final ActionEvent event) {
  }
  
  @Override
  protected void onRegisterithFacebookButtonAction(final ActionEvent event) {
  }
}
