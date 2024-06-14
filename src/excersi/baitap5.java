package excersi;

import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("semi-circular radius");
        float r= input.nextFloat();
        System.out.println("diameter of a circle:"+2*Math.PI*r);
        System.out.println("circle area" + Math.PI * r * r);
    }
}
