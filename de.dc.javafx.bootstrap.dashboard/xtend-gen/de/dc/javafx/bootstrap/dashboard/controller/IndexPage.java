package de.dc.javafx.bootstrap.dashboard.controller;

import de.dc.javafx.bootstrap.dashboard.controller.BaseIndexController;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class IndexPage extends BaseIndexController {
  private static final String BASE_PATH = "/de/dc/javafx/bootstrap/dashboard/";
  
  public IndexPage() {
    try {
      URL _resource = this.getClass().getResource((IndexPage.BASE_PATH + "index.fxml"));
      final FXMLLoader fxmlLoader = new FXMLLoader(_resource);
      fxmlLoader.setRoot(this);
      fxmlLoader.setController(this);
      fxmlLoader.<Object>load();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
