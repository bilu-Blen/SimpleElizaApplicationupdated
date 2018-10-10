package me.Blen;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.join;

public class Main {
    static Eliza eliza = new Eliza();

    public static void main(String[] args) {
	// write your code here

        System.out.println(eliza.greeting());

        eliza.setUserQuestion("something");

        //first loop
       while(!eliza.getUserQuestion().equalsIgnoreCase("q") ){

            //calling ask user method
            System.out.println(eliza.askUser());

            //user input
            Scanner scan = new Scanner(System.in);
            eliza.setUserQuestion(scan.nextLine());

            if(eliza.getUserQuestion().equalsIgnoreCase("i am feeling great")){
                break;
            }else if( eliza.getUserQuestion().equalsIgnoreCase("q")){

            }else{
                System.out.println(eliza.getUserQuestion());
            }

           String[] userQuesArr = eliza.getUserQuestion().split(" ");

           showRandomQualifier();
           for(String eachString : userQuesArr){


               String replacedQues;
                String nonReplaced;
                eachString =  eachString.replaceAll("\\bi\\b", " you ").replaceAll("\\bme\\b", "you")
                                            .replaceAll("\\bmy\\b", "your".replaceAll("\\bam\\b", "are"));

               eliza.setUserQuestion( eachString );


               eachString = eachString + " ";
               String newString = join(" ", eachString);
           }


//           Pattern pat = Pattern.compile("are you");
//           Matcher mat = pat.matcher(eliza.getUserQuestion());
//
//           if(mat.find()){
//               System.out.println("found it");
//           }else{
//               System.out.println("not found");
//           }


    }

    }

    public static void showRandomQualifier(){
        ArrayList<String> randomQualifierArr = new ArrayList<>();

        randomQualifierArr.add("Why do you say that ");
        randomQualifierArr.add("You seem to think that ");
        randomQualifierArr.add("So, you are concerned that ");

        int index = new Random().nextInt(randomQualifierArr.size());
        String randomQualifier = randomQualifierArr.get(index);
        System.out.print(randomQualifier);
    }

}
