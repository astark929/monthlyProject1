package archLab;

public class layout {
    int numberOfCards = 2;
    int goal = 21;
    int total = 0;

    private boolean hitOrStay;
    private int [] cardsInHand;
    private int inhand;


    public layout(){
        cardsInHand = new int[2];
        inhand = total;
    }

    public int getGoal(){
        return goal;
    }

    public int getTotal(int currenttotal){
        total += currenttotal;
        return total;
    }




}
