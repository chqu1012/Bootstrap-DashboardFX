package de.dc.javafx.bootstrap.dashboard.controller;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public abstract class BaseIndexController{

    @FXML
    protected Label title;

    @FXML
    protected TextField searchText;

    @FXML
    protected FontAwesomeIconView alarmImageView;

    @FXML
    protected FontAwesomeIconView mailNotificationImageView;

    @FXML
    protected Label profileLabel;

    @FXML
    protected ImageView profileImageView;

}