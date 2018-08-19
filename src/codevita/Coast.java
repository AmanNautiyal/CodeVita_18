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
public class Coast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
       String str= Br.readLine();
       String tokens[]=str.split("[,]");
       int M=Integer.parseInt(tokens[0]);
       int N=Integer.parseInt(tokens[1]);
       int k=Integer.parseInt(tokens[2]);
       int boats[][]=new int[k][2];
       for(int i=0;i<k;i++)
       {
           str=Br.readLine();
           tokens=str.split("[,]");
           boats[i][0]=Integer.parseInt(tokens[0]);
           boats[i][1]=Integer.parseInt(tokens[1]);
       }
       int count=0;
       for(int i=0;i<N;i++)
       {
           for(int j=0;j<M;j++)
           {
               int c=0,min=99999999,temp;
               for(int x=0;x<k;x++)
               {
                 temp=(int)Math.abs(i-boats[x][0])+(int)Math.abs(j-boats[x][1]);
                 if(temp<min)
                     min=temp;
               }
               for(int x=0;x<k;x++)
               {
                 temp=(int)Math.abs(i-boats[x][0])+(int)Math.abs(j-boats[x][1]);
                 if(temp==min)
                     c++;
                 if(c==2)
                 {
                    count++;
                    break;
                 }
               }
           }
       }
       System.out.print(count);
    }
    
}
