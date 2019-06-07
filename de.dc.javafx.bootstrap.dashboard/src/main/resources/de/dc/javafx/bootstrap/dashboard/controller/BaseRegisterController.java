package de.dc.javafx.bootstrap.dashboard.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public abstract class BaseRegisterController{

    @FXML
    protected BorderPane root;

    @FXML
    protected ImageView profile;

    @FXML
    protected TextField firstnameText;

    @FXML
    protected TextField lastnameText;

    @FXML
    protected TextField emailText;

    @FXML
    protected PasswordField passwordText;

    @FXML
    protected PasswordField repeatPasswordText;

    @FXML
    protected abstract void onAlreadyHaveAnAccountLinkAction(ActionEvent event);

    @FXML
    protected abstract void onForgotPasswordLinkAction(ActionEvent event);

    @FXML
    protected abstract void onRegisterButtonAction(ActionEvent event);

    @FXML
    protected abstract void onRegisterWithGoogleButtonAction(ActionEvent event);

    @FXML
    protected abstract void onRegisterithFacebookButtonAction(ActionEvent event);

}
