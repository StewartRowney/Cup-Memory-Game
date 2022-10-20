package domain;

import models.Cup;
import models.Guess;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CupGameService {

    private boolean isOver;
    private List<Cup> cups = new ArrayList<>();
    Random rand = new Random();


    private void setUp(int numberOfCups) {

        int hiddenBall = rand.nextInt(1, numberOfCups + 1);
        isOver = false;


        for (int i = 0; i < numberOfCups; i++) {
            cups.add(new Cup(false));
        }

        cups.get(hiddenBall- 1).setHasBall(true);

    }

    private boolean guess(Guess incomingGuess) {

        if (cups.get(incomingGuess.getGuess()).getHasBall()) {
            isOver = true;
        }

        return isOver;
    }


}
