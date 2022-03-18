package com.oewami.SRS.Vocabulary;

import org.springframework.stereotype.Service;

@Service
public class CardService {

    public String getCards() {
        return(new Card("早", "そう").toString());
    }
}
