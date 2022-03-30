/*
Chapter 5 Programming excercise 17
Riky Hernandez
9/8/21
Description: User enters an integer from 1 to 15 and displays a pyramid

──────────────▐█████───────
──────▄▄████████████▄──────
────▄██▀▀────▐███▐████▄────
──▄██▀───────███▌▐██─▀██▄──
─▐██────────▐███─▐██───██▌─
─██▌────────███▌─▐██───▐██─
▐██────────▐███──▐██────██▌
██▌────────███▌──▐██────▐██
██▌───────▐███───▐██────▐██
██▌───────███▌──▄─▀█────▐██
██▌──────▐████████▄─────▐██
██▌──────█████████▀─────▐██
▐██─────▐██▌────▀─▄█────██▌
─██▌────███─────▄███───▐██─
─▐██▄──▐██▌───────────▄██▌─
──▀███─███─────────▄▄███▀──
──────▐██▌─▀█████████▀▀────
──────███──────────────────

*/
package chapter5_17;

import java.util.Scanner;


public class Chapter5_17 {

    
    public static void main(String[] args) {
      
         Scanner input = new Scanner (System.in);
                    System.out.print("Enter a number between 1 to 15: ");
                            int num = input.nextInt();
                            
                            
                                                //if the user inputs a number from 1 to 15
                 if (num >= 1 && num <=15){
                                                            //creates the spaces to make the pyramid form
                 for(int row = 1; row <= num; row++){
                     for(int space = (int)(num - row); space > 0; space--){
                         System.out.print("  ");
                 }
                     for(int mid = row; mid > 0; mid-- ){       //forms out left side of the pyramid with numbers increasing
                         System.out.print(mid + " ");
                     }
                     
                    for(int outer = 2; outer <= row; outer++){      //forms out the right side of the pyramid with the numbers increasing
                        System.out.print(outer + " ");
                    }
                     
                     
                     
                 System.out.println(); 
                 }
      
          }
                 else                                                   // if the user doesnt input a number between 1-15
                     System.out.println(num + " isnt between 1 and 15");  
    }
    
}
