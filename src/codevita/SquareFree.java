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
public class SquareFree {

    /**
     * @param args the command line arguments
     */
    static boolean isSqf(int n) {
        if (n % 2 == 0) {
            n = n / 2;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= 19; i = i + 2) {
            if (n % i == 0) {
                n = n / i;
                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(Br.readLine());
        int sqfr = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && n != 1) {//check if divisible
                //check if square free
                if (isSqf(i)) {
                    sqfr++;
                }
            }
        }
        System.out.println(sqfr);
    }
}
