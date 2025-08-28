package com.raxrot.fundamentals;

public class Bitwise {
    public static void main(String[] args) {
        int a=3,b=4;
        System.out.println("a&b "+(a&b));
        System.out.println("a|b" +(a|b));
        System.out.println(~a);

        //get total bits
        int number=10;
        int count=0;
        while (number!=0){
            int lastBit=number&1;
            if (lastBit==1){
                count++;
            }
            number=number>>1;
        }
        System.out.println(count);

        //convert to binary
        StringBuilder sb=new StringBuilder();
        number=10;
        while (number!=0){
            int lastBit=number&1;
            sb.append(lastBit);
            number=number>>1;
        }
        System.out.println(sb.reverse());
    }
}
