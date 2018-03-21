package sample;

import gameMechanics.ApplicationState;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import players.UserPlayer;

import java.io.IOException;

public class ControllerMenuScreen2 {

    private ControllerMain controllerMain;
    @FXML
    private TilePane imageWizardDwa;
    @FXML
    private TilePane imageWizardJeden;

    @FXML
    private Button buttonW1;
    @FXML
    private Button buttonW2;
    @FXML
    private Button buttonW3;
    @FXML
    private Button buttonW4;
    @FXML
    private Button buttonW5;
    @FXML
    private Button buttonW6;
    @FXML
    private Button buttonW7;
    @FXML
    private Button buttonW8;

    @FXML
    private Button confirmNickname;
    private ControllerAppScreen3 controllerAppScreen3;
    @FXML
    private ToggleButton cardOne;

    @FXML
    private TextField nick;

    @FXML
    private Label welcome;

    @FXML
    private Label welcomePlayer;
    @FXML
    private Button buttonStartGame;
    @FXML
    private Pane paneApp3;
    @FXML
    private Button buttonSetWizardJeden;

    private UserPlayer userPlayer = new UserPlayer();
    @FXML
    public void openApplication(){

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/AppScreen3.fxml"));
        Pane pane = null;
        try {

            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ControllerAppScreen3 controllerAppScreen3 = loader.getController();
//        controllerAppScreen3.initListenerTwo();
//        buttonStartGame.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent event) {
//                controllerAppScreen3.setImage(ApplicationState.getInstance().getWizardPicture(),ApplicationState.getInstance().getWizardPictureMaly());
//            }
//        });


        controllerAppScreen3.setImage();
        controllerAppScreen3.setControllerMain(controllerMain);
        controllerMain.setScreen(pane);


    }

    @FXML
    public void initialize(){
        nick.textProperty().bindBidirectional(userPlayer.propertyTextFieldProperty());
    }


    public void initListener(){
        EventHandler handler = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                if(event.getSource().equals(buttonW1)) {
                        ApplicationState.getInstance().setWizardPictureMaly("/images/wizards/wizardsmale/1playermaly8.jpg");
                        ApplicationState.getInstance().setWizardPicture("/images/wizards/wizardsDuze/e1.jpg");
                }else if(event.getSource().equals(buttonW2)){
                    ApplicationState.getInstance().setWizardPictureMaly("/images/wizards/wizardsmale/2playermaly1.jpg");
                    ApplicationState.getInstance().setWizardPicture("/images/wizards/wizardsDuze/e2.jpg");
                }else if(event.getSource().equals(buttonW3)){
                    ApplicationState.getInstance().setWizardPictureMaly("/images/wizards/wizardsmale/3playermaly7.jpg");
                    ApplicationState.getInstance().setWizardPicture("/images/wizards/wizardsDuze/e3.jpg");
                }else if(event.getSource().equals(buttonW4)){
                    ApplicationState.getInstance().setWizardPictureMaly("/images/wizards/wizardsmale/4playermaly6.jpg");
                    ApplicationState.getInstance().setWizardPicture("/images/wizards/wizardsDuze/e4.jpg");
                }else if(event.getSource().equals(buttonW5)){
                    ApplicationState.getInstance().setWizardPictureMaly("/images/wizards/wizardsmale/5playermaly5.jpg");
                    ApplicationState.getInstance().setWizardPicture("/images/wizards/wizardsDuze/e5.jpg");
                }else if(event.getSource().equals(buttonW6)){
                    ApplicationState.getInstance().setWizardPictureMaly("/images/wizards/wizardsmale/6playermaly4.jpg");
                    ApplicationState.getInstance().setWizardPicture("/images/wizards/wizardsDuze/e6.jpg");
                }else if(event.getSource().equals(buttonW7)){
                    ApplicationState.getInstance().setWizardPictureMaly("/images/wizards/wizardsmale/7playermaly3.jpg");
                    ApplicationState.getInstance().setWizardPicture("/images/wizards/wizardsDuze/e7.jpg");
                }else if(event.getSource().equals(buttonW8)){
                    ApplicationState.getInstance().setWizardPictureMaly("/images/wizards/wizardsmale/8playermaly2.jpg");
                    ApplicationState.getInstance().setWizardPicture("/images/wizards/wizardsDuze/e8.jpg");
                }

            }
        };
        buttonW1.setOnAction(handler);
        buttonW2.setOnAction(handler);
        buttonW3.setOnAction(handler);
        buttonW4.setOnAction(handler);
        buttonW5.setOnAction(handler);
        buttonW6.setOnAction(handler);
        buttonW7.setOnAction(handler);
        buttonW8.setOnAction(handler);
//        buttonStartGame.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent event) {
//                imageWizardDwa.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream(ApplicationState.getInstance().getWizardPictureMaly()))));
//                imageWizardJeden.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream(ApplicationState.getInstance().getWizardPicture()))));
//            }
//        });

    }


    @FXML
    public void writeNickname(){
        welcomePlayer.textProperty().bind(userPlayer.propertyTextFieldProperty());
        welcome.setText("Welcome in Epic Spell Wars");
    }

    //private ControllerAppScreen3 controllerAppScreen3;


    @FXML
    public void setWizardOne(){
        //controllerAppScreen3.setImageWizardOne();
    }
    @FXML
    public void exitApplication(){
        Platform.exit();
    }

    public void setControllerMain(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
    }


}
