
package timezones2.Budapest;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import static timezones2.main.MainFXMLController.whichFXML;

public class BudapestScenes {
    
    public Scene BudapestToFrankfurtScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("BudapestToFrankfurtFXML.fxml"));    
    Scene budapestToFrankfurt = new Scene(root1, 800, 550);
    budapestToFrankfurt.setFill(Color.TRANSPARENT);
    whichFXML = "BudapestToFrankfurtFXML";
    return budapestToFrankfurt;  
    } 
    public Scene BudapestToMunichScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("BudapestToMunichFXML.fxml"));          
    Scene budapestToMunich = new Scene(root1, 800, 550);
    budapestToMunich.setFill(Color.TRANSPARENT);
    whichFXML = "BudapestToMunichFXML";
    return budapestToMunich;  
    }
    public Scene BudapestToNewYorkScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("BudapestToNewYorkFXML.fxml"));    
    Scene budapestToNewYork = new Scene(root1, 800, 550);
    budapestToNewYork.setFill(Color.TRANSPARENT);
    whichFXML = "BudapestToNewYorkFXML";
    return budapestToNewYork;  
    }
    public Scene BudapestToSeattleScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("BudapestToSeattleFXML.fxml"));    
    Scene budapestToSeattle = new Scene(root1, 800, 550);
    budapestToSeattle.setFill(Color.TRANSPARENT);
    whichFXML = "BudapestToSeattleFXML";
    return budapestToSeattle;  
    }
    public Scene BudapestToTorontoScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("BudapestToTorontoFXML.fxml")); 
    Scene budapestToToronto = new Scene(root1, 800, 550);
    budapestToToronto.setFill(Color.TRANSPARENT);
    whichFXML = "BudapestToTorontoFXML";
    return budapestToToronto;  
    }
    public Scene BudapestToVancouverScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("BudapestToVancouverFXML.fxml"));  
    Scene budapestToVancouver = new Scene(root1, 800, 550);
    budapestToVancouver.setFill(Color.TRANSPARENT);
    whichFXML = "BudapestToVancouverFXML";
    return budapestToVancouver;  
    }
    
}
