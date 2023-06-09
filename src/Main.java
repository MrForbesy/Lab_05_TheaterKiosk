// class WristBand
//	main ()
//		num age = 0
//		num DRINKING_AGE = 21
//		output “How old are you?”
//		input age
//		if age >= DRINKING_AGE then
//			output “You get a wristband.”
//		endIf
//	return
//end class

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Define variable//
        Scanner in = new Scanner(System.in);
        int age = 0;

        //Ask user for their age and stores it//
        System.out.printf("How old are you?");
        age = in.nextInt();

        //Checks to see if the user is over 21 and lets them know to get a wristband if true//
        if(age >= 21)
        {
            System.out.printf("Please go get a wristband.");
        }

    }
}