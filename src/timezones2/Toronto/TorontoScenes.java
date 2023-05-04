
package timezones2.Toronto;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import static timezones2.main.MainFXMLController.whichFXML;

public class TorontoScenes {
    
    public Scene TorontoToBudapestScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("TorontoToBudapestFXML.fxml"));       
    Scene torontoToBudapest = new Scene(root1, 800, 550);
    torontoToBudapest.setFill(Color.TRANSPARENT);
    whichFXML = "TorontoToBudapestFXML";
    return torontoToBudapest;  
    }
    public Scene TorontoToFrankfurtScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("TorontoToFrankfurtFXML.fxml"));
    Scene torontoToFrankfurt = new Scene(root1, 800, 550);
    torontoToFrankfurt.setFill(Color.TRANSPARENT);
    whichFXML = "TorontoToFrankfurtFXML";
    return torontoToFrankfurt;  
    }
    public Scene TorontoToMunichScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("TorontoToMunichFXML.fxml"));   
    Scene torontoToMunich = new Scene(root1, 800, 550);
    torontoToMunich.setFill(Color.TRANSPARENT);
    whichFXML = "TorontoToMunichFXML";
    return torontoToMunich;  
    }
    public Scene TorontoToNewYorkScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("TorontoToNewYorkFXML.fxml"));    
    Scene torontoToNewYork = new Scene(root1, 800, 550);
    torontoToNewYork.setFill(Color.TRANSPARENT);
    whichFXML = "TorontoToNewYorkFXML";
    return torontoToNewYork;  
    }
    public Scene TorontoToSeattleScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("TorontoToSeattleFXML.fxml"));   
    Scene torontoToSeattle = new Scene(root1, 800, 550);
    torontoToSeattle.setFill(Color.TRANSPARENT);
    whichFXML = "TorontoToSeattleFXML";
    return torontoToSeattle;  
    }
    public Scene TorontoToVancouverScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("TorontoToVancouverFXML.fxml"));   
    Scene torontoToVancouver = new Scene(root1, 800, 550);
    torontoToVancouver.setFill(Color.TRANSPARENT);
    whichFXML = "TorontoToVancouverFXML";
    return torontoToVancouver;  
    }
    
}
