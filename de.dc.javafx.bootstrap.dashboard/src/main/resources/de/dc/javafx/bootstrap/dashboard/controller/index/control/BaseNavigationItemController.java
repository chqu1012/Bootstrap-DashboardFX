package de.dc.javafx.bootstrap.dashboard.controller.index.control;
import de.dc.javafx.bootstrap.dashboard.controller.index.model.NavigationItem;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public abstract class BaseNavigationItemController extends ListCell<NavigationItem> {

    @FXML
    protected FontAwesomeIconView iconImageView;

    @FXML
    protected Label nameLabel;
    
    @FXML
    protected HBox root;
    
    protected FXMLLoader mLLoader;
}