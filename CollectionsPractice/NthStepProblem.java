package com.CollectionsPractice;
public class NthStepProblem {

    // A recursive function used by countWays
    public static long countWays(int n)
    {
        long [] res = new long[n + 1];
        res[0] = 1;
        res[1] = 1;


        for (int i = 2; i <= n; i++)
            res[i] = res[i - 1] + res[i - 2];

        return res[n];
    }

    // Driver function
    public static void main(String argc[])
    {
        int n = 50;
        System.out.println(countWays(n));
    }
}
