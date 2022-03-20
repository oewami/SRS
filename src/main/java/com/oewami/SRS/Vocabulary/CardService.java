package com.oewami.SRS.Vocabulary;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) { this.cardRepository = cardRepository; }

    public List<Card> getCards() {
        return cardRepository.findAll();
    }

    public void addCard(Card card) {
        Optional<Card> byConcept = cardRepository.findCardByConcept(card.getConcept());
        cardRepository.save(card);
    }


    public void deleteCard(Long id) {
        boolean isCardExist = cardRepository.existsById(id);
        if(!isCardExist) {
            throw new IllegalStateException("student with id " + id + " does not exist");
        }
        cardRepository.deleteById(id);
    }


    //TODO Status code 200 but does not update in table
    @Transactional
    public void updateCard(Long id, String meaning, String mneumonic, String synonym) {
        Card card = cardRepository.findById(id).orElseThrow(() -> new IllegalStateException("student with id " + id + " does not exist"));

    }
}
