package sunat.gob.pe.canchafutbol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {
    //<-- mover ventana de login -- >
    private double xMov = 0;
    private double yMov = 0;
    //</-- -->
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            //String fxml_login = "/sunat/gob/pe/canchafutbol/controller/login/Login.fxml";
            String fxml_login = "Login.fxml";
            Parent root = FXMLLoader.load(getClass().getResource(fxml_login));
            Scene escena = new Scene(root);
            primaryStage.setScene(escena);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();

            //<-- mover ventana de login -- >
            root.setOnMousePressed((MouseEvent event) -> {
                xMov = event.getSceneX();
                yMov = event.getSceneY();
            });

            root.setOnMouseDragged((MouseEvent event) -> {
                primaryStage.setX(event.getScreenX() - xMov);
                primaryStage.setY(event.getScreenY() - yMov);
            });
            //</-- -->

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}