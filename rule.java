package archLab;

import java.io.*;
import java.net.*;
import java.net.URL;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class rule {
    private boolean winCondition;
    private boolean gameover;

    protected layout layout;

    public rule() {
        this.layout = new layout();
    }

    public boolean dealerWins(){
        boolean lost = layout.total > layout.goal;
        if(lost){
            gameover = true;
        }
        return gameover;
    }

    public boolean playerWins(){
        boolean win = layout.total == layout.goal;
        if(win){
            winCondition = true;
        }
        return winCondition;
    }

    public String rulesOfGame() {
        String rule = "";
        try {
            File file = new File(("src/main/resources/ruleForArch"));
            Scanner scan = new Scanner(file);
            while (scan.hasNext()){
                rule += scan.nextLine();
            }
            return rule;
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
