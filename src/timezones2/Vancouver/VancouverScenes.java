
package timezones2.Vancouver;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import static timezones2.main.MainFXMLController.whichFXML;

public class VancouverScenes {
    
    public Scene VancouverToBudapestScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("VancouverToBudapestFXML.fxml"));     
    Scene vancouverToBudapest = new Scene(root1, 800, 550);
    vancouverToBudapest.setFill(Color.TRANSPARENT);
    whichFXML = "VancouverToBudapestFXML";
    return vancouverToBudapest;  
    }
    public Scene VancouverToFrankfurtScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("VancouverToFrankfurtFXML.fxml"));     
    Scene vancouverToFrankfurt = new Scene(root1, 800, 550);
    vancouverToFrankfurt.setFill(Color.TRANSPARENT);
    whichFXML = "VancouverToFrankfurtFXML";
    return vancouverToFrankfurt;  
    }
    public Scene VancouverToMunichScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("VancouverToMunichFXML.fxml"));       
    Scene vancouverToMunich = new Scene(root1, 800, 550);
    vancouverToMunich.setFill(Color.TRANSPARENT);
    whichFXML = "VancouverToMunichFXML";
    return vancouverToMunich;  
    }
    public Scene VancouverToNewYorkScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("VancouverToNewYorkFXML.fxml"));       
    Scene vancouverToNewYork = new Scene(root1, 800, 550);
    vancouverToNewYork.setFill(Color.TRANSPARENT);
    whichFXML = "VancouverToNewYorkFXML";
    return vancouverToNewYork;  
    }
    public Scene VancouverToSeattleScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("VancouverToSeattleFXML.fxml"));     
    Scene vancouverToSeattle = new Scene(root1, 800, 550);
    vancouverToSeattle.setFill(Color.TRANSPARENT);
    whichFXML = "VancouverToSeattleFXML";
    return vancouverToSeattle;  
    }
    public Scene VancouverToTorontoScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("VancouverToTorontoFXML.fxml"));     
    Scene vancouverToToronto = new Scene(root1, 800, 550);
    vancouverToToronto.setFill(Color.TRANSPARENT);
    whichFXML = "VancouverToTorontoFXML";
    return vancouverToToronto;  
    }
    
}
