package com.oewami.SRS.Vocabulary;

import org.springframework.stereotype.Service;

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
        Optional<Card> byMeaning = cardRepository.findCardByMeaning(card.getMeaning());
        cardRepository.save(card);
    }
}
