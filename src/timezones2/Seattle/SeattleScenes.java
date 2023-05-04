
package timezones2.Seattle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import static timezones2.main.MainFXMLController.whichFXML;

public class SeattleScenes {
    
    public Scene SeattleToBudapestScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("SeattleToBudapestFXML.fxml"));    
    Scene seattleToBudapest = new Scene(root1, 800, 550);
    seattleToBudapest.setFill(Color.TRANSPARENT);
    whichFXML = "SeattleToBudapestFXML";
    return seattleToBudapest;  
    }
    public Scene SeattleToFrankfurtScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("SeattleToFrankfurtFXML.fxml"));     
    Scene seattleToFrankfurt = new Scene(root1, 800, 550);
    seattleToFrankfurt.setFill(Color.TRANSPARENT);
    whichFXML = "SeattleToFrankfurtFXML";
    return seattleToFrankfurt;  
    }
    public Scene SeattleToMunichScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("SeattleToMunichFXML.fxml"));     
    Scene seattleToMunich = new Scene(root1, 800, 550);
    seattleToMunich.setFill(Color.TRANSPARENT);
    whichFXML = "SeattleToMunichFXML";
    return seattleToMunich;  
    }
    public Scene SeattleToNewYorkScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("SeattleToNewYorkFXML.fxml"));     
    Scene seattleToNewYork = new Scene(root1, 800, 550);
    seattleToNewYork.setFill(Color.TRANSPARENT);
    whichFXML = "SeattleToNewYorkFXML";
    return seattleToNewYork;  
    }
    public Scene SeattleToTorontoScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("SeattleToTorontoFXML.fxml"));   
    Scene seattleToToronto = new Scene(root1, 800, 550);
    seattleToToronto.setFill(Color.TRANSPARENT);
    whichFXML = "SeattleToTorontoFXML";
    return seattleToToronto;  
    }
    public Scene SeattleToVancouverScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("SeattleToVancouverFXML.fxml"));     
    Scene seattleToVancouver = new Scene(root1, 800, 550);
    seattleToVancouver.setFill(Color.TRANSPARENT);
    whichFXML = "SeattleToVancouverFXML";
    return seattleToVancouver;  
    }
    
}
