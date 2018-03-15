package sample;

import gameMechanics.ThrowADice;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ControllerAppScreen {
    private ControllerMain controllerMain;

    @FXML
    public void throwADice(){
        new ThrowADice();
    }

    @FXML
    public void backMenu(){
         controllerMain.loadMenuScreen();
    }
    @FXML
    public void endPage(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/TheFinalPageApplication.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerTheFinalPageApplication controllerTheFinalPageApplication = loader.getController();
        controllerTheFinalPageApplication.setControllerMain(controllerMain);
        controllerMain.setScreen(pane);
    }

    public void setControllerMain(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
    }
}
