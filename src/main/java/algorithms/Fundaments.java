package algorithms;

import java.math.BigInteger;

public class Fundaments {

    static BigInteger[] fibo = new BigInteger[442752];

    static {
        fibo[0] = BigInteger.valueOf(1);
        fibo[1] = BigInteger.valueOf(1);
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
        }
    }

    public static void main(String[] args) {
        int lastFibo = fibo.length - 1;
        System.out.println(lastFibo + ":");
        System.out.println(fibo[lastFibo]);
    }
}
