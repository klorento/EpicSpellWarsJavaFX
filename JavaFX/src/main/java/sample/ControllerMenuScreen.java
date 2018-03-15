package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import players.Player;

import java.io.IOException;

public class ControllerMenuScreen {

    private ControllerMain controllerMain;

    @FXML
    private TextField nick;

    @FXML
    private Label welcomePlayer;

    private Player player = new Player();

    @FXML
    public void initialize(){
        nick.textProperty().bindBidirectional(player.propertyTextFieldProperty());
        welcomePlayer.textProperty().bind(player.propertyTextFieldProperty());
    }

    @FXML
    public void writeNickname(){

    }
    @FXML
    public void openApplication(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/AppScreen.fxml"));
        Pane pane = null;
        try {
             pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerAppScreen controllerAppScreen = loader.getController();
        controllerAppScreen.setControllerMain(controllerMain);
        controllerMain.setScreen(pane);
    }
    @FXML
    public void exitApplication(){
        Platform.exit();
    }

    public void setControllerMain(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
    }
}
