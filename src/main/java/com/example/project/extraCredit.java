package com.example.project;
import java.util.Scanner;

public class extraCredit {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        // I learned how to round from here: https://www.educative.io/answers/how-to-use-the-java-mathround-method

        // Calculating important values:
        double tip = cost * (percent/100.0);
        tip = Math.round(tip * 100) / 100.0;

        double costAndTip = tip + cost;
        double costPerPersonAfterTip = Math.round((costAndTip / people) * 100) / 100.0;

        double costPerPersonBeforeTip = Math.round((cost / people) * 100) / 100.0;

        double tipPerPerson = tip / people;
        tipPerPerson = Math.round(tipPerPerson * 100) / 100.0;
                      
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: $" + tip + "\n");
        result.append("Total Bill with tip: $" + costAndTip + "\n");
        result.append("Per person cost before tip: $" + costPerPersonBeforeTip + "\n");
        result.append("Tip per person: $" + tipPerPerson + "\n");
        result.append("Total cost per person: $" + costPerPersonAfterTip + "\n");
        result.append("-------------------------------\n");
        
        // This is where I add extra credit
        String items = "";

        boolean endCode = false;
        Scanner scan = new Scanner(System.in);

        while (endCode == false){
            System.out.println("Enter an item name or type -1 to finish");
            String userInput = scan.nextLine();

            if (userInput.equals("-1")){
                endCode = true;
            }else{
                items += userInput + "\n"; 
            }
        }

        result.append("Items ordered:\n");
        result.append(items);
        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people, percent, cost));
    }
}
