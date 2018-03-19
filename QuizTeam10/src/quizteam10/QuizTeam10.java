package quizteam10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizTeam10 {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        // Just testing 2
<<<<<<< HEAD
       
=======
        selectQuestion();
>>>>>>> 603f35bcc81a872b6481b61474edb0ae4ccb3299
    }
    private String[] tempQuestions;
    
    
    
    public static void selectQuestion() throws FileNotFoundException {
        // Code here
           String token1 = "";
            // create Scanner inFile1
            Scanner inFile1 = new Scanner(new File("MediumQuestions.txt")).useDelimiter("\n");

            // Original answer used LinkedList, but probably preferable to use ArrayList in most cases
            // List<String> temps = new LinkedList<String>();
            List<String> temps = new ArrayList<String>();

            // while loop
            while (inFile1.hasNext()) {
              // find next line
              token1 = inFile1.next();
              temps.add(token1);
            }
            inFile1.close();

            String[] tempsArray = temps.toArray(new String[0]);

            for (String s : tempsArray) {
              System.out.println(s);
            }
    }
    
    public static void storeQuestionInTemp(){
        // Code here
    }
    
    public static void dispalayQuestionAndPossibleAnswers(){
        // Code here
    }
    
    public static void getAnswer(){
        // Code here
    }
    
    public static void validateAnswer() {
        // Code here
    }
    
    public static void provideFeedback(){
        // Code here
    }
    
    public static void provideOptionsToStudent() {
        // Code here 
    }
    
    public static void displayQuestionToAdmin() {
        // Code here
    }
    
    public static void openWindowAdd() {
        // Code here
    }
    
    public static void openWindowEdit() {
        // Code here
    }
    
    public static void displayConfirmationDel() {
        // Code here
    }   
    
    public static void deleteQuestion() {
        // Code here
    }
    
    public static void displayNumberOfQuestionsToAnswer() {
        // Code here
    }
    
    public static void getSettings(){
        // Code here
    }
    
    public static void sendSettings() {
        // Code here
    }
    
    public static void getInputForAdding() {
        // Code here
    }
    
    public static void saveNewQuestion() {
        // Code here
    }
    
    public static void getUpdates() {
        // Code here 
    }
    
    public static void validatesLogingDetails() {
        // Code here
    }
    
    public static void displayErrorMessage() {
        // Code here 
    }
}
