import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

public class CodeTest {
      //Kiểm thử biên

 /*   //Min
    @Test
    public void testFibonacci_1() {
        assertEquals(0,Code.fibonacci(0));
    }

    //Max
    @Test
    public void testFibonacci_2() {
        assertEquals(Long.MAX_VALUE,Code.fibonacci(100));
    }

    //Min+
    @Test
    public void testFibonacci_3() {
        assertEquals(1,Code.fibonacci(1));
    }

    //Max-
    @Test
    public void testFibonacci_4() {
        assertEquals(Long.MAX_VALUE,Code.fibonacci(99));
    }

    //Nom
    @Test
    public void testFibonacci_5() {
        assertEquals(1,Code.fibonacci(2));
    }

    //Min-
    @Test
    public void testFibonacci_6() {
        assertEquals(-1,Code.fibonacci(-1));
    }

    //Max+
        @Test
    public void testFibonacci_7() {
        assertEquals(Long.MAX_VALUE,Code.fibonacci(101));
    }*/

    //kiểm thử giá trị đặc biệt
//    @Test
//    public void testFibonacci_8() {
//        assertEquals(4660046610375530309L,Code.fibonacci(91));
//    }
//
//    @Test
//    public void testFibonacci_9() {
//        assertEquals(7540113804746346429L,Code.fibonacci(92));
//    }
//
//    @Test
//    public void testFibonacci_10() {
//        assertEquals(Long.MAX_VALUE,Code.fibonacci(93));
//    }


    //  Fib[92]=7540113804746346429
    //  Fib[91]=4660046610375530309
    // Fib[93] = (Fib[91] + Fib[92]) > Long.MAX_VALUE

    //Kiểm thử tương đương


    @Test
    public void testFibonacci_1() {
        assertEquals(-1,Code.fibonacci(-2));
    }

    @Test
    public void testFibonacci_2() {
        assertEquals(0,Code.fibonacci(0));
    }

    @Test
    public void testFibonacci_3() {
        assertEquals(1,Code.fibonacci(1));
    }

    @Test
    public void testFibonacci_4() {
        assertEquals(7540113804746346429L,Code.fibonacci(92));
    }

    @Test
    public void testFibonacci_5() {
        assertEquals(Long.MAX_VALUE,Code.fibonacci(93));
    }
}
