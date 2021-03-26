/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreck.mathutil;

/**
 *
 * @author hduy0
 */
public class MathUtility {

    //Math simulator
    public static final double PI = 3.1415;

    //n!
    //0 < 20! boundaries..... 0! = 1;
    public static long getFactorial(int n) {
        //if (n < 0 || n > 20)    throw new IllegalArgumentException("Must be in the boundarie 0 < n <= 20");
        if (n == 0 || n == 1)   return 1;
        //long result = 1;
        //for (int i = 2; i <= n; i++)    result *= i;
        
        return n * getFactorial(n - 1);
    }

    
}
