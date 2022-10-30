package archLab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class main extends Application
{
    private Canvas canvas;
    private button button;
    private deck deck = new deck();
    private rule rule;
    private card card;
    private label label;
    private int numberOfDecks = 1;

    private label goal;
    private label total;
    private label message;

    public static void main (String [] args) {
        launch(args);
    }

    public int pullCard(String r){

        if (r.equals("row")){
            int row = (int) ((Math.random() * 3));
            return row;
        }
        else {
            int col = (int) ((Math.random() * 12));
            return col;
        }
    }

    public void setNumberOfDecks(){
        deck.setWantedDecks(numberOfDecks);
    }
    public void valueInHand(int a){
        total.setText("your total is: " + rule.layout.getTotal(a));
        goal.setText("your goal is " + rule.layout.getGoal());
        if(rule.dealerWins()) {
            message.setText("Dealer Wins!");
        }
        else if(rule.playerWins()) {
            message.setText("You win!");
        }
        else {
            message.setText("do you wanna risk pulling?");
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            rule = new rule();
            label = new label();
            total = new label();
            goal = new label();
            message = new label();

            HBox sum = new HBox(total, goal, message);

            VBox showingcards = new VBox(sum);

            HBox stuff = new HBox(label);
            showingcards.setSpacing(10);

                for (int cardsinhand = 0; cardsinhand < 2; cardsinhand++) {
                    int row = pullCard("row");
                    int col = pullCard("col");
                    while (deck.validCard(row, col)) {
                        row = pullCard("row");
                        col = pullCard("col");
                    }
                    card = new card(row, col);
                    button = new button(card.getValue(), card.getName(card.getValue()), card.getSuit());
                    valueInHand(card.getValue());
                    stuff.getChildren().add(button);
                }
                showingcards.getChildren().add(stuff);

            Scene scene = new Scene(showingcards);
            stage.setScene(scene);
            stage.setTitle("Black Jack");
            stage.show();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
