import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    double[] num = new double[] {1, 5.2, 4, 0, -1};
        System.out.println(sum(num)==9.2);
    }

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
