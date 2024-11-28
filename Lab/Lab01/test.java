package Lab.Lab01;

public class test {
    public static void main(String[] args) {
        lv2Equation(1, 1, 1);
    }
    static void lv2Equation(double a, double b, double c) {
        if (a == 0) {
            System.out.println("This is not a level 2 equation");
        } else {
            double delta = b*b - 4*a*c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("x1 = %.2f", x1);
                System.out.printf("x2 = %.2f", x2);
            } else if (delta == 0) {
                double x1 = (-b) / (2 * a);
                System.out.printf("\nx1, x2 = %.2f", x1);
            } else {
                double real = -b / (2 * a);
                double imag = (Math.sqrt(-delta))/(2*a);
                System.out.printf("x1 = %.2f + %.2fi \n", real, imag);
                System.out.printf("x2 = %.2f - %.2fi \n", real, imag);
            }
        }
    }
}
