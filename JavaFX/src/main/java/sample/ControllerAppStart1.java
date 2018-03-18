package sample;



import javafx.application.Platform;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;

import javafx.scene.layout.Pane;



import java.io.IOException;



public class ControllerAppStart1 {



    private ControllerMain controllerMain;





    public void initialize(){}



    @FXML

    public void openMenu(){

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen2.fxml"));

        Pane pane = null;

        try {

            pane = loader.load();

        } catch (IOException e) {

            e.printStackTrace();

        }

        ControllerMenuScreen2 controllerMenuScreen2 = loader.getController();
        controllerMenuScreen2.initListener();

        controllerMenuScreen2.setControllerMain(controllerMain);
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