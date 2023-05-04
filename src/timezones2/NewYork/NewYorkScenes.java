
package timezones2.NewYork;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import static timezones2.main.MainFXMLController.whichFXML;

public class NewYorkScenes {
    
    public Scene NewYorkToBudapestScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("NewYorkToBudapestFXML.fxml"));      
    Scene newYorkToBudapest = new Scene(root1, 800, 550);
    newYorkToBudapest.setFill(Color.TRANSPARENT);
    whichFXML = "NewYorkToBudapestFXML";
    return newYorkToBudapest;  
    }
    public Scene NewYorkToFrankfurtScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("NewYorkToFrankfurtFXML.fxml")); 
    Scene newYorkToFrankfurt = new Scene(root1, 800, 550);
    newYorkToFrankfurt.setFill(Color.TRANSPARENT);
    whichFXML = "NewYorkToFrankfurtFXML";
    return newYorkToFrankfurt;  
    }
    public Scene NewYorkToMunichScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("NewYorkToMunichFXML.fxml")); 
    Scene newYorkToMunich = new Scene(root1, 800, 550);
    newYorkToMunich.setFill(Color.TRANSPARENT);
    whichFXML = "NewYorkToMunichFXML";
    return newYorkToMunich;  
    }
    public Scene NewYorkToSeattleScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("NewYorkToSeattleFXML.fxml"));   
    Scene newYorkToSeattle = new Scene(root1, 800, 550);
    newYorkToSeattle.setFill(Color.TRANSPARENT);
    whichFXML = "NewYorkToSeattleFXML";
    return newYorkToSeattle;  
    }
    public Scene NewYorkToTorontoScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("NewYorkToTorontoFXML.fxml"));   
    Scene newYorkToToronto = new Scene(root1, 800, 550);
    newYorkToToronto.setFill(Color.TRANSPARENT);
    whichFXML = "NewYorkToTorontoFXML";
    return newYorkToToronto;  
    }
    public Scene NewYorkToVancouverScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("NewYorkToVancouverFXML.fxml")); 
    Scene newYorkToVancouver = new Scene(root1, 800, 550);
    newYorkToVancouver.setFill(Color.TRANSPARENT);
    whichFXML = "NewYorkToVancouverFXML";
    return newYorkToVancouver;  
    }
    
}
