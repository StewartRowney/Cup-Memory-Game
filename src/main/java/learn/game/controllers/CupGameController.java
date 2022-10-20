package learn.game.controllers;

import learn.game.domain.CupGameService;
import learn.game.models.Guess;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cupMemoryGame")
public class CupGameController {

    private final CupGameService service;

    public CupGameController(CupGameService service) {
        this.service = service;
    }

    @PostMapping("/start")
    public boolean start(@RequestBody int numberOfCups) {
        boolean gameSetUp = service.setUp(numberOfCups);

        if (gameSetUp) {
            return true;
        }

        return false;
    }

    @PostMapping("/guess")
    public boolean guess(@RequestBody Guess guess) {
        boolean isOver = service.guess(guess);

        return isOver;
    }

}
