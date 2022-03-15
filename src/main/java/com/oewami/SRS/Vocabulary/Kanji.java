package com.oewami.SRS.Vocabulary;

import java.util.Date;
import java.util.List;

public class Kanji {
    private String kanji;
    private List<String> meanings;
    private String mnemonic;
    private Date unlocked;
    private int level;
    private int streak;
    private boolean isReady;

    public Kanji() {
    }

    public Kanji(String kanji) { this.kanji = kanji; }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }

    public List<String> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<String> meanings) {
        this.meanings = meanings;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public Date getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(Date unlocked) {
        this.unlocked = unlocked;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }


    @Override
    public String toString() {
        return "Kanji{" +
                "kanji='" + kanji + '\'' +
                '}';
    }
}
