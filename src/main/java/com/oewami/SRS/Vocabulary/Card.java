package com.oewami.SRS.Vocabulary;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Card {
    private String concept;
    private String meaning;
    private String mnemonic;
    private List<String> synonyms = new ArrayList<>();
    private Date unlocked;
    private int interval;
    private int streak;
    private List<Date> completedReviews = new ArrayList<>();


    public Card(String concept, String meaning) {
        this.concept = concept;
        this.meaning = meaning;
    }

    public Card() {
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public Date getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(Date unlocked) {
        this.unlocked = unlocked;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public List<Date> getCompletedReviews() {
        return completedReviews;
    }

    public void setCompletedReviews(List<Date> completedReviews) {
        this.completedReviews = completedReviews;
    }

    @Override
    public String toString() {
        return "Card{" +
                "concept='" + concept + '\'' +
                ", meaning='" + meaning + '\'' +
                '}';
    }
}
