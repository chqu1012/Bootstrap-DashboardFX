package de.dc.javafx.bootstrap.dashboard;

import de.dc.javafx.bootstrap.dashboard.controller.IndexPage;
import de.dc.javafx.bootstrap.dashboard.controller.LoginPage;
import de.dc.javafx.bootstrap.dashboard.controller.RegisterPage;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

@SuppressWarnings("all")
public class Dashboard extends Application {
  @Override
  public void start(final Stage stage) throws Exception {
    final StackPane pane = new StackPane();
    ObservableList<Node> _children = pane.getChildren();
    RegisterPage _registerPage = new RegisterPage();
    _children.add(_registerPage);
    ObservableList<Node> _children_1 = pane.getChildren();
    IndexPage _indexPage = new IndexPage();
    _children_1.add(_indexPage);
    ObservableList<Node> _children_2 = pane.getChildren();
    LoginPage _loginPage = new LoginPage();
    _children_2.add(_loginPage);
    Scene _scene = new Scene(pane, 1200, 700);
    stage.setScene(_scene);
    stage.show();
  }
  
  public static void main(final String[] args) {
    Application.launch(args);
  }
}
