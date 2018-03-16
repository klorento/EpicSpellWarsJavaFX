package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import players.UserPlayer;

import java.io.IOException;

public class ControllerMenuScreen2 {

    private ControllerMain controllerMain;

    @FXML
    private Button confirmNickname;

    @FXML
    private TextField nick;

    @FXML
    private Label welcome;

    @FXML
    private Label welcomePlayer;

    private UserPlayer userPlayer = new UserPlayer();

    @FXML
    public void initialize(){
        nick.textProperty().bindBidirectional(userPlayer.propertyTextFieldProperty());
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
    public void openApplication(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/AppScreen3.fxml"));
        Pane pane = null;
        try {
             pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerAppScreen3 controllerAppScreen3 = loader.getController();
        controllerAppScreen3.setControllerMain(controllerMain);
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
