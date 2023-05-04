
package timezones2.Frankfurt;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import static timezones2.main.MainFXMLController.whichFXML;

public class FrankfurtScenes {
    
    public Scene FrankfurtToBudapestScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("FrankfurtToBudapestFXML.fxml"));  
    Scene frankfurtToBudapest = new Scene(root1, 800, 550);
    frankfurtToBudapest.setFill(Color.TRANSPARENT);
    whichFXML = "FrankfurtToBudapestFXML";
    return frankfurtToBudapest;  
    }
    public Scene FrankfurtToMunichScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("FrankfurtToMunichFXML.fxml"));     
    Scene frankfurtToMunich = new Scene(root1, 800, 550);
    frankfurtToMunich.setFill(Color.TRANSPARENT);
    whichFXML = "FrankfurtToMunichFXML";
    return frankfurtToMunich;  
    }
    public Scene FrankfurtToNewYorkScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("FrankfurtToNewYorkFXML.fxml"));        
    Scene frankfurtToNewYork = new Scene(root1, 800, 550);
    frankfurtToNewYork.setFill(Color.TRANSPARENT);
    whichFXML = "FrankfurtToNewYorkFXML";
    return frankfurtToNewYork;  
    }
    public Scene FrankfurtToSeattleScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("FrankfurtToSeattleFXML.fxml"));   
    Scene frankfurtToSeattle = new Scene(root1, 800, 550);
    frankfurtToSeattle.setFill(Color.TRANSPARENT);
    whichFXML = "FrankfurtToSeattleFXML";
    return frankfurtToSeattle;  
    }
    public Scene FrankfurtToTorontoScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("FrankfurtToTorontoFXML.fxml"));   
    Scene frankfurtToToronto = new Scene(root1, 800, 550);
    frankfurtToToronto.setFill(Color.TRANSPARENT);
    whichFXML = "FrankfurtToTorontoFXML";
    return frankfurtToToronto;  
    }
    public Scene FrankfurtToVancouverScene()throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("FrankfurtToVancouverFXML.fxml"));     
    Scene frankfurtToVancouver = new Scene(root1, 800, 550);
    frankfurtToVancouver.setFill(Color.TRANSPARENT);
    whichFXML = "FrankfurtToVancouverFXML";
    return frankfurtToVancouver;  
    }
    
}
