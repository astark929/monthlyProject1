package archLab;

public class card extends deck {

    private String suit;
    private int value;
    private String name;

    public card (int suits, int Value)
    {
        this.suit = Suit[suits];
        this.value = deck[suits][Value];
        this.name = cardName[Value];
    }

    public String getSuit(){
        return suit;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
        this.name = cardName[value];
    }

    public String getName(int value){
        return cardName[value];
    }


}
