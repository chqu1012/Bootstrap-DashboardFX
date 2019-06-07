package de.dc.javafx.bootstrap.dashboard.controller.index.feature;

import de.dc.javafx.bootstrap.dashboard.controller.index.control.BaseNavigationItemController;
import de.dc.javafx.bootstrap.dashboard.controller.index.model.NavigationItem;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class NavigationItemCellFactory extends BaseNavigationItemController {
  @Override
  protected void updateItem(final NavigationItem item, final boolean empty) {
    try {
      super.updateItem(item, empty);
      if ((empty || (item == null))) {
        this.setText(null);
        this.setGraphic(null);
      } else {
        if ((this.mLLoader == null)) {
          URL _resource = this.getClass().getResource("/de/dc/javafx/bootstrap/dashboard/inde/control/NavigationItem.fxml");
          FXMLLoader _fXMLLoader = new FXMLLoader(_resource);
          this.mLLoader = _fXMLLoader;
          this.mLLoader.setController(this);
          this.mLLoader.<Object>load();
        }
        this.nameLabel.setText(item.getName());
        this.setText(null);
        this.setGraphic(this.root);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
