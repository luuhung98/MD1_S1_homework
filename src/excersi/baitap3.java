package excersi;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài một cạnh hình vuông");
        float a = scanner.nextFloat();
        System.out.println("Diện tích hình vuông: " + a*a);
        System.out.println("Chu vi hình vuông là: " + a*4);
    }
}
