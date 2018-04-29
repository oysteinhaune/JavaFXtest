package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.Random;

public class Controller {

    public void generateRandom(ActionEvent event) {
        Random random = new Random();
        int myRandomNumber = random.nextInt(50) + 1;
        System.out.println(myRandomNumber);
    }

}
