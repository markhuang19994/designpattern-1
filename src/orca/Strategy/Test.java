package orca.Strategy;

import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){

        int result = 0 ;

        Calculator calculator = new Calculator();
        calculator.setStrategy(Calculator.DoType.ADD);

        result = calculator.execute(3 , 5) ;

        Assertions.assertEquals(8,result);

        calculator.setStrategy(Calculator.DoType.MULTYPLY);

        result = calculator.execute(result , 10);

        Assertions.assertEquals(80 , result);

        calculator.setStrategy(Calculator.DoType.DIVIDE);

        result = calculator.execute(result, 20);

        Assertions.assertEquals(4 , result );

        calculator.setStrategy(Calculator.DoType.MINUS);

        result = calculator.execute(result , 10);

        Assertions.assertEquals(-6 , result);

        calculator.reset();
        calculator.setStrategy(Calculator.DoType.ADD);
        result = calculator.execute(1,1);
        System.out.println(result);

        calculator.setStrategy(Calculator.DoType.POW);
        result = calculator.execute(3,10);
        System.out.println(result);

//        故意用一個錯的
//        Assertions.assertEquals(10 , result);

    }
}
