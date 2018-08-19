/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevita;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aman Nautiyal
 */
public class SquareFree2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(Br.readLine());
        int sqfr = 0;
        int prime[]={2,3,5,7,11,13,17,19};
        for(int i=0;i<8;i++)
        {
            if(n%prime[i]==0)
            {
                sqfr++;
            }
        }
      sqfr=(int)Math.pow(2,sqfr)-1;
        System.out.print(sqfr);
    }  
}
