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
    public void initialize(){
        loadMenuScreen();
    }

    public void loadMenuScreen() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen.fxml"));
        Pane pane = null;
        try {
              pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerMenuScreen menuScreen = loader.getController();
        menuScreen.setControllerMain(this);
        setScreen(pane);
    }

    public void setScreen(Pane pane) {
        mainStackPane.getChildren().clear();
        mainStackPane.getChildren().add(pane);
    }
}
