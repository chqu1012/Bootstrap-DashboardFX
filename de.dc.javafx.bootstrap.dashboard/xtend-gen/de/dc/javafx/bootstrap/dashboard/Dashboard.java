package de.dc.javafx.bootstrap.dashboard;

import de.dc.javafx.bootstrap.dashboard.controller.LoginPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SuppressWarnings("all")
public class Dashboard extends Application {
  @Override
  public void start(final Stage stage) throws Exception {
    LoginPage _loginPage = new LoginPage();
    Scene _scene = new Scene(_loginPage, 1200, 700);
    stage.setScene(_scene);
    stage.show();
  }
  
  public static void main(final String[] args) {
    Application.launch(args);
  }
}
