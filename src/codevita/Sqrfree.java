/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevita;
import java.util.Scanner;
/**
 *
 * @author Aman Nautiyal
 */
public class Sqrfree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int num=Sc.nextInt();
        int result=0;
        if(num%2==0)
            result++;
        if(num%3==0)
            result++;
        if(num%5==0)
            result++;
        if(num%7==0)
            result++;
        if(num%11==0)
            result++;
        if(num%13==0)
            result++;
        if(num%17==0)
            result++;
        if(num%19==0)
            result++;
        result=(int)Math.pow(2,result)-1;
        System.out.print(result);
    }
    
}
