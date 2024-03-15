package HW3;
import java.util.Arrays;

public class exsemple {
    public static void main(String[] args) {
        int[] array = {1, 9, 2, 8, 3, 7, 4, 6, 5};

        int maxNumber = Arrays.stream(array).max().getAsInt();
        int minNumber = Arrays.stream(array).min().getAsInt();

        System.out.println("Максимальное число: " + maxNumber);
        System.out.println("Минимальное число: " + minNumber);
    }
}
