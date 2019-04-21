package com.gost.first;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0) sb.append("Two");
            if(i % 7 == 0) sb.append("Seven");
            if(sb.length() == 0) {
                System.out.println(i);
                continue;
            }
            System.out.println(sb);
            sb.delete(0, sb.length());
        }
    }
}
