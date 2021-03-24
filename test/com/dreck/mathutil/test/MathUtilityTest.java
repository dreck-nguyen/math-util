/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreck.mathutil.test;

import com.dreck.mathutil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
//sử dụng static cho import sẽ khiến cho hàm và biến của class đó được sử dụng 
// thông qua việc gọi hàm hoặc biến được sử dụng nhanh chóng 
//import static dreck.MathUtility.*;
//test tất cả các test case để đảm bảo hàm chạy đúng như mong muốn
// nếu đưa vào dữ liệu sai, (âm) thì lập tức đưa ra cảnh báo để đảm bảo quy chuẩn

//Exception(ngoại lệ) khi xảy ra nếu dữ liệu đầu vào sai----> hàm chạy đúng

/**
 *
 * @author hduy0
 */
public class MathUtilityTest {
    @Test //biến hàm này thành main dùng shift f6 để chạy
    //gọi hàm Factorial() như thường lệ, hay hơn dùng maniual
    //so sánh nữa!!!!
    
    public void testFactorialRightArgumentRunsWell(){
        long expected = 120;
        int n = 5;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected,actual);
    
    
    //mình test tiếp các trường hợp đúng đầu vào đúng đầu ra
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        
    }
    
    
    @Test(expected = IllegalArgumentException.class)
    //nếu đúng ném về ngoại lệ cùng tên thì ném ra màu xanh 
    public void testFactorialWrongArgumentsThrowException(){
        //test case: tham sô sai thì Exception
        //ngoại lệ không phải value để so sánh 
        //không dùng assertEquals()
        //JUnit4 khác JUnit5 ở chỗ bắt ngoại lệ,
        //Kì 5 SWT301 của tui : DI, Lambda Expression liên quan
        //JUnit 5               Dependency Injection
        MathUtility.getFactorial(-5);
    }
}
