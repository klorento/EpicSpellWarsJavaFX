package card;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class CardsDecks {
    List<Card> cardsDeck = new ArrayList<Card>();

    public List<Card> getCardsDeck() {
        CardDelivery cardDelivery = new CardDelivery(new ImageView(new Image("/images/cards/delivery/dda1.jpg")),"Delivery");
        cardsDeck.add(cardDelivery);
        return cardsDeck;
    }
}
