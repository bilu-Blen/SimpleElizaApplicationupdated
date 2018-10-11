package me.Blen;

import java.util.ArrayList;
import java.util.Random;

public class Eliza {
    private String inputedQuestion;

    public String getUserQuestion() {
        return inputedQuestion;
    }

    public void setUserQuestion(String userQuestion) {
        this.inputedQuestion = userQuestion;
    }

    public String greeting(){
        return "Good day! What is your problem?";
    }

    public String askUser(){
        return " Enter you question here or Q to quit: ";
    }
    public String showRandomQualifier(){
        ArrayList<String> randomQualifierArr = new ArrayList<>();

        randomQualifierArr.add("Why do you say that ");
        randomQualifierArr.add("You seem to think that ");
        randomQualifierArr.add("So, you are concerned that ");

        int index = new Random().nextInt(randomQualifierArr.size());
        String randomQualifier = randomQualifierArr.get(index);
        return randomQualifier;
    }

    public String showRandomHedges(){
        ArrayList<String> randomHedgesArr = new ArrayList<>();

        randomHedgesArr.add("Please tell me more ");
        randomHedgesArr.add("Many of my patients tell me the same thing ");
        randomHedgesArr.add("It is getting late, maybe we had better quit ");

        int index = new Random().nextInt(randomHedgesArr.size());
        String randomHedges = randomHedgesArr.get(index);
        return randomHedges;
    }


}
