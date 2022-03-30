package com.oewami.SRS.Vocabulary;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<Card> getCards() {
        return cardRepository.findAll();
    }

    public void addCard(Card card) {
        Optional<Card> byConcept = cardRepository.findCardByConcept(card.getConcept());
        cardRepository.save(card);
    }


    public void deleteCard(Long id) {
        boolean isCardExist = cardRepository.existsById(id);
        if (!isCardExist) {
            throw new IllegalStateException("student with id " + id + " does not exist");
        }
        cardRepository.deleteById(id);
    }


    //TODO Status code 200 but does not update in table
    @Transactional
    public void updateCard(Long id, String concept, String meaning, String mnemonic, String synonym) {
        Card card = cardRepository.findById(id).orElseThrow(() -> new IllegalStateException("student with id " + id + " does not exist"));

        if (concept != null && concept.length() > 0 && !Objects.equals(card.getConcept(), concept)) {
            card.setConcept(concept);
        }

        if (meaning != null && meaning.length() > 0 && !Objects.equals(card.getMeaning(), meaning)) {
            card.setMeaning(meaning);
        }

        if (mnemonic != null && mnemonic.length() > 0 && !Objects.equals(card.getMnemonic(), mnemonic)) {
            card.setMnemonic(mnemonic);
        }

        if (synonym != null && synonym.length() > 0 && !Objects.equals(card.getSynonym(), synonym)) {
            card.setSynonym(synonym);
        }


    }
}
