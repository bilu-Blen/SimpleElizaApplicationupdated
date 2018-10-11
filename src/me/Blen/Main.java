package me.Blen;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Eliza eliza = new Eliza();
    static ArrayList<String> newString = new ArrayList<>();
    static ArrayList<String> historyArray = new ArrayList<>();


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
            historyArray.add(eliza.getUserQuestion());

            if(eliza.getUserQuestion().equalsIgnoreCase("i am feeling great")){
                break;
            }else if( eliza.getUserQuestion().equalsIgnoreCase("q")){
                System.out.println("Lets show you the history of your chat\n");

                for(String eachArray : historyArray){
                    System.out.print(eachArray);
                }

            }else{
                mainMethod();
            }
    }
    }

    public static void mainMethod(){
        int index = new Random().nextInt(100);
        if(index%2==0){
            String test = eliza.showRandomHedges();
            System.out.print(test);
            historyArray.add(test);
        }else{
            String test2 = eliza.showRandomQualifier();
            System.out.print(test2);
            historyArray.add(test2);

            String[] userQuesArr = eliza.getUserQuestion().split(" ");

            for( String eachString : userQuesArr){
                eachString =  eachString.replaceAll("\\bi\\b", " you ").replaceAll("\\bme\\b", "you").replaceAll("\\bmy\\b", "your".replaceAll("\\bam\\b", "are"));
                newString.add(eachString);
            }

            for(int i=0; i<newString.size(); i++)
            {
                if(newString.get(i).equalsIgnoreCase("are") && newString.get(i+1).equalsIgnoreCase("you"))
                {
                    newString.set(i,"am");
                    newString.set(i+1,"I");
                }
                System.out.print(newString.get(i) + " ");
                historyArray.add(newString.get(i) + " ");
            }
        }

    }


}
