package com.oewami.SRS.Vocabulary;

import org.springframework.web.bind.annotation.GetMapping;
import com.oewami.SRS.Vocabulary.Kanji;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/kanji")
public class KanjiController {

private final KanjiService kanjiService;

public KanjiController(KanjiService kanjiService) {
    this.kanjiService = kanjiService;
}

public List<String> getKanji() {
    return kanjiService.getKanji();
}

}
