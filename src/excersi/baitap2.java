package excersi;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số tiền việt nam chuyển đổi");
        float vnd = scanner.nextFloat();
        System.out.println("Số tiền đô của bạn" + vnd/25000);
    }
}
