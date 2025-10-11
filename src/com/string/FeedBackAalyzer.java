package com.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FeedBackAalyzer {

    public static void main (String[] args) {
        Scanner scanner= new Scanner (System.in);
        List<String> feedbackList= new ArrayList<> ();
        String[] positiveWords={"Good","excellent","great","happy","amazing"};
        String[] negativeWords={"bad","poor","angry","worst","sad","not good"};
        int positiveCount=0;
        int negativeCount=0;
        System.out.println ("======customer feedback analyzer=======");
        System.out.println ("=====enter feedback (exit or finish)=========");
        while (true){
            String feedback=scanner.nextLine ().trim ();
            if(feedback.equalsIgnoreCase ("exit")){
                break;
            }
            feedbackList.add (feedback);
            String lowercaseFeedback= feedback.toLowerCase ();
            /*for (String word:positiveWords){
                if(lowercaseFeedback.contains (word));
                positiveCount++;
                break;
            }
            for (String word1:negativeWords){
                if(lowercaseFeedback.contains (word1));
                negativeCount++;
                break;
            }*/
            if(containsAny (lowercaseFeedback,positiveWords)){
                positiveCount++;

            } else if (containsAny (lowercaseFeedback,negativeWords)) {
                negativeCount++;

            }


        }

        System.out.println ("=======summery report========");
        System.out.println ("Total Feedback entries:"+feedbackList.size ());
        System.out.println ("Positive Feedback:"+positiveCount);
        System.out.println ("Negative Feedback:"+negativeCount);
        System.out.println ("all feedback");
        for(int i=0;i<feedbackList.size ();i++){
            System.out.println ((i)+":"+ feedbackList.get (i));
        }

    }
    // helper method for keyword analyzer
    private static  boolean containsAny(String text,String[] keywords){
        for(String word:keywords){
            if(text.contains (word.toLowerCase ())){
                return true;
            }
        }
        return false;
    }

}
