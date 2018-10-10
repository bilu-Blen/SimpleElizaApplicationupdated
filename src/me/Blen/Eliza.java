package me.Blen;

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


}
