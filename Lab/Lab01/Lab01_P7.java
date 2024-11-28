package Lab.Lab01;

public class Lab01_P7 {
    public static void main(String[] args) {
        max(4, 5);
        max(2.3f, 4.5f);
    }
    static void max(int a, int b) {
        int max_value = (a > b) ? a : b;
        int min_value = (a < b) ? a : b;
        System.out.printf("\nMax: %d, min: %d", max_value, min_value);
    }

    static void max(float a, float b) {
        float max_value = (a > b) ? a : b;
        float min_value = (a < b) ? a : b;
        System.out.printf("\nMax: %.2f, min: %.2f", max_value, min_value);
    }
}
