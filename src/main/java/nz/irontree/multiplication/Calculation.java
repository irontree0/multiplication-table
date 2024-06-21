package nz.irontree.multiplication;

public class Calculation {

    public void multiplication() {
        for (int num1 = 2; num1 < 6; num1++) {
            for (int num2 = 1; num2 < 11; num2++) {
                System.out.printf("%d * %d = %d%n", num1, num2, num1*num2);
            }
            System.out.println(" ");
        }
    }

    public int segment(int x1, int y1, int x2, int y2) {
        return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
