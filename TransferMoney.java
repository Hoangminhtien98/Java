package Baitap;

import java.util.Scanner;

public class TransferMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double rule = usd * 23000;
        System.out.print("Giá trị VND: " + rule);
    }
}
