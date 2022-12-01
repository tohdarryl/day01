package myapp.ver1;

import java.io.Console;

public class Hello {
    public static void main(String[] args) {
        //Get console
        Console cons = System.console();

        //Read from the console, the result is assigned to a variable 
        // or String name = "";
        //    while (name.trim().length() <= 0) {
        //    name = cons.readLine("What is your name? ")
        //} Replace 2nd else if line
        
        String name = cons.readLine("What is your name? ");
        
        //Use .equals() for string comparison, == is for numbers
        if(name.trim().toLowerCase().equals("fred")) {
            System.out.println("Yabadabadoo");

        } else if(name.trim().toLowerCase().equals("barney")){
            System.out.println("Purple dinosaur");

        //If input is blank, or use (name.trim().length == 0), or (name.trim()isEmpty())
        } else if(name.trim().equals("")){
            System.err.println("Please enter your name");

        } else {
        //Send a greeting to the name witha formatted string
        System.out.printf("Hello %s.\nNice to meet you\n", name);
        }
    }
}

