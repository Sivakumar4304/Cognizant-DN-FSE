package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {
Calculator  calculator;

@Before
   public void setUp(){
    System.out.println("Before Test ");
    calculator =new Calculator();
}
@Test
    public  void testadd(){

    //Arrange
    int a=10;
    int b=20;

    //Act
    int result = calculator.add(a,b);

    //Assert
    assertEquals(30,result);

}

    @After
    public void tearDown(){
    System.out.println("After test ");
     calculator=null;
    }

}
