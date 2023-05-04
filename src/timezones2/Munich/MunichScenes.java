
package timezones2.Munich;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import static timezones2.main.MainFXMLController.whichFXML;

public class MunichScenes {
    
    public Scene MunichToBudapestScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("MunichToBudapestFXML.fxml"));    
    Scene munichToBudapest = new Scene(root1, 800, 550);
    munichToBudapest.setFill(Color.TRANSPARENT);
    whichFXML = "MunichToBudapestFXML";
    return munichToBudapest;  
    }
    public Scene MunichToFrankfurtScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("MunichToFrankfurtFXML.fxml"));      
    Scene munichToFrankfurt = new Scene(root1, 800, 550);
    munichToFrankfurt.setFill(Color.TRANSPARENT);
    whichFXML = "MunichToFrankfurtFXML";
    return munichToFrankfurt;  
    }
    public Scene MunichToNewYorkScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("MunichToNewYorkFXML.fxml"));      
    Scene munichToNewYork = new Scene(root1, 800, 550);
    munichToNewYork.setFill(Color.TRANSPARENT);
    whichFXML = "MunichToNewYorkFXML";
    return munichToNewYork;  
    }
    public Scene MunichToSeattleScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("MunichToSeattleFXML.fxml"));   
    Scene munichToSeattle = new Scene(root1, 800, 550);
    munichToSeattle.setFill(Color.TRANSPARENT);
    whichFXML = "MunichToSeattleFXML";
    return munichToSeattle;  
    }
    public Scene MunichToTorontoScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("MunichToTorontoFXML.fxml"));       
    Scene munichToToronto = new Scene(root1, 800, 550);
    munichToToronto.setFill(Color.TRANSPARENT);
    whichFXML = "MunichToTorontoFXML";
    return munichToToronto;  
    }
    public Scene MunichToVancouverScene() throws Exception {
    Parent root1 = FXMLLoader.load(getClass().getResource("MunichToVancouverFXML.fxml"));      
    Scene munichToVancouver = new Scene(root1, 800, 550);
    munichToVancouver.setFill(Color.TRANSPARENT);
    whichFXML = "MunichToVancouverFXML";
    return munichToVancouver;  
    }
    
}
