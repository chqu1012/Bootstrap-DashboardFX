package de.dc.javafx.bootstrap.dashboard.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public abstract class BaseLoginController extends BorderPane{

    @FXML
    protected BorderPane root;

    @FXML
    protected ImageView profile;

    @FXML
    protected TextField emailText;

    @FXML
    protected PasswordField passwordText;

    @FXML
    protected CheckBox rememberMeCheckBox;

    @FXML
    protected abstract void onCreateANewAccountLinkAction(ActionEvent event);

    @FXML
    protected abstract void onForgotPasswordLinkAction(ActionEvent event);

    @FXML
    protected abstract void onLoginButtonAction(ActionEvent event);

    @FXML
    protected abstract void onLoginWithFacebookButtonAction(ActionEvent event);

    @FXML
    protected abstract void onLoginWithGoogleButtonAction(ActionEvent event);

}
