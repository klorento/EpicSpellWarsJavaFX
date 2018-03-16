package sample;

import gameMechanics.ThrowADice;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;

import java.io.IOException;

public class ControllerAppScreen3 {
    private ControllerMain controllerMain;

    @FXML
    public void throwADice(){
        new ThrowADice();
    }

    @FXML
    public void backMenu(){
         controllerMain.loadStartScreen();
    }
    @FXML
    public void endPage(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/TheFinalPageApplication4.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ControllerTheFinalPageApplication4 controllerTheFinalPageApplication4 = loader.getController();
        controllerTheFinalPageApplication4.setControllerMain(controllerMain);
        controllerMain.setScreen(pane);
    }

    public void setControllerMain(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
    }
    @FXML
    TilePane www;

    public void setImageWizardOne() {
        ImageView imageWizardOne = new ImageView(new Image(getClass().getResourceAsStream("/images/wizards/wizardsmale/1playermaly8.jpg")));
        www.getChildren().add(imageWizardOne);
    }
}
