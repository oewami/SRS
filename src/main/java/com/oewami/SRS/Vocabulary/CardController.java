package com.oewami.SRS.Vocabulary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/card")
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<Card> getCards() {
        return cardService.getCards();
    }

    @PostMapping
    public void addCard(@RequestBody Card card) {
        cardService.addCard(card);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCard(@PathVariable("id")Long id) {
        cardService.deleteCard(id);
    }

    //TODO Status Code 200 but does not update in table
    @PutMapping(path = "{id}")
    public void updateCard(@PathVariable("id") Long id,
                           @RequestBody(required = false) String meaning,
                           @RequestBody(required = false) String mneumonic,
                           @RequestBody(required = false) String synonym) {
        cardService.updateCard(id, meaning, mneumonic, synonym);
    }
}
