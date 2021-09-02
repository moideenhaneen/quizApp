package com.example.quizapp;

public class question {
    public String questions[] = {
            "1.How many days do we have in a week?",
            "2.How many days are there in a normal year?",
            "3.How many colors are there in a rainbow?",
            "4.Which animal is known as the ‘Ship of the Desert?",
            "5.How many letters are there in the English alphabet?",
            "6.How many consonants are there in the English alphabet?",
            "7.How many sides are there in a triangle?",
            "8.Which month of the year has the least number of days?",
            "9.Which are the vowels in the English alphabet series?",
            "10.Which animal is called King of Jungle?",
    };

    public String choices[][] = {
            {"seven", "eight", "one", "three"},
            {"345", "321", "365", "367"},
            {"8", "4", "7", "9"},
            {"lion", "goat", "cow", "camel"},
            {"22", "21", "26", "29"},
            {"11","12","26","21"},
            {"4", "3", "2", "5"},
            {"dec", "feb", "aug", "may"},
            {"s,t,o,p,q", "a,e,i,o,u", "s,w,m,r,h", "s,w,t,g,r,"},
            {"tiger", "fox", "lion", "elephant"},


    };

    public String correctAnswer[] = {
            "seven",
            "365",
            "7",
            "camel",
            "26",
            "21",
            "3",
            "feb",
            "a,e,i,o,u",
            "lion",
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
