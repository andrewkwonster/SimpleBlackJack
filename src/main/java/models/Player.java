package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samskim on 6/8/16.
 */
public class Player {

    private String id;
    private List<Card> cards;

    public Player(String id){
        // this line will be executed upon construction of this player
        this.id = id;
        cards = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
