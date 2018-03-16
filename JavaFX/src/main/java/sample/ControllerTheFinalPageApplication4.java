package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class ControllerTheFinalPageApplication4 {
    private ControllerMain controllerMain;
    @FXML
    public void openApplication(){
        controllerMain.loadStartScreen();
    }
    @FXML
    public void exitApplication(){
        Platform.exit();
    }

    public void setControllerMain(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
    }
}
