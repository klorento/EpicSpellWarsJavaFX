package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ControllerTheSpellPage4 {
    private ControllerMain controllerMain;



    @FXML
    public void finalPage() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/TheFinalPage5.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ControllerTheFinalPage5 controllerTheFinalPage5 = loader.getController();

        controllerTheFinalPage5.setControllerMain(controllerMain);
        controllerMain.setScreen(pane);
    }


    public void setControllerMain(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
    }
}
