package com.oewami.SRS.Vocabulary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    @ResponseBody
    public void updateCard(@PathVariable("id") Long id, @RequestBody Map<String, String> map) {
//                           @RequestBody(required = false) String concept,
//                           @RequestBody(required = false) String meaning,
//                           @RequestBody(required = false) String mnemonic,
//                           @RequestBody(required = false) String synonym) {
//        cardService.updateCard(id, concept, meaning, mnemonic, synonym);

        String concept = map.get("concept");
        String meaning = map.get("meaning");
        String mnemonic = map.get("mnemonic");
        String synonym = map.get("synonym");

        cardService.updateCard(id, concept, meaning, mnemonic, synonym);
    }

}
