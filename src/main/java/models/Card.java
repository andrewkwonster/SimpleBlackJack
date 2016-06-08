package models;

/**
 * Created by samskim on 6/8/16.
 */
public class Card {

    private String shape;
    private int num;

    public Card(){

    }

    public Card(String shape, int num){
        this.shape = shape;
        this.num = num;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
