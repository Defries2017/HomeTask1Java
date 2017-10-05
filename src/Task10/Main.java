package Task10;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {

    //  Напишите функцию fib(n), которая по данному целому
    // неотрицательному n возвращает n-e число Фибоначчи.
    // В этой задаче нельзя использовать циклы — используйте рекурсию

    static Map<Integer, BigInteger> cahs = new HashMap<>();
    static int cnt = 0;

    private static BigInteger fib(int n){

        if (n < 2) {
            return BigInteger.valueOf(n);
        }
//        else {
//            BigInteger res = fib(n - 1);
//            BigInteger abs = res.add(fib(n - 2));
//            return abs;
//        }

       if (cahs.containsKey(n)) {
            return cahs.get(n);
        } else {
            BigInteger res = fib(n - 1);
            BigInteger abs = res.add(fib(n - 2));

            cahs.put(n, abs);
            return abs;
        }
    }

    public static void main(String[] args) {


        for (int i = 0; i < 46; i++) {

            long start = System.currentTimeMillis();

            System.out.print(i + ": " + fib(i) + " | ");

            long stop = System.currentTimeMillis();
            System.out.println( stop - start + " ms");
        }
        long stop2 = System.currentTimeMillis();

    }

}
