package archLab;

import javafx.scene.control.Button;

public class button extends Button {
    private int value;
    private String suit;
    private String cardType;
    private boolean changeAceValue;


    public button (int value, String cardType, String suit){
        this.value = value;
        this.suit = suit;
        this.cardType = cardType;

        setText(cardType + " of " + suit);
        setPrefSize(100,200);
        isDisable();
    }

    public button(boolean stayorhitOption)
    {

    }


    public void IfAce(){
        if(changeAceValue && value == 1){
            this.value = 11;
        }
    }

}
