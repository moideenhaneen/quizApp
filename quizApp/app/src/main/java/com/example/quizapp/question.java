package com.example.quizapp;

public class question {
    public String questions[] = {
            "What is the first question?click on ans4",
            "What is the second question?",
            "What is the third question?"
    };

    public String choices[][] = {
            {"ans1", "ans2", "ans3", "ans4"},
            {"ans1", "ans2", "ans3", "ans4"},
            {"ans1", "ans2", "ans3", "ans4"}
    };

    public String correctAnswer[] = {
            "ans4",
            "ans2",
            "ans3"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }

}
