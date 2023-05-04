
package timezones2.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class TimeZones2 extends Application {
    
    public static Stage primStage;
    
    public Scene MainMenuScene() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));    
        Scene scene = new Scene(root, 800, 550);
        scene.setFill(Color.TRANSPARENT);
        return scene;  
    } 
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(MainMenuScene());
        primStage = primaryStage;
        primStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
