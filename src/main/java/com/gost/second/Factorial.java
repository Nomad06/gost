package com.gost.second;

public class Factorial {
    public static long computeFormula(int m, int r){
        if(r > m) throw new IllegalArgumentException("R is greater than m");
        //f(m,r)=m!*r!(m - r)!
        // r <= m
        if(r == m) return 0;
        long mrDiffFact = compute(m - r);
        long rFact = compute(r, m - r) * mrDiffFact;
        long mFact = compute(m, r) * rFact;
        long result = mFact * rFact * mrDiffFact;
        System.out.println(result);
        return result;
    }

    public static long compute(int num){
        if(num < 0) throw new IllegalArgumentException("Negative value");
        if(num == 0 || num == 1) return num;

        long result = num;

        for(int i = num - 1; i > 1; i--){
            result = result * i;
        }
        System.out.println(result);
        return result;
    }


    public static long compute(int num, int lowerBorder){
        if(num < 0) throw new IllegalArgumentException("Negative value");
        if(lowerBorder > num) throw new IllegalArgumentException("Lower border is greater than start number");
        if(num == 0 || num == 1 || num == 2 || lowerBorder == num) return num;
        long result = num;
        for(int i = num - 1; i > lowerBorder; i--){
            result = result * i;
        }
        System.out.println(result);
        return result;
    }
}
