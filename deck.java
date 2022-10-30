package archLab;
import java.util.ArrayList;

public class deck {

    //public enum Suit {diamonds, clovers, hearts, spades }
    String [] Suit = {"diamonds", "clovers", "hearts", "spades"};
    int deck [] [] = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, // diamonds
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, // clovers
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, // hearts
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}  // spades
    };

    int [] [] amountOFDecks = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };
    private int wantedDecks;
    String cardName [] = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jacks", "queen", "king"};

    public boolean validCard(int row, int col){

        if (amountOFDecks[row][col] < wantedDecks){
            if(amountOFDecks[row][col]+1 == wantedDecks){
                return true;
            }
            else {
                amountOFDecks[row][col]++;
                return true;
            }
        }
        else {
            return false;
        }
    }

    public void setWantedDecks(int numberOfDecks){
        wantedDecks = numberOfDecks;
    }


}

