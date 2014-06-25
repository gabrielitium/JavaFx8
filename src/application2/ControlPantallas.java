package application2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * ControlPantallas Application. This class handles navigation and user session.
 */
public class ControlPantallas extends Application {
    private Stage stage;    

    private static ControlPantallas instance;

    public ControlPantallas() {
        instance = this;
    }

    public static ControlPantallas getInstance() {
        return instance;
    }

    @Override 
    public void start(Stage primaryStage) {
        try {
            stage = primaryStage;
            gotoMain();
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(ControlPantallas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void load()
    {
    	launch();
    }

    public void gotoMain() {
        try {
            replaceSceneContent("main.fxml");
        } catch (Exception ex) {
            Logger.getLogger(ControlPantallas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gotoVista1() {
        try {
            replaceSceneContent("vista1.fxml");
        } catch (Exception ex) {
            Logger.getLogger(ControlPantallas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gotoVista2() {
        try {
            replaceSceneContent("vista2.fxml");
        } catch (Exception ex) {
            Logger.getLogger(ControlPantallas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Parent replaceSceneContent(String fxml) throws Exception {
        Parent page = (Parent) FXMLLoader.load(ControlPantallas.class.getResource(fxml), null, new JavaFXBuilderFactory());
        Scene scene = stage.getScene();
        if (scene == null) {
            scene = new Scene(page, 700, 450);
            //scene.getStylesheets().add(ControlPantallas.class.getResource("demo.css").toExternalForm());
            stage.setScene(scene);
        } else {
            stage.getScene().setRoot(page);
        }
        stage.sizeToScene();
        return page;
    }
}