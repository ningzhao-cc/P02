package com.ccc;

import java.math.BigInteger;

/**
 * Created by Ning on 2/16/18.
 */
public class Lazy {

    public static Lazy instance;

    private BigInteger count = BigInteger.ZERO;

    public static Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }

    public void run() {
        int t = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % 2 == 0) {
                t++;
            }
            else {
                t--;
            }
        }
        count = count.add(BigInteger.ONE);
        System.out.println(count);
    }
}
