package players;


import card.Card;
import card.CardTreasure;

import java.util.List;

public class Player {
     private static Player instance;
     static{
         instance = new Player();
     }
     public static Player getInstance(){
         return instance;
     }

    private int hp;
    private int id;
    private int initiative;
    private int numberOfTreasures;
    private List<Card> listHandCard;
    private List<CardTreasure> listCardTreasuer;
    private List<Card> castTheSpell;

    public Player(int hp, int id, int initiative, int numberOfTreasures, List<Card> listHandCard, List<CardTreasure> listCardTreasuer, List<Card> castTheSpell) {
        this.hp = hp;
        this.id = id;
        this.initiative = initiative;
        this.numberOfTreasures = numberOfTreasures;
        this.listHandCard = listHandCard;
        this.listCardTreasuer = listCardTreasuer;
        this.castTheSpell = castTheSpell;
    }
    public Player(){

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getNumberOfTreasures() {
        return numberOfTreasures;
    }

    public void setNumberOfTreasures(int numberOfTreasures) {
        this.numberOfTreasures = numberOfTreasures;
    }

    public List<Card> getListHandCard() {
        return listHandCard;
    }

    public void setListHandCard(List<Card> listHandCard) {
        this.listHandCard = listHandCard;
    }

    public List<CardTreasure> getListCardTreasuer() {
        return listCardTreasuer;
    }

    public void setListCardTreasuer(List<CardTreasure> listCardTreasuer) {
        this.listCardTreasuer = listCardTreasuer;
    }

    public List<Card> getCastTheSpell() {
        return castTheSpell;
    }

    public void setCastTheSpell(List<Card> castTheSpell) {
        this.castTheSpell = castTheSpell;
    }
}
