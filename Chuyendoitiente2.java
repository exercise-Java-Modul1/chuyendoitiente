import java.util.Scanner;

public class Chuyendoitiente2 {
    public static void main(String[] args) {
        double rate = 23000.0;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền (USD):");
        USD = sc.nextDouble();
        double VND = rate * USD ;
        System.out.println("Số tiền sau khi chuyển đổi là (VND) :"+VND);
    }
}
