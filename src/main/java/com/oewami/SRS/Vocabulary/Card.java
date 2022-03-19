package com.oewami.SRS.Vocabulary;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Card {
    @Id
    @SequenceGenerator(
            name = "card_sequence",
            sequenceName = "card_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "card_sequence"
    )
    private Long id;
    private String concept;
    private String meaning;
    private String mnemonic;
    private String synonym;
//    private String group;
//    private Date unlocked;
//    private Integer interval;
//    private Integer streak;
//    private Date lastCompletedReview;


    public Card(String concept, String meaning) {
        this.concept = concept;
        this.meaning = meaning;
    }

    public Card() {
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

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

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

//    public String getGroup() {
//        return group;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }

//    public Date getUnlocked() {
//        return unlocked;
//    }
//
//    public void setUnlocked(Date unlocked) {
//        this.unlocked = unlocked;
//    }
//
//    public Integer getInterval() {
//        return interval;
//    }
//
//    public void setInterval(Integer interval) {
//        this.interval = interval;
//    }
//
//    public Integer getStreak() {
//        return streak;
//    }
//
//    public void setStreak(Integer streak) {
//        this.streak = streak;
//    }

//    public Date getLastCompletedReview() {
//        return lastCompletedReview;
//    }
//
//    public void setLastCompletedReview(Date completedReview) {
//        this.lastCompletedReview = completedReview;
//    }

    @Override
    public String toString() {
        return "Card{" +
                "concept='" + concept + '\'' +
                ", meaning='" + meaning + '\'' +
                '}';
    }
}
