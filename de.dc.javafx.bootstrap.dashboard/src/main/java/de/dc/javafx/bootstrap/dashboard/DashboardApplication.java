package de.dc.javafx.bootstrap.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jfxtras.styles.jmetro8.JMetro;
import jfxtras.styles.jmetro8.JMetro.Style;

@SpringBootApplication
public class DashboardApplication extends Application {

    private ConfigurableApplicationContext springContext;
    private AnchorPane root;
	private FXMLLoader fxmlLoader;
	private Stage primaryStage;
	
    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(DashboardApplication.class);
        fxmlLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/bootstrap/dashboard/login.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
        root = fxmlLoader.load();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    		final Scene scene = new Scene(root, 1200, 800);
    		scene.setOnKeyPressed(event -> {
    			switch (event.getCode()) {
					case F12:
						primaryStage.setFullScreen(!primaryStage.isFullScreen());
						break;
					case F11:
						primaryStage.setAlwaysOnTop(!primaryStage.isAlwaysOnTop());
						break;
					default:
						break;
				}
			});
    		this.primaryStage = primaryStage;
    		this.primaryStage.setScene(scene);
    		this.primaryStage.initStyle(StageStyle.DECORATED);
    		this.primaryStage.show();
    		this.primaryStage.setTitle("(C)opyright by Frater Anatis, 2019, Dashboard Application");
    }
    
    @Override
    public void stop() throws Exception {
        springContext.stop();
        System.exit(0);
    }

    public static void main(String[] args) {
    	launch(DashboardApplication.class);
    }
}
