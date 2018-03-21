package card;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class CardDecks {
    List<Card> cardsList = new ArrayList<Card>();
    List<Card> discardCardList = new ArrayList<Card>();
    List<Card> treasureDeck = new ArrayList<Card>();
    List<Card> deathWizardDeck = new ArrayList<Card>();

    public List<Card> getCardDeck() {
        CardDelivery coneOfAcid = new CardDelivery(new ImageView(new Image("/images/cards/delivery/dda1.jpg")), "Cone of Acid", "ARCANE",
                "DELIVERY", 4);
        cardsList.add(coneOfAcid);
        CardDelivery dragonHoard = new CardDelivery(new ImageView(new Image("/images/cards/delivery/dda2.jpg")), "Dragon Hoard", "ARCANE",
                "DELIVERY", 6);
        cardsList.add(dragonHoard);
        CardDelivery powerVortex = new CardDelivery(new ImageView(new Image("/images/cards/delivery/dda3.jpg")), "Power Vortex", "ARCANE",
                "DELIVERY", 16);
        cardsList.add(powerVortex);
        CardDelivery testikill = new CardDelivery(new ImageView(new Image("/images/cards/delivery/dda4.jpg")), "Testikill", "ARCANE",
                "DELIVERY", 7);
        cardsList.add(testikill);

        CardDelivery deathWish = new CardDelivery(new ImageView(new Image("/images/cards/delivery/ddd5.jpg")), "Death Wish", "DARK",
                "DELIVERY", 8);
        cardsList.add(deathWish);
        CardDelivery exorcism = new CardDelivery(new ImageView(new Image("/images/cards/delivery/ddd6.jpg")), "Exorcism ", "DARK",
                "DELIVERY", 11);
        cardsList.add(exorcism);
        CardDelivery mercyKilling = new CardDelivery(new ImageView(new Image("/images/cards/delivery/ddd7.jpg")), "Testiklill", "DARK",
                "DELIVERY", 5);
        cardsList.add(mercyKilling);
        CardDelivery pactWithTheDevil = new CardDelivery(new ImageView(new Image("/images/cards/delivery/ddd8.jpg")), "Pact With The Devil", "DARK",
                "DELIVERY", 18);
        cardsList.add(pactWithTheDevil);


        CardSource beardOBlastys = new CardSource(new ImageView(new Image("/images/cards/source/dsa1.jpg")), "Beard'o Blasty's", "ARCANE",
                "SOURCE");
        cardsList.add(beardOBlastys);
        CardSource bleemaxBrainiacs = new CardSource(new ImageView(new Image("/images/cards/source/dsa2.jpg")), " Bleemax Brainiac's", "ARCANE",
                "SOURCE");
        cardsList.add(bleemaxBrainiacs);
        CardSource professorPrestos = new CardSource(new ImageView(new Image("/images/cards/source/dsa3.jpg")), "Professor Presto's", "ARCANE",
                "SOURCE");
        cardsList.add(professorPrestos);
        CardSource sirLootzors = new CardSource(new ImageView(new Image("/images/cards/source/dsa4.jpg")), "Sir Lootzor's", "ARCANE",
                "SOURCE");
        cardsList.add(sirLootzors);

        CardSource benVoodoos = new CardSource(new ImageView(new Image("/images/cards/source/dsd5.jpg")), "Ben Voodoo's", "DARK",
                "SOURCE");
        cardsList.add(benVoodoos);
        CardSource midnightMerlins = new CardSource(new ImageView(new Image("/images/cards/source/dsd6.jpg")), "Midnight Merlin's", "DARK",
                "SOURCE");
        cardsList.add(midnightMerlins);
        CardSource oldScratchs = new CardSource(new ImageView(new Image("/images/cards/source/dsd7.jpg")), "Old Scratch's", "DARK",
                "SOURCE");
        cardsList.add(oldScratchs);
        CardSource theDeathFairys = new CardSource(new ImageView(new Image("/images/cards/source/dsd8.jpg")), "The Death Fairy's", "DARK",
                "SOURCE");
        cardsList.add(theDeathFairys);



return cardsList;


    }

}
