
package timezones2.main;

import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MainFXMLController implements Initializable {

    public static String whichFXML;
    public static String ZoneIdString;
    
    double x = 0, y = 0;
    String s;
    TimeZones2 mObj = new TimeZones2();
   
    Image img = new Image("css/plane.png");
    ImageView plane2 = new ImageView(img);
    
    
    
   @FXML
    void close(ActionEvent event) {
        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        stage.close();
    }
    
    @FXML
    void reset(ActionEvent event) {
        plane2.setVisible(false); 
        localTimeVar.setText("");
        timeInBPVar.setText("");
        localTimeVar.setVisible(false);
        timeInBPVar.setVisible(false);
        textField2error.setVisible(false);
        textField3error.setVisible(false);
        
        datePicker1.setValue(null);
        textField2.setText("");
        textField3.setText("");
        
        plane2.setTranslateX(607);
        plane2.setTranslateY(278);     
           
    }
    
    @FXML
    void back(ActionEvent event) throws Exception {
        TimeZones2.primStage.setScene(mObj.MainMenuScene());
    }
    
    @FXML
    void next(ActionEvent event) {
    
           
            if (!(textField2.getText().equals("For ex. '10:15'") & textField3.getText().equals("For ex. '9:15'"))) {         
                try { 
                
                localTimeVar.setText("");
                timeInBPVar.setText("");
                localTimeVar.setVisible(false);
                timeInBPVar.setVisible(false);
                textField2error.setVisible(false);
                textField3error.setVisible(false);
                
                ZoneId zoneOfBudapest = ZoneId.of("Europe/Budapest"); 
                ZoneId zoneOfNewYork = ZoneId.of("America/Puerto_Rico");
                ZoneId zoneOfSeattle = ZoneId.of("America/Los_Angeles");
                
                //TZ fuggetlen
                String templateForflightLengthS = "P0DT3H4M";
                templateForflightLengthS = templateForflightLengthS.replace("3H4", textField3.getText());
                templateForflightLengthS = templateForflightLengthS.replace(":", "H");
                System.out.println(templateForflightLengthS);
                Duration flightLengthValue = Duration.parse(templateForflightLengthS);
                
                
                
                //BUDAPEST timezone
                LocalDate dateBP = LocalDate.parse(datePicker1.getValue().toString());
                LocalTime timeBP = LocalTime.parse(textField2.getText());
                ZonedDateTime BPTimeFromUserInput = ZonedDateTime.of(dateBP, timeBP, zoneOfBudapest);
                
                ZonedDateTime TimeInBp = BPTimeFromUserInput.plus(flightLengthValue);
                
                //setting human readable time in Budapest
                String TimeInBpS = TimeInBp.toString();
                TimeInBpS = TimeInBpS.replace("T", " ");
                TimeInBpS = TimeInBpS.replace("+01:00", "");
                TimeInBpS = TimeInBpS.replace("+02:00", "");
                TimeInBpS = TimeInBpS.replace("[Europe-Budapest]", "");
                TimeInBpS = TimeInBpS.replace("[Europe/Budapest]", "");
                TimeInBpS = TimeInBpS.replace("-", "/");
               
                //Convert TimeInBP to NY time:
                ZonedDateTime zdtNY = TimeInBp.withZoneSameInstant​(zoneOfNewYork);
                //Format: 
                String zdtNYFormatted = zdtNY.toString().replace("-04:00", "").replace("-05:00", "").replace("T", " ").replace("[America-Puerto_Rico]", "").replace("[America/Puerto_Rico]", "").replace("-", "/");
                //Convert TimeInBP to SEA time:
                ZonedDateTime zdtSEA = TimeInBp.withZoneSameInstant​(zoneOfSeattle);
                //Format: 
                String zdtSEAFormatted = zdtSEA.toString().replace("-07:00", "").replace("-08:00", "").replace("T", " ").replace("[America-Los_Angeles]", "").replace("[America/Los_Angeles]", "").replace("-", "/");
                
                
               
                
                //NEW YORK timezone
                LocalDate dateNY = LocalDate.parse(datePicker1.getValue().toString());
                LocalTime timeNY = LocalTime.parse(textField2.getText());
                ZonedDateTime NYTimeFromUserInput = ZonedDateTime.of(dateNY, timeNY, zoneOfNewYork);
               
                ZonedDateTime TimeInNY = NYTimeFromUserInput.plus(flightLengthValue);
                
                //setting human readable time in New York
                String TimeInNYS = TimeInNY.toString();
                TimeInNYS = TimeInNYS.replace("T", " ");
                TimeInNYS = TimeInNYS.replace("-04:00", "");
                TimeInNYS = TimeInNYS.replace("-05:00", "");
                TimeInNYS = TimeInNYS.replace("[America-Puerto_Rico]", "");
                TimeInNYS = TimeInNYS.replace("[America/Puerto_Rico]", "");
                TimeInNYS = TimeInNYS.replace("-", "/");
              
                //Convert TimeInNYS to SEA time:
                ZonedDateTime zdtSEA2 = TimeInNY.withZoneSameInstant​(zoneOfSeattle);
                //Format: 
                String zdtSEA2Formatted = zdtSEA2.toString().replace("-07:00", "").replace("-08:00", "").replace("T", " ").replace("[America-Los_Angeles]", "").replace("[America/Los_Angeles]", "").replace("-", "/");
                //Convert TimeInNYS to BUD time:
                ZonedDateTime zdtBUD2 = TimeInNY.withZoneSameInstant​(zoneOfBudapest);
                //Format: 
                String zdtBUD2Formatted = zdtBUD2.toString().replace("+01:00", "").replace("+02:00", "").replace("T", " ").replace("[Europe-Budapest]", "").replace("[Europe/Budapest]", "").replace("-", "/");
               
                
                
                
                //SEATTLE timezone
                LocalDate dateSEA = LocalDate.parse(datePicker1.getValue().toString());
                LocalTime timeSEA = LocalTime.parse(textField2.getText());
                ZonedDateTime formatTemplateForzdtSEA = ZonedDateTime.of(dateSEA, timeSEA, zoneOfSeattle);
                
                ZonedDateTime TimeInSEA = formatTemplateForzdtSEA.plus(flightLengthValue);
                
                //setting human readable time in Seattle
                String TimeInSEAS = TimeInSEA.toString();
                TimeInSEAS = TimeInSEAS.replace("T", " ");
                TimeInSEAS = TimeInSEAS.replace("-07:00", "");
                TimeInSEAS = TimeInSEAS.replace("-08:00", "");
                TimeInSEAS = TimeInSEAS.replace("[America-Los_Angeles]", "");
                TimeInSEAS = TimeInSEAS.replace("[America/Los_Angeles]", "");
                TimeInSEAS = TimeInSEAS.replace("-", "/");
                
                //Convert TimeInSEAS to BUD time:
                ZonedDateTime zdtBUD3 = TimeInSEA.withZoneSameInstant​(zoneOfBudapest);
                //Format: 
                String zdtBUD3Formatted = zdtBUD3.toString().replace("+01:00", "").replace("+02:00", "").replace("T", " ").replace("[Europe-Budapest]", "").replace("[Europe/Budapest]", "").replace("-", "/");
                //Convert TimeInSEAS to NY time:
                ZonedDateTime zdtNY3 = TimeInSEA.withZoneSameInstant​(zoneOfNewYork);
                //Format: 
                String zdtNY3Formatted = zdtNY3.toString().replace("-04:00", "").replace("-05:00", "").replace("T", " ").replace("[America-Puerto_Rico]", "").replace("[America/Puerto_Rico]", "").replace("-", "/");
                
                    
                    
                //Only the ones that start from the Budapest timezone
                if (whichFXML.equals("BudapestToFrankfurtFXML") | whichFXML.equals("BudapestToMunichFXML") | whichFXML.equals("BudapestToNewYorkFXML") | whichFXML.equals("BudapestToSeattleFXML") | whichFXML.equals("BudapestToTorontoFXML") | whichFXML.equals("BudapestToVancouverFXML") |
                        whichFXML.equals("FrankfurtToBudapestFXML") | whichFXML.equals("FrankfurtToMunichFXML") | whichFXML.equals("FrankfurtToNewYorkFXML") | whichFXML.equals("FrankfurtToSeattleFXML") | whichFXML.equals("FrankfurtToTorontoFXML") | whichFXML.equals("FrankfurtToVancouverFXML") |
                        whichFXML.equals("MunichToBudapestFXML") | whichFXML.equals("MunichToFrankfurtFXML") | whichFXML.equals("MunichToNewYorkFXML") | whichFXML.equals("MunichToSeattleFXML") | whichFXML.equals("MunichToTorontoFXML") | whichFXML.equals("MunichToVancouverFXML")) {
                    
                    //BP TimeZone
                    if (whichFXML.equals("BudapestToFrankfurtFXML") | whichFXML.equals("BudapestToMunichFXML") | whichFXML.equals("FrankfurtToBudapestFXML") | whichFXML.equals("FrankfurtToMunichFXML") | whichFXML.equals("MunichToBudapestFXML") | whichFXML.equals("MunichToFrankfurtFXML")) {
                        localTimeVar.setText(TimeInBpS);
                        timeInBPVar.setText(TimeInBpS);
                    } else if (whichFXML.equals("BudapestToNewYorkFXML") | whichFXML.equals("BudapestToTorontoFXML") | whichFXML.equals("FrankfurtToNewYorkFXML") | whichFXML.equals("FrankfurtToTorontoFXML") | whichFXML.equals("MunichToNewYorkFXML") | whichFXML.equals("MunichToTorontoFXML")) {
                        localTimeVar.setText(zdtNYFormatted);
                        timeInBPVar.setText(TimeInBpS);
                    } else if (whichFXML.equals("BudapestToSeattleFXML") | whichFXML.equals("BudapestToVancouverFXML") | whichFXML.equals("FrankfurtToSeattleFXML") | whichFXML.equals("FrankfurtToVancouverFXML") | whichFXML.equals("MunichToSeattleFXML") | whichFXML.equals("MunichToVancouverFXML")) {
                        localTimeVar.setText(zdtSEAFormatted);
                        timeInBPVar.setText(TimeInBpS);
                    }
                    
                    //Only the ones that start from the New York timezone
                } else if (whichFXML.equals("NewYorkToBudapestFXML") | whichFXML.equals("NewYorkToFrankfurtFXML") | whichFXML.equals("NewYorkToMunichFXML") | whichFXML.equals("NewYorkToSeattleFXML") | whichFXML.equals("NewYorkToTorontoFXML") | whichFXML.equals("NewYorkToVancouverFXML") |
                        whichFXML.equals("TorontoToBudapestFXML") | whichFXML.equals("TorontoToFrankfurtFXML") | whichFXML.equals("TorontoToMunichFXML") | whichFXML.equals("TorontoToNewYorkFXML") | whichFXML.equals("TorontoToSeattleFXML") | whichFXML.equals("TorontoToVancouverFXML")) {
                    
                    //NY TimeZone
                    if (whichFXML.equals("NewYorkToBudapestFXML") | whichFXML.equals("NewYorkToFrankfurtFXML") | whichFXML.equals("NewYorkToMunichFXML") | whichFXML.equals("TorontoToBudapestFXML") | whichFXML.equals("TorontoToFrankfurtFXML") | whichFXML.equals("TorontoToMunichFXML")) {
                        localTimeVar.setText(zdtBUD2Formatted);
                        timeInBPVar.setText(TimeInNYS);
                    } else if (whichFXML.equals("NewYorkToTorontoFXML") | whichFXML.equals("TorontoToNewYorkFXML")) {
                        localTimeVar.setText(TimeInNYS);
                        timeInBPVar.setText(TimeInNYS);
                    } else if (whichFXML.equals("NewYorkToSeattleFXML") | whichFXML.equals("NewYorkToVancouverFXML") | whichFXML.equals("TorontoToSeattleFXML") | whichFXML.equals("TorontoToVancouverFXML")) {
                        localTimeVar.setText(zdtSEA2Formatted);
                        timeInBPVar.setText(TimeInNYS);
                    }
                    
                    //Only the ones that start from the Seattle timezone
                } else if (whichFXML.equals("SeattleToBudapestFXML") | whichFXML.equals("SeattleToFrankfurtFXML") | whichFXML.equals("SeattleToMunichFXML") | whichFXML.equals("SeattleToNewYorkFXML") | whichFXML.equals("SeattleToTorontoFXML") | whichFXML.equals("SeattleToVancouverFXML") |
                        whichFXML.equals("VancouverToBudapestFXML") | whichFXML.equals("VancouverToFrankfurtFXML") | whichFXML.equals("VancouverToMunichFXML") | whichFXML.equals("VancouverToNewYorkFXML") | whichFXML.equals("VancouverToSeattleFXML") | whichFXML.equals("VancouverToTorontoFXML")) {
                    
                    //SEA TimeZone
                    if (whichFXML.equals("SeattleToBudapestFXML") | whichFXML.equals("SeattleToFrankfurtFXML") | whichFXML.equals("SeattleToMunichFXML") | whichFXML.equals("VancouverToBudapestFXML") | whichFXML.equals("VancouverToFrankfurtFXML") | whichFXML.equals("VancouverToMunichFXML")) {
                        localTimeVar.setText(zdtBUD3Formatted);
                        timeInBPVar.setText(TimeInSEAS);
                    } else if (whichFXML.equals("SeattleToNewYorkFXML") | whichFXML.equals("SeattleToTorontoFXML") | whichFXML.equals("VancouverToNewYorkFXML") | whichFXML.equals("VancouverToTorontoFXML")) {
                        localTimeVar.setText(zdtNY3Formatted);
                        timeInBPVar.setText(TimeInSEAS);
                    } else if (whichFXML.equals("SeattleToVancouverFXML") | whichFXML.equals("VancouverToSeattleFXML")) {
                        localTimeVar.setText(TimeInSEAS);
                        timeInBPVar.setText(TimeInSEAS);
                    }
                    
                }
                
                
                new Timeline(new KeyFrame(javafx.util.Duration.millis(2000),ae -> {
                    
                    localTimeVar.setVisible(true);
                    timeInBPVar.setVisible(true);
                    
                })).play();
                
                
                //Airplane animation
                
                plane2.setVisible(true);
                Path path = new Path();
                
                MoveTo moveTo = new MoveTo();
                moveTo.setX(620);
                moveTo.setY(278);
                
                QuadCurveTo quadTo = new QuadCurveTo();
                quadTo.setControlX(560);
                quadTo.setControlY(425);
                quadTo.setX(420);
                quadTo.setY(360);
                
                path.getElements().add(moveTo);
                path.getElements().add(quadTo);
                
                PathTransition pathTransition = new PathTransition();
                pathTransition.setDuration(javafx.util.Duration.millis(2000));
                pathTransition.setPath(path);
                pathTransition.setNode(plane2);
                pathTransition.setCycleCount(1);
                pathTransition.setAutoReverse(false);
                pathTransition.play(); 
                
                
            
            } catch (Exception e) {
                textField2error.setText("Invalid input");
                textField3error.setText("Invalid input");
                textField2error.setVisible(true);
                textField3error.setVisible(true);
                e.printStackTrace();
            }
    
                
     }
       
}           
    
    @FXML
    private AnchorPane shadowpane;

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private AnchorPane topBarPane;

    @FXML
    private HBox topBar;

    @FXML
    private Button minimizeButton;

    @FXML
    private Button closeButton;

    @FXML
    private Text text1;

    @FXML
    private Text text2;
    
    @FXML
    private Label localTimeVar; 

    @FXML
    private Label timeInBPVar;

    @FXML
    private TextField textField3;

    @FXML
    private TextField textField2;
    
    @FXML
    private Text currentTimeInBudapest;
    
    @FXML
    private Button resetButton;

    @FXML
    private Button nextButton;
    
    @FXML
    private ImageView flag1;
    
    @FXML
    private ImageView flag2;
    
    @FXML
    private DatePicker datePicker1;
    
    @FXML
    private Button backButton;

     @FXML
    private Text textField2error;

    @FXML
    private Text textField3error;

    
    //FORMATTER
    DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        plane2.setVisible(false); 
        mainAnchorPane.getChildren().add(plane2);
        plane2.setFitHeight(18);
        plane2.setFitWidth(35);

        plane2.setTranslateX(607);
        plane2.setTranslateY(278);
    
           
        minimizeButton.setOnAction(e -> {
                ((Stage)((Button)e.getSource()).getScene().getWindow()).setIconified(true);
        });
        
        shadowpane.setId("shadowpane");
        mainAnchorPane.setId("mainAnchorPane");
        topBar.setId("topBar");
        
        
        topBarPane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
            
        });
        
        topBarPane.setOnMouseDragged(mouseEvent -> {
            TimeZones2.primStage.setX(mouseEvent.getScreenX() - x); 
            TimeZones2.primStage.setY(mouseEvent.getScreenY() - y); 
            
        });
        
        //part of creating the custom topbar 
        Rectangle rect = new Rectangle(700,450);
        rect.setId("rect");
        rect.setArcHeight(15.0);
        rect.setArcWidth(15.0);
        rect.setArcHeight(15.0);
        rect.setArcWidth(15.0);
        mainAnchorPane.setClip(rect);
      
      
    //adding hint text to textFields 
      datePicker1.setPromptText("For ex. 4/7/2023");
      datePicker1.setFocusTraversable(false);
      textField2.setFocusTraversable(false);
      textField2.setPromptText("For ex. '06:15'");
      textField3.setFocusTraversable(false);
      textField3.setPromptText("For ex. '9:15'");
    
    
    localTimeVar.setVisible(false);
    timeInBPVar.setVisible(false);
    textField2error.setVisible(false);
    textField3error.setVisible(false);
      
    
   
    //Creating a current DATE & TIME obj with it's timezone so that it updates every second
          
        
        System.out.println(text1.getText());
        
    if (text1.getText().equals("Budapest To Frankfurt") || text1.getText().equals("Budapest To Munich") || text1.getText().equals("Budapest To New York") || text1.getText().equals("Budapest To Seattle") || text1.getText().equals("Budapest To Toronto") || text1.getText().equals("Budapest To Vancouver") ||
        text1.getText().equals("Frankfurt To Budapest") || text1.getText().equals("Frankfurt To Munich") || text1.getText().equals("Frankfurt To New York") || text1.getText().equals("Frankfurt To Seattle") || text1.getText().equals("Frankfurt To Toronto") || text1.getText().equals("Frankfurt To Vancouver") ||
        text1.getText().equals("Munich To Budapest") || text1.getText().equals("Munich To Frankfurt") || text1.getText().equals("Munich To New York") || text1.getText().equals("Munich To Seattle") || text1.getText().equals("Munich To Toronto") || text1.getText().equals("Munich To Vancouver")) {    
        
       s = ZonedDateTime.now(ZoneId.of("Europe/Budapest")).format(FORMATTER); //This is needed here bc displaying it cannot be delayed
        //=> "20140829 14:12:22 +09"
                                //Z
        currentTimeInBudapest.setText(s);
        final Timeline timeline;
        timeline = new Timeline(new KeyFrame(javafx.util.Duration.seconds(1), 
                new EventHandler() {
                    @Override
                    public void handle(Event event) {
                        s = ZonedDateTime.now(ZoneId.of("Europe/Budapest")).format(FORMATTER);
                        currentTimeInBudapest.setText(s);
                    }
                }
        ));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        
    } else if (text1.getText().equals("New York To Budapest") || text1.getText().equals("New York To Frankfurt") || text1.getText().equals("New York To Munich") || text1.getText().equals("New York To Seattle") || text1.getText().equals("New York To Toronto") || text1.getText().equals("New York To Vancouver") ||
               text1.getText().equals("Toronto To Budapest") || text1.getText().equals("Toronto To Frankfurt") || text1.getText().equals("Toronto To Munich") || text1.getText().equals("Toronto To New York") || text1.getText().equals("Toronto To Seattle") || text1.getText().equals("Toronto To Vancouver")) {
    
        s = ZonedDateTime.now(ZoneId.of("America/Puerto_Rico")).format(FORMATTER); //This is needed here bc displaying it cannot be delayed
        //=> "20140829 14:12:22 +09"
                                //Z
        currentTimeInBudapest.setText(s);
        final Timeline timeline;
        timeline = new Timeline(new KeyFrame(javafx.util.Duration.seconds(1), 
                new EventHandler() {
                    @Override
                    public void handle(Event event) {
                        s = ZonedDateTime.now(ZoneId.of("America/Puerto_Rico")).format(FORMATTER);
                        currentTimeInBudapest.setText(s);
                    }
                }
        ));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        
    } else if (text1.getText().equals("Seattle To Budapest") || text1.getText().equals("Seattle To Frankfurt") || text1.getText().equals("Seattle To Munich") || text1.getText().equals("Seattle To New York") || text1.getText().equals("Seattle To Toronto") || text1.getText().equals("Seattle To Vancouver") ||
               text1.getText().equals("Vancouver To Budapest") || text1.getText().equals("Vancouver To Frankfurt") || text1.getText().equals("Vancouver To Munich") || text1.getText().equals("Vancouver To New York") || text1.getText().equals("Vancouver To Toronto") || text1.getText().equals("Vancouver To Seattle")) {    
      
        s = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")).format(FORMATTER); //This is needed here bc displaying it cannot be delayed
        //=> "20140829 14:12:22 +09"
                                //Z
        currentTimeInBudapest.setText(s);
        final Timeline timeline;
        timeline = new Timeline(new KeyFrame(javafx.util.Duration.seconds(1), 
                new EventHandler() {
                    @Override
                    public void handle(Event event) {
                        s = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")).format(FORMATTER);
                        currentTimeInBudapest.setText(s);
                    }
                }
        ));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        
    }    
  }     
}
