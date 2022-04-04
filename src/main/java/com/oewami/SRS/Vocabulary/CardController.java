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

    @GetMapping("/id/{id}")
    public List<Card> getCardById(@PathVariable("id") Long id) {
        return cardService.getCardById(id);
    }

    @PostMapping
    public void addCard(@RequestBody Card card) {
        cardService.addCard(card);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCard(@PathVariable("id")Long id) {
        cardService.deleteCard(id);
    }

    @PutMapping(path = "{id}")
    @ResponseBody
    public void updateCard(@PathVariable("id") Long id, @RequestBody Map<String, String> map) {
        String concept = map.get("concept");
        String meaning = map.get("meaning");
        String mnemonic = map.get("mnemonic");
        String synonym = map.get("synonym");

        cardService.updateCard(id, concept, meaning, mnemonic, synonym);
    }

//    @GetMapping("getconcept/{concept}")
//    public List<Card> getCardByConcept(@PathVariable("concept") String concept) {
//        return cardService.getCardByConcept(concept);
//    }
}
