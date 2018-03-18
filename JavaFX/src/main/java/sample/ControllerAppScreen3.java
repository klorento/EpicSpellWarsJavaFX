package sample;

import gameMechanics.ApplicationState;
import gameMechanics.ThrowADice;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ControllerAppScreen3 {
    private ControllerMain controllerMain;
    @FXML
    private TilePane imageWizardOpponentTwo;
    @FXML
    private TilePane imageWizardOpponentThree;
    @FXML
    private TilePane imageWizardDwa;
    @FXML
    private TilePane imageWizardOpponentOne;

    @FXML
    public void throwADice(){
        new ThrowADice();
    }

    @FXML
    public void backMenu(){
         controllerMain.loadStartScreen();
    }
    @FXML
    private TilePane imageWizardJeden;
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


    @FXML
    public void setImage() {
        ImageView imageWizardOne = new ImageView(new Image(getClass().getResourceAsStream(ApplicationState.getInstance().getWizardPictureMaly())));
        ImageView imageWizardTwo = new ImageView(new Image(getClass().getResourceAsStream(ApplicationState.getInstance().getWizardPicture())));
        imageWizardDwa.getChildren().add(imageWizardTwo);
        imageWizardJeden.getChildren().add(imageWizardOne);
        List<String> listSmallPicture = new ArrayList<String>();
        listSmallPicture.add("/images/wizards/wizardsmale/1playermaly8.jpg");
        listSmallPicture.add("/images/wizards/wizardsmale/2playermaly1.jpg");
        listSmallPicture.add("/images/wizards/wizardsmale/3playermaly7.jpg");
        listSmallPicture.add("/images/wizards/wizardsmale/4playermaly6.jpg");
        listSmallPicture.add("/images/wizards/wizardsmale/5playermaly5.jpg");
        listSmallPicture.add("/images/wizards/wizardsmale/6playermaly4.jpg");
        listSmallPicture.add("/images/wizards/wizardsmale/7playermaly3.jpg");
        listSmallPicture.add("/images/wizards/wizardsmale/8playermaly2.jpg");

        Random random = new Random();
        random.nextInt(8);

        for (String urlPicture : listSmallPicture) {
            if (!urlPicture.equals(ApplicationState.getInstance().getWizardPictureMaly())) {
                ImageView imageWizardOpponentOne1 = new ImageView(new Image(getClass().getResourceAsStream(urlPicture)));
                imageWizardOpponentOne.getChildren().add(imageWizardOpponentOne1);
                listSmallPicture.remove(ApplicationState.getInstance().getWizardPictureMaly());
                ApplicationState.getInstance().setWizardPictureMaly(urlPicture);
                break;
            }
        }
        for (String urlPicture : listSmallPicture) {
            if (!urlPicture.equals(ApplicationState.getInstance().getWizardPictureMaly())) {
                ImageView imageWizardOpponentTwo2 = new ImageView(new Image(getClass().getResourceAsStream(urlPicture)));
                imageWizardOpponentTwo.getChildren().add(imageWizardOpponentTwo2);

                listSmallPicture.remove(ApplicationState.getInstance().getWizardPictureMaly());
                ApplicationState.getInstance().setWizardPictureMaly(urlPicture);
                break;
            }
        }
        for (String urlPicture : listSmallPicture) {
            if (!urlPicture.equals(ApplicationState.getInstance().getWizardPictureMaly())) {
                ImageView imageWizardOpponentThree3 = new ImageView(new Image(getClass().getResourceAsStream(urlPicture)));
                imageWizardOpponentThree.getChildren().add(imageWizardOpponentThree3);

                listSmallPicture.remove(ApplicationState.getInstance().getWizardPictureMaly());
                ApplicationState.getInstance().setWizardPictureMaly(urlPicture);
                break;
            }
        }
    }
//            ImageView imageWizardOpponentOne2 = null;
//            for (int i = 0; i < listSmallPicture.size(); i++) {
//                if (listSmallPicture.get(i).equals(ApplicationState.getInstance().getWizardPictureMaly())) {
//                    continue;
//                } else {
//                    String url = listSmallPicture.get(i);
//                    imageWizardOpponentOne2 = new ImageView(new Image(url));
//                    }
//            }
//        }


//        imageWizardOpponentDwa.
//        imageWizardOpponentTrzy.

    public void setControllerMain(ControllerMain controllerMain) {
        this.controllerMain = controllerMain;
    }

}
