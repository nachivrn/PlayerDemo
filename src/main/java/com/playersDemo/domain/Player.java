package com.playersDemo.domain;

import com.opencsv.bean.CsvBindByName;

import javax.persistence.Entity;
import javax.persistence.FieldResult;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @CsvBindByName
    private String playerID;
    @CsvBindByName
    private String birthYear;
    @CsvBindByName
    private String birthMonth;
    @CsvBindByName
    private String birthDay;
    @CsvBindByName
    private String birthCountry;
    @CsvBindByName
    private String birthState;
    @CsvBindByName
    private String birthCity;
    @CsvBindByName
    private String  deathYear;
    @CsvBindByName
    private String deathMonth;
    @CsvBindByName
    private String deathDay;
    @CsvBindByName
    private String deathCountry;
    @CsvBindByName
    private String deathState;
    @CsvBindByName
    private String deathCity;
    @CsvBindByName
    private String nameFirst;
    @CsvBindByName
    private String nameLast;
    @CsvBindByName
    private String nameGiven;
    @CsvBindByName
    private String weight;
    @CsvBindByName
    private String height;
    @CsvBindByName
    private String bats;

    @CsvBindByName(column = "throws")
    String throwsBall;
    @CsvBindByName
    private String debut;
    @CsvBindByName
    private String finalGame;
    @CsvBindByName
    private String retroID;
    @CsvBindByName
    private String bbrefID;

    public Player() {
    }

    public Player(String playerID, String birthYear, String birthMonth, String birthDay, String birthCountry, String birthState, String birthCity, String deathYear, String deathMonth, String deathDay, String deathCountry, String deathState, String deathCity, String nameFirst, String nameLast, String nameGiven, String weight, String height, String bats, String throwsBall, String debut, String finalGame, String retroID, String bbrefID) {
        this.playerID = playerID;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthCountry = birthCountry;
        this.birthState = birthState;
        this.birthCity = birthCity;
        this.deathYear = deathYear;
        this.deathMonth = deathMonth;
        this.deathDay = deathDay;
        this.deathCountry = deathCountry;
        this.deathState = deathState;
        this.deathCity = deathCity;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.nameGiven = nameGiven;
        this.weight = weight;
        this.height = height;
        this.bats = bats;
        this.throwsBall = throwsBall;
        this.debut = debut;
        this.finalGame = finalGame;
        this.retroID = retroID;
        this.bbrefID = bbrefID;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(String deathYear) {
        this.deathYear = deathYear;
    }

    public String getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(String deathMonth) {
        this.deathMonth = deathMonth;
    }

    public String getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(String deathDay) {
        this.deathDay = deathDay;
    }

    public String getDeathCountry() {
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry) {
        this.deathCountry = deathCountry;
    }

    public String getDeathState() {
        return deathState;
    }

    public void setDeathState(String deathState) {
        this.deathState = deathState;
    }

    public String getDeathCity() {
        return deathCity;
    }

    public void setDeathCity(String deathCity) {
        this.deathCity = deathCity;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getNameGiven() {
        return nameGiven;
    }

    public void setNameGiven(String nameGiven) {
        this.nameGiven = nameGiven;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFinalGame() {
        return finalGame;
    }

    public void setFinalGame(String finalGame) {
        this.finalGame = finalGame;
    }

    public String getRetroID() {
        return retroID;
    }

    public void setRetroID(String retroID) {
        this.retroID = retroID;
    }

    public String getBbrefID() {
        return bbrefID;
    }

    public void setBbrefID(String bbrefID) {
        this.bbrefID = bbrefID;
    }

    public String getThrowsBall() {
        return throwsBall;
    }

    public void setThrowsBall(String throwsBall) {
        this.throwsBall = throwsBall;
    }
}
