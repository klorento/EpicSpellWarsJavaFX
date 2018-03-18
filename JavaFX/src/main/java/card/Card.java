package card;

import javafx.scene.image.ImageView;

public class Card {
     private ImageView imageCard;
     private String nameCard;

    public Card(ImageView imageCard, String nameCard) {
        this.imageCard = imageCard;
        this.nameCard = nameCard;
    }

    public ImageView getImageCard() {
        return imageCard;
    }

    public void setImageCard(ImageView imageCard) {
        this.imageCard = imageCard;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }
}
