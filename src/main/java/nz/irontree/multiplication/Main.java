package nz.irontree.multiplication;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        multiplication();
        segment();
    }

    public static void multiplication() {
        Calculation multiplication = new Calculation();
        multiplication.multiplication();
    }

    public static void segment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write coordinate of A(x) ");
        int x1 = scanner.nextInt();
        System.out.print("Write coordinate of A(y) ");
        int y1 = scanner.nextInt();
        System.out.print("Write coordinate of B(x) ");
        int x2 = scanner.nextInt();
        System.out.print("Write coordinate of B(y) ");
        int y2 = scanner.nextInt();

        Calculation segment = new Calculation();
        int length = segment.segment(x1, y1, x2, y2);
        System.out.printf("Length of segment AB: %d cm", length);
    }
}