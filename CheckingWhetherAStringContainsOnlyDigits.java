/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checking.whether.a.string.contains.only.digits;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class CheckingWhetherAStringContainsOnlyDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //get input from the user
        //Scanner in = new Scanner(System.in);
        //System.out.print("Input String: ");
        //String input = in.nextLine();
        //System.out.println("Result: " +ContainsOnlyDigit(input));
        
        //given input
        String input = "1234";
        System.out.println(ContainsOnlyDigit(input));
    }
    public static boolean ContainsOnlyDigit(String x){
        boolean x1 = true;
        char [] charToArray = x.toCharArray();
        char [] digits = new char[]{'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'};
        
        for(char ch: charToArray){
            int a = Arrays.binarySearch(digits, ch);
            if(a < 0){
                return false;
            }
        }
        
        return x1;
    }
    
}
