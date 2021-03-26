/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreck.mathutil.main;

import static com.dreck.mathutil.MathUtility.getFactorial;

/**
 *
 * @author hduy0
 */
public class main {
    public static void main(String[] args) {
        long expected = 120;
        int input = 5; // đầu vào bằng 5

       long acctual = getFactorial(input);
        System.out.println(input + "! Expected : " + expected + "; Actual : " + acctual);
        //case 2 : 0!
        expected = 1;
        input = 0;
        acctual = getFactorial(input);
        System.out.println(input + "! Expected : " + expected + "; Actual : " + acctual);
        //case 3 : -1!
        
        
        // test bằng tay và kết luận, nhiều case thì dùng api
        // Test automation dung thư viện 
    }
    
}
