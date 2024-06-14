package excersi;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter scores for Math");
        float math=scaner.nextFloat();
        System.out.println("Enter scores for literature");
        float literature=scaner.nextFloat();
        System.out.println("Enter scores for science");
        float science=scaner.nextFloat();
        System.out.println("Average score is "+(math+literature+science)/3);
    }
}
