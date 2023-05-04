
package timezones2.main;

import static java.lang.Math.random;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import timezones2.Budapest.BudapestScenes;
import timezones2.Frankfurt.FrankfurtScenes;
import timezones2.Munich.MunichScenes;
import timezones2.NewYork.NewYorkScenes; 
import timezones2.Seattle.SeattleScenes;
import timezones2.Toronto.TorontoScenes;
import timezones2.Vancouver.VancouverScenes;

public class FXMLDocumentController implements Initializable {
    
    double x = 0, y = 0;
    
    
    @FXML
    void close(ActionEvent event) {
        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        stage.close();
    }
    
        
    @FXML
    private AnchorPane topBarPane;
    
    @FXML
    private HBox topBar;
    
    @FXML
    private Button closeButton;
    
    @FXML
    private Button minimizeButton;
    
    @FXML
    private AnchorPane shadowpane;
    
    @FXML
    private AnchorPane mainAnchorPane;
    
   
    @FXML
    private Text title;
    
    @FXML
    private MenuButton menubutton;

    @FXML
    private MenuItem budapest;

    @FXML
    private MenuItem frankfurt;

    @FXML
    private MenuItem munich;

    @FXML
    private MenuItem newyork;

    @FXML
    private MenuItem seattle;

    @FXML
    private MenuItem toronto;

    @FXML
    private MenuItem vancouver;

    @FXML
    private MenuButton menubutton2;

    @FXML
    private MenuItem budapest2;

    @FXML
    private MenuItem frankfurt2;

    @FXML
    private MenuItem munich2;

    @FXML
    private MenuItem newyork2;

    @FXML
    private MenuItem seattle2;

    @FXML
    private MenuItem toronto2;

    @FXML
    private MenuItem vancouver2;

    @FXML
    private Text toTxt;

    @FXML
    private Text fromTxt;
    
    @FXML
    private Button next;
    
    Text errorTxt = new Text("Invalid input");
    Text errorTxt2 = new Text("Invalid input");
    
    
    
    @FXML
    void open(ActionEvent event)throws Exception {
        
        
        BudapestScenes bpscenes = new BudapestScenes();
        FrankfurtScenes frscenes = new FrankfurtScenes();
        MunichScenes muscenes = new MunichScenes();
        NewYorkScenes nyscenes = new NewYorkScenes();
        SeattleScenes sescenes = new SeattleScenes();
        TorontoScenes toscenes = new TorontoScenes();
        VancouverScenes vascenes = new VancouverScenes();
        
        //If the text on the menu objects are set, open the appropriate scene
                //BUDAPEST
                    if(menubutton.getText().equals(budapest.getText()) & menubutton2.getText().equals(frankfurt2.getText())){
                            
                        TimeZones2.primStage.setScene(bpscenes.BudapestToFrankfurtScene()); 
                        
                    } else if(menubutton.getText().equals(budapest.getText()) & menubutton2.getText().equals(munich2.getText())) {
                    
                        TimeZones2.primStage.setScene(bpscenes.BudapestToMunichScene());
                        
                    } else if(menubutton.getText().equals(budapest.getText()) & menubutton2.getText().equals(newyork2.getText())) {
                    
                        TimeZones2.primStage.setScene(bpscenes.BudapestToNewYorkScene());
                        
                    } else if(menubutton.getText().equals(budapest.getText()) & menubutton2.getText().equals(seattle2.getText())) {
                    
                        TimeZones2.primStage.setScene(bpscenes.BudapestToSeattleScene());
                        
                    } else if(menubutton.getText().equals(budapest.getText()) & menubutton2.getText().equals(toronto2.getText())) {
                    
                        TimeZones2.primStage.setScene(bpscenes.BudapestToTorontoScene());
                        
                    } else if(menubutton.getText().equals(budapest.getText()) & menubutton2.getText().equals(vancouver2.getText())) {
                    
                        TimeZones2.primStage.setScene(bpscenes.BudapestToVancouverScene());
                        
                    } else if(menubutton.getText().equals(budapest.getText()) & menubutton2.getText().equals(budapest2.getText())) {
                    
                        errorTxt.setVisible(true);
                        errorTxt2.setVisible(true);
                        
                    } 
                    //FRANKFURT
                    else if(menubutton.getText().equals(frankfurt.getText()) & menubutton2.getText().equals(budapest2.getText())){
                            
                        TimeZones2.primStage.setScene(frscenes.FrankfurtToBudapestScene());
                    
                    } else if(menubutton.getText().equals(frankfurt.getText()) & menubutton2.getText().equals(frankfurt2.getText())){
                            
                        errorTxt.setVisible(true);
                        errorTxt2.setVisible(true);
                    
                    } else if(menubutton.getText().equals(frankfurt.getText()) & menubutton2.getText().equals(munich2.getText())){
                            
                        TimeZones2.primStage.setScene(frscenes.FrankfurtToMunichScene());
                    
                    } else if(menubutton.getText().equals(frankfurt.getText()) & menubutton2.getText().equals(newyork2.getText())){
                            
                        TimeZones2.primStage.setScene(frscenes.FrankfurtToNewYorkScene());
                    
                    } else if(menubutton.getText().equals(frankfurt.getText()) & menubutton2.getText().equals(seattle2.getText())){
                            
                        TimeZones2.primStage.setScene(frscenes.FrankfurtToSeattleScene());
                    
                    } else if(menubutton.getText().equals(frankfurt.getText()) & menubutton2.getText().equals(toronto2.getText())){
                            
                        TimeZones2.primStage.setScene(frscenes.FrankfurtToTorontoScene());
                    
                    } else if(menubutton.getText().equals(frankfurt.getText()) & menubutton2.getText().equals(vancouver2.getText())){
                            
                        TimeZones2.primStage.setScene(frscenes.FrankfurtToVancouverScene());
                    
                    }
                    //MUNICH
                    else if (menubutton.getText().equals(munich.getText()) & menubutton2.getText().equals(budapest2.getText())){
                            
                        TimeZones2.primStage.setScene(muscenes.MunichToBudapestScene());
                    
                    } else if (menubutton.getText().equals(munich.getText()) & menubutton2.getText().equals(frankfurt2.getText())){
                            
                        TimeZones2.primStage.setScene(muscenes.MunichToFrankfurtScene());
                    
                    }
                    else if (menubutton.getText().equals(munich.getText()) & menubutton2.getText().equals(munich2.getText())){
                            
                        errorTxt.setVisible(true);
                        errorTxt2.setVisible(true);
                    
                    } else if (menubutton.getText().equals(munich.getText()) & menubutton2.getText().equals(newyork2.getText())){
                            
                        TimeZones2.primStage.setScene(muscenes.MunichToNewYorkScene());
                    
                    } else if (menubutton.getText().equals(munich.getText()) & menubutton2.getText().equals(seattle2.getText())){
                            
                        TimeZones2.primStage.setScene(muscenes.MunichToSeattleScene());
                    
                    } else if (menubutton.getText().equals(munich.getText()) & menubutton2.getText().equals(toronto2.getText())){
                            
                        TimeZones2.primStage.setScene(muscenes.MunichToTorontoScene());
                    
                    } else if (menubutton.getText().equals(munich.getText()) & menubutton2.getText().equals(vancouver2.getText())){
                            
                        TimeZones2.primStage.setScene(muscenes.MunichToVancouverScene());
                    
                    }
                    //NEW YORK
                    else if (menubutton.getText().equals(newyork.getText()) & menubutton2.getText().equals(budapest2.getText())){
                            
                        TimeZones2.primStage.setScene(nyscenes.NewYorkToBudapestScene());
                    
                    } else if (menubutton.getText().equals(newyork.getText()) & menubutton2.getText().equals(frankfurt2.getText())){
                            
                        TimeZones2.primStage.setScene(nyscenes.NewYorkToFrankfurtScene());
                    
                    } else if (menubutton.getText().equals(newyork.getText()) & menubutton2.getText().equals(munich2.getText())){
                            
                        TimeZones2.primStage.setScene(nyscenes.NewYorkToMunichScene());
                    
                    } else if (menubutton.getText().equals(newyork.getText()) & menubutton2.getText().equals(newyork2.getText())){
                            
                        errorTxt.setVisible(true);
                        errorTxt2.setVisible(true);
                    
                    } else if (menubutton.getText().equals(newyork.getText()) & menubutton2.getText().equals(seattle2.getText())){
                            
                        TimeZones2.primStage.setScene(nyscenes.NewYorkToSeattleScene());
                    
                    } else if (menubutton.getText().equals(newyork.getText()) & menubutton2.getText().equals(toronto2.getText())){
                            
                        TimeZones2.primStage.setScene(nyscenes.NewYorkToTorontoScene());
                    
                    } else if (menubutton.getText().equals(newyork.getText()) & menubutton2.getText().equals(vancouver2.getText())){
                            
                        TimeZones2.primStage.setScene(nyscenes.NewYorkToVancouverScene());
                    
                    }
                    //SEATTLE
                    else if (menubutton.getText().equals(seattle.getText()) & menubutton2.getText().equals(budapest2.getText())){
                            
                        TimeZones2.primStage.setScene(sescenes.SeattleToBudapestScene());
                    
                    } else if (menubutton.getText().equals(seattle.getText()) & menubutton2.getText().equals(frankfurt2.getText())){
                            
                        TimeZones2.primStage.setScene(sescenes.SeattleToFrankfurtScene());
                    
                    } else if (menubutton.getText().equals(seattle.getText()) & menubutton2.getText().equals(munich2.getText())){
                            
                        TimeZones2.primStage.setScene(sescenes.SeattleToMunichScene());
                    
                    } else if (menubutton.getText().equals(seattle.getText()) & menubutton2.getText().equals(newyork2.getText())){
                            
                        TimeZones2.primStage.setScene(sescenes.SeattleToNewYorkScene());
                    
                    } else if (menubutton.getText().equals(seattle.getText()) & menubutton2.getText().equals(seattle2.getText())){
                            
                        errorTxt.setVisible(true);
                        errorTxt2.setVisible(true);
                        
                    } else if (menubutton.getText().equals(seattle.getText()) & menubutton2.getText().equals(toronto2.getText())){
                            
                        TimeZones2.primStage.setScene(sescenes.SeattleToTorontoScene());
                    
                    } else if (menubutton.getText().equals(seattle.getText()) & menubutton2.getText().equals(vancouver2.getText())){
                            
                        TimeZones2.primStage.setScene(sescenes.SeattleToVancouverScene());
                    
                    } 
                    //TORONTO
                    else if (menubutton.getText().equals(toronto.getText()) & menubutton2.getText().equals(budapest2.getText())){
                            
                        TimeZones2.primStage.setScene(toscenes.TorontoToBudapestScene());
                    
                    } else if (menubutton.getText().equals(toronto.getText()) & menubutton2.getText().equals(frankfurt2.getText())){
                            
                        TimeZones2.primStage.setScene(toscenes.TorontoToFrankfurtScene());
                    
                    } else if (menubutton.getText().equals(toronto.getText()) & menubutton2.getText().equals(munich2.getText())){
                            
                        TimeZones2.primStage.setScene(toscenes.TorontoToMunichScene());
                    
                    } else if (menubutton.getText().equals(toronto.getText()) & menubutton2.getText().equals(newyork2.getText())){
                            
                        TimeZones2.primStage.setScene(toscenes.TorontoToNewYorkScene());
                    
                    } else if (menubutton.getText().equals(toronto.getText()) & menubutton2.getText().equals(seattle2.getText())){
                            
                        TimeZones2.primStage.setScene(toscenes.TorontoToSeattleScene());
                    
                    } else if (menubutton.getText().equals(toronto.getText()) & menubutton2.getText().equals(toronto2.getText())){
                            
                        errorTxt.setVisible(true);
                        errorTxt2.setVisible(true);
                    
                    } else if (menubutton.getText().equals(toronto.getText()) & menubutton2.getText().equals(vancouver2.getText())){
                            
                        TimeZones2.primStage.setScene(toscenes.TorontoToVancouverScene());
                    
                    } 
                    //VANCOUVER
                    else if (menubutton.getText().equals(vancouver.getText()) & menubutton2.getText().equals(budapest2.getText())){
                            
                        TimeZones2.primStage.setScene(vascenes.VancouverToBudapestScene());
                    
                    } else if (menubutton.getText().equals(vancouver.getText()) & menubutton2.getText().equals(frankfurt2.getText())){
                            
                        TimeZones2.primStage.setScene(vascenes.VancouverToFrankfurtScene());
                    
                    } else if (menubutton.getText().equals(vancouver.getText()) & menubutton2.getText().equals(munich2.getText())){
                            
                        TimeZones2.primStage.setScene(vascenes.VancouverToMunichScene());
                    
                    } else if (menubutton.getText().equals(vancouver.getText()) & menubutton2.getText().equals(newyork2.getText())){
                            
                        TimeZones2.primStage.setScene(vascenes.VancouverToNewYorkScene());
                    
                    } else if (menubutton.getText().equals(vancouver.getText()) & menubutton2.getText().equals(seattle2.getText())){
                            
                        TimeZones2.primStage.setScene(vascenes.VancouverToSeattleScene());
                    
                    } else if (menubutton.getText().equals(vancouver.getText()) & menubutton2.getText().equals(toronto2.getText())){
                            
                        TimeZones2.primStage.setScene(vascenes.VancouverToTorontoScene());
                    
                    } else if (menubutton.getText().equals(vancouver.getText()) & menubutton2.getText().equals(vancouver2.getText())){
                            
                        errorTxt.setVisible(true);
                        errorTxt2.setVisible(true);
                        
                    } else if (menubutton.getText().equals("Choose starting point:") & menubutton2.getText().equals("Choose destination:") |
                              menubutton.getText().equals("Choose starting point:") | menubutton2.getText().equals("Choose destination:")) {
                       
                        errorTxt.setVisible(true);
                        errorTxt2.setVisible(true);
                    }
    }


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
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
        
        minimizeButton.setOnAction(e -> {
                ((Stage)((Button)e.getSource()).getScene().getWindow()).setIconified(true);
            });
        
        closeButton.setOnAction(e -> {
                Platform.exit();
            });
        
        
        Rectangle rect = new Rectangle(300,450);
        rect.setId("rect");
        rect.setArcHeight(15.0);
        rect.setArcWidth(15.0);
        rect.setArcHeight(15.0);
        rect.setArcWidth(15.0);
       
        
      mainAnchorPane.setClip(rect);
      
      //____________________________________________________________________________________________________________
      
      errorTxt.setVisible(false);
      errorTxt2.setVisible(false);
      errorTxt.setId("errorTxt");
      errorTxt2.setId("errorTxt2");
      errorTxt.setFill(Paint.valueOf("#fd483f"));
      errorTxt2.setFill(Paint.valueOf("#fd483f"));
      mainAnchorPane.getChildren().add(errorTxt);
      mainAnchorPane.getChildren().add(errorTxt2);
      errorTxt.setTranslateX(31);
      errorTxt.setTranslateY(207);
      errorTxt2.setTranslateX(31);
      errorTxt2.setTranslateY(280);
      
     
        
     
    //Creating events & adding them to the MenuItems to execute when clicked
    EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                
                menubutton.setText(budapest.getText());
            }
        };
    
    budapest.setOnAction(event1);
    
    //
    
    EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton.setText(frankfurt.getText());
            }
        };
    
    frankfurt.setOnAction(event2);
    
    //
    
    EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton.setText(munich.getText());
            }
        };
    
    munich.setOnAction(event3);
    
    //
    
    EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton.setText(newyork.getText());
            }
        };
    
    newyork.setOnAction(event4);
    
    //
    
    EventHandler<ActionEvent> event5 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton.setText(seattle.getText());
            }
        };
    
    seattle.setOnAction(event5);
    
    //
    
    EventHandler<ActionEvent> event6 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton.setText(toronto.getText());
            }
        };
    
    toronto.setOnAction(event6);
    
    //
    
    EventHandler<ActionEvent> event7 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton.setText(vancouver.getText());
            }
        };
    
    vancouver.setOnAction(event7);
      
    
        //Creating events & adding them to the MenuItems to execute when clicked
    EventHandler<ActionEvent> event8 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton2.setText(budapest2.getText());
            }
        };
    
    budapest2.setOnAction(event8);
    
    //
    
    EventHandler<ActionEvent> event9 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton2.setText(frankfurt2.getText());
            }
        };
    
    frankfurt2.setOnAction(event9);
    
    //
    
    EventHandler<ActionEvent> event10 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton2.setText(munich2.getText());
            }
        };
    
    munich2.setOnAction(event10);
    
    //
    
    EventHandler<ActionEvent> event11 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton2.setText(newyork2.getText());
            }
        };
    
    newyork2.setOnAction(event11);
    
    //
    
    EventHandler<ActionEvent> event12 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton2.setText(seattle2.getText());
            }
        };
    
    seattle2.setOnAction(event12);
    
    //
    
    EventHandler<ActionEvent> event13 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton2.setText(toronto2.getText());
            }
        };
    
    toronto2.setOnAction(event13);
    
    //
    
    EventHandler<ActionEvent> event14 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                menubutton2.setText(vancouver2.getText());
            }
        };
    
    vancouver2.setOnAction(event14);
    
    //BG ANIMATION
    //for loop
    Group shapes = new Group();
    for (int i = 0; i < 18; i++) {
        
        Circle circleObj = new Circle(20, Color.web("#FFFFFF", 0.6));
        circleObj.setStrokeType(StrokeType.OUTSIDE);
        circleObj.setStroke(Color.web("#FFFFFF", 0.30));
        circleObj.setStrokeWidth(10);
        
        shapes.getChildren().add(circleObj);
       
                
       Group layer2 = new Group(shapes);  
       
       mainAnchorPane.getChildren().add(layer2);
        
        
        layer2.toBack();
        
        menubutton.toFront();
        menubutton2.toFront();
        next.toFront();
        minimizeButton.toFront();
        closeButton.toFront();
        topBar.toFront();
        toTxt.toFront();
        fromTxt.toFront();
        title.toFront();
        topBarPane.toFront();
        
        
    }
    
    //add effect 
    shapes.setEffect(new BoxBlur(10, 10, 3));
    
    

        Timeline timeline = new Timeline();
    for (Node node : shapes.getChildren()) {
    timeline.getKeyFrames().addAll(
        new KeyFrame(Duration.ZERO, 
            new KeyValue(node.translateXProperty(), random() * 300),
            new KeyValue(node.translateYProperty(), random() * 425)
        ),
        new KeyFrame(new Duration(40000), 
            new KeyValue(node.translateXProperty(), random() * 300),
            new KeyValue(node.translateYProperty(), random() * 425)
        )
    );
   
    timeline.setAutoReverse(true);
    timeline.setCycleCount(Animation.INDEFINITE);
    
    }

    timeline.play();
      
    }    
    
}
