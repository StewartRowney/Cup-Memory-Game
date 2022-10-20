package learn.game.domain;

import learn.game.models.Cup;
import learn.game.models.Guess;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Service
public class CupGameService {

    private boolean isOver;
    private List<Cup> cups = new ArrayList<>();
    Random rand = new Random();


    public boolean setUp(int numberOfCups) {

        int hiddenBall = rand.nextInt(1, numberOfCups + 1);
        isOver = false;


        for (int i = 0; i < numberOfCups; i++) {
            cups.add(new Cup(false));
        }

        cups.get(hiddenBall- 1).setHasBall(true);


        return cups.size() == numberOfCups;
    }

    public boolean guess(Guess incomingGuess) {

        if (cups.get(incomingGuess.getGuess() - 1).getHasBall()) {
            cups.clear();
            isOver = true;

        }

        return isOver;
    }


}
