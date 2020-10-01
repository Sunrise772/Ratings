/* This program is for outputting ratings.
 * Author: Cody Stone
 * Date: 1/26/2020
 */
package hmwk01_02;
import java.util.Scanner;

/**
This main class Ratings will output the ratings.
 */
public class Ratings {
    public static void main(String[] Args){
        //here we declare the variables we will use
        Scanner input = new Scanner(System.in);
        int rating1;
        int rating2;
        int rating3;
        int rating4;
        double average;
        
        //here we will prompt the user for input and store the results
        System.out.print("4 ratings?");
        rating1 = input.nextInt();
        rating2 = input.nextInt();
        rating3 = input.nextInt();
        rating4 = input.nextInt();
        System.out.println();
        
        //here we will calculate the average
        average = (rating1 + rating2 + rating3 + rating4 + 2) / 4;
       
        //here our if statements will decide the output based on the calculated average
        if(average == 1){
            System.out.println("/(>_<)\\");
        }
        if(average == 2){
            System.out.println("(>_<)");
        }
        if (average == 3){
            System.out.println("(^_^)");
        }
        if (average == 4){
            System.out.println("(~o~)");
        }
        if (average == 5){
            System.out.println("\\(~o~)/");
        } 
    }
}
