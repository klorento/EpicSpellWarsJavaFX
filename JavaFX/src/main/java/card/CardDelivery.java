package card;



import javafx.scene.image.ImageView;

public class CardDelivery extends SpellCards {

    int initiative;



    public int getInitiative() {

        return initiative;

    }



    public void setInitiative(int initiative) {

        this.initiative = initiative;

    }



    public CardDelivery(ImageView imageCard, String nameCard, String glitch, String type, int initiative) {

        super(imageCard, nameCard, glitch, type);

        this.initiative = initiative;

    }

}