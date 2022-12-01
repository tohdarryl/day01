package myapp.ver1;

import java.io.Console;


public class Calculate {
    public static void main(String[] args) {
       
        String input = "";
        Integer total = 0;
        Integer count = 0;

        //Get the console
        Console cons = System.console(); //Get the console
        //if input not equals to "stop"
        while (!input.equals("stop")) {
            //Read a line
            input = cons.readLine("Please enter a number: "); //input = what is typed into console after "text"
            input = input.trim();

            if (input.equals("stop")){
                //Exit the while loop
                break;
            }
            //count +=1;
            count++;

            //Integer value = Integer.parseInt(input);
            //total = total + value
            total += Integer.parseInt(input);
        }
        
        System.out.printf("The total of adding %d number is %d\n", count, total);
        
        

       

    }
}



    

