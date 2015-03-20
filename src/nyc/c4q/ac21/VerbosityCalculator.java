package nyc.c4q.ac21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * John Gomez 3-20-2015
 * Calculate and compare the verbosity of two text
 * files
 */
public class VerbosityCalculator {
    public static void main(String[] args){

        // An abstract representation of a File
        File dickens = new File("/Users/c4q-john/Desktop/accesscode/VerbosityCalculator/resources/pg98.txt");

        File melville = new File("/Users/c4q-john/Desktop/accesscode/VerbosityCalculator/resources/pg2701.txt");


        try{
            Scanner sc = new Scanner(dickens);

            int numWords = 0;
            int numSentences = 0;

            while (sc.hasNext()) {

                String word = sc.next();

                numWords += 1;

                if (word.endsWith(".")){
                    numSentences +=1;
                }

            } System.out.print("Charles Dickens Verbosity Score: "+ numWords/numSentences+"\n");
            Scanner mv = new Scanner(melville);

            int numWord = 0;
            int numSentence = 0;

            while (mv.hasNext()) {

                String word = mv.next();

                numWord += 1;

                if (word.endsWith(".")){
                    numSentence +=1;
                }

            }System.out.print("Hermal Melville's Verbosity Score: "+ numWord/numSentence+"\n");
            System.out.print("Seems like Melville's sunken the competition!");











        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
