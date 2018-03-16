package sample;





import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;

import javafx.scene.layout.Pane;

import javafx.scene.layout.StackPane;



import java.io.IOException;



public class ControllerMain {

    @FXML

    private StackPane mainStackPane;


    @FXML

    public void initialize() {

        loadStartScreen();

    }


    public void loadStartScreen() {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/AppStart1.fxml"));

        Pane pane = null;

        try {

            pane = loader.load();

        } catch (IOException e) {

            e.printStackTrace();

        }

        ControllerAppStart1 appStart = loader.getController();

        appStart.setControllerMain(this);

        setScreen(pane);

    }


    public void setScreen(Pane pane) {

        mainStackPane.getChildren().clear();

        mainStackPane.getChildren().add(pane);

    }

}