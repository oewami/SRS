package com.oewami.SRS.Vocabulary;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class KanjiService {

    @GetMapping
    public List<String> getKanji() {
        return List.of(new Kanji("早").toString());
    }
}
