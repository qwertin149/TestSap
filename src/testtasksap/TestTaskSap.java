/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtasksap;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author Sergei
 */
public class TestTaskSap {

    
    private static int Compare(String str1, String str2) {
        StringBuffer sb1 = new StringBuffer(str1);
        StringBuffer sb2 = new StringBuffer(str2);
       
        int i = 0;
        int j = 0;
        int result1 = 0;
        int result2 = 0;
        while (i < sb1.length() && j < sb2.length())
        {
            
            while (i < sb1.length() && sb1.charAt(i) != '.')
            {
                result1 *= 10;
                result1 += sb1.charAt(i++) - '0';
            }
            while (j < sb2.length() && sb2.charAt(j) != '.')
            {
                result2 *= 10;
                result2 += sb2.charAt(j++) - '0';
            }

            if (result1 < result2)
                return -1;
            if (result1 > result2)
                return 1;
            
            result1 = 0;
            result2 = 0;
            i++;
            j++;
        }

            

        return 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Compare("8.1.13.11", "8.1.13.10"));
    }
    
}
