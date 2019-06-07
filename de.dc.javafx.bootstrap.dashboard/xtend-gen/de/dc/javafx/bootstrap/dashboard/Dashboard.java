package de.dc.javafx.bootstrap.dashboard;

import de.dc.javafx.bootstrap.dashboard.controller.IndexPage;
import de.dc.javafx.bootstrap.dashboard.controller.LoginPage;
import de.dc.javafx.bootstrap.dashboard.controller.RegisterPage;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

@SuppressWarnings("all")
public class Dashboard extends Application {
  @Override
  public void start(final Stage stage) throws Exception {
    final AnchorPane pane = new AnchorPane();
    ObservableList<Node> _children = pane.getChildren();
    RegisterPage _registerPage = new RegisterPage();
    Pane _anchor = Dashboard.anchor(_registerPage);
    _children.add(_anchor);
    ObservableList<Node> _children_1 = pane.getChildren();
    IndexPage _indexPage = new IndexPage();
    Pane _anchor_1 = Dashboard.anchor(_indexPage);
    _children_1.add(_anchor_1);
    ObservableList<Node> _children_2 = pane.getChildren();
    LoginPage _loginPage = new LoginPage();
    Pane _anchor_2 = Dashboard.anchor(_loginPage);
    _children_2.add(_anchor_2);
    Scene _scene = new Scene(pane, 1200, 700);
    stage.setScene(_scene);
    stage.show();
  }
  
  public static Pane anchor(final Pane pane) {
    AnchorPane.setBottomAnchor(pane, Double.valueOf(0d));
    AnchorPane.setTopAnchor(pane, Double.valueOf(0d));
    AnchorPane.setLeftAnchor(pane, Double.valueOf(0d));
    AnchorPane.setRightAnchor(pane, Double.valueOf(0d));
    return pane;
  }
  
  public static void main(final String[] args) {
    Application.launch(args);
  }
}
