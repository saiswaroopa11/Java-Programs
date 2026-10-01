public class DecimalFormatting {
    public static void main(String[] args) {
        double number = 123.456789;

        System.out.printf("%.1f%n", number);
        System.out.printf("%.2f%n", number);
        System.out.printf("%.3f%n", number);
    }
}