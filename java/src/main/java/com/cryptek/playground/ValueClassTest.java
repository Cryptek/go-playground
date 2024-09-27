package com.cryptek.playground;

import java.util.Arrays;
import java.util.Random;

public class ValueClassTest {
    public static void main(String[] args) {
      final int SIZE = 100_000_000;
      final Random random = new Random();

      int[] randValues = new int[SIZE];
      int[] randValues2 = new int[SIZE];
      int[] results = new int[SIZE];

        randValues = Arrays.stream(randValues).map(x-> random.nextInt()).toArray();
        randValues2 = Arrays.stream(randValues2).map(x -> random.nextInt()).toArray();

        final Pojo pojo = new Pojo(randValues, randValues2, results);
        long startTime = System.nanoTime();
        pojo.add();
        System.out.println("POJO operation took : " + (System.nanoTime() - startTime));

        final InlinePojo iPojo = new InlinePojo(randValues, randValues2, results);
        startTime = System.nanoTime();
        iPojo.add();
        System.out.println("Inline POJO operation took : " + (System.nanoTime() - startTime));

    }
}