package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ControllerTheFinalPageApplication {
    private ControllerMain controllerMain;
    @FXML
    public void openApplication(){
        controllerMain.loadMenuScreen();
    }
    @FXML
    public void exitApplication(){
        Platform.exit();
    }

    public void setControllerMain(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
    }
}
