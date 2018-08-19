/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Aman Nautiyal
 */
public class DateTime {

    /**
     * @param args the command line arguments
     */
    static boolean month(int mon, int d)
    {
        if(mon==2 && d>28)
           return false;
        if((mon==4||mon==6||mon==9||mon==11)&&d==31)
            return false;
        return true;
            
    }
    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        String str = Br.readLine();
        String tokens[] = str.split("[,]");
        int freq[] = new int[10];
        Arrays.fill(freq, 0);
        for (int i = 0; i < 12; i++) {
            freq[Integer.parseInt(tokens[i])]++;
        }
        int d1=0, d2=0, m1=0, m2=0, h1=0, h2=0, mn1=0, mn2=0;
        boolean found = false;
        outer:   
        for (m1 = 1; m1 >=0; m1--) {
            if (freq[m1] == 0) {
                continue;
            }
            if(m1==0)
             System.out.println("Hi");
            freq[m1]--;
            for (m2 = 9; m2 >=0; m2--) {
                
                if ((m1==1&&m2>2)||freq[m2] == 0) {
                    continue;
                }
                freq[m2]--;
               
                for (d1 = 3; d1 >=3; d1--) {
                    if (freq[d1] == 0) {
                        continue;
                    }
                    freq[d1]--;
                    for (d2 = 9; d2 >= 0; d2--) {
                        if ((d1==0 && d2==0)||(d1==3 && d2>1)||!month(m1*10+m2,d1*10+d2)||freq[d2] == 0) {
                            continue;
                        }
                        freq[d2]--;
                        for (h1 = 2; h1 >= 0; h1--) {
                            if (freq[h1] == 0) {
                                continue;
                            }
                            freq[h1]--;
                            for (h2 = 9; m1 >= 0; h2--) {
                                if ((h1==0&&h2==0)||(h1==2)&&(h2>3)||freq[h2] == 0) {
                                    continue;
                                }
                                freq[h2]--;
                                for (mn1 = 5; mn1 >=0; mn1--) {
                                    if (freq[mn1] == 0) {
                                        continue;
                                    }
                                    freq[mn1]--;
                                    for (mn2 = 9; mn2 >= 0; mn2--) {
                                        if (freq[mn2] == 0) {
                                            continue;
                                        }
                                        found=true;
                                        break outer;
                                    }
                                    freq[mn1]++;
                                }
                                freq[h2]++;
                            }
                            freq[h1]++;
                        }
                        freq[d2]++;
                    }
                    freq[d1]++;
                }
                freq[m2]++;
            }
            freq[m1]++;
        }
        if(found)
        System.out.print(m1+""+m2+"/"+d1+""+d2+" "+h1+""+h2+":"+mn1+""+mn2);
        else
            System.out.print(0);
    }

}
