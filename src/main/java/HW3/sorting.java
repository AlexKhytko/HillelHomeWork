package HW3;
import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String argsAsString = Arrays.toString(args);
        System.out.println("Base " + argsAsString);


        String[] argsAsc = Arrays.copyOf(args, args.length);// Создаем копию массива для сортировки
        int[] numbers = new int[argsAsc.length];// переводим строку массива в числа
        for (int i = 0; i < argsAsc.length; i++) {
            numbers[i] = Integer.parseInt(argsAsc[i]);
        }
        Arrays.sort(numbers);//  Сортируем копию массива
        String numberString = Arrays.toString(numbers);// Выводим отсортированные элементы массива
        System.out.println("Asc:" + numberString);

        String[] argsAsc1 = Arrays.copyOf(args, args.length);// Создаем копию массива для сортировки
        int[] numbersA = new int[argsAsc1.length];// переводим строку массива в числа
        for (int i = 0; i < numbersA.length; i++) {
            numbersA[i] = Integer.parseInt(argsAsc1[i]);
        }
        for (int i = numbersA.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbersA[j] > numbersA[j + 1]) {
                    int tmp = numbersA[j];
                    numbersA[j] = numbersA[j + 1];
                    numbersA[j + 1] = tmp;
                }
            }
        }
        String numberAString = Arrays.toString(numbersA);
        System.out.println("Asc1:" + numberAString);


        String[] argsDesc = Arrays.copyOf(args, args.length);
        int[] numbersDesc = new int[argsDesc.length];// переводим строку массива в числа
        for (int i = 0; i < numbersDesc.length; i++) {
            numbersDesc[i] = Integer.parseInt(argsDesc[i]);
        }
        for (int i = 0; i < numbersDesc.length - 1; i++) {
            for (int j = 0; j < numbersDesc.length - i - 1; j++) {
                if (numbersDesc[j] < numbersDesc[j + 1]) {
                    int temp = numbersDesc[j];
                    numbersDesc[j] = numbersDesc[j + 1];
                    numbersDesc[j + 1] = temp;
                }
            }
        }
        String number1String = Arrays.toString(numbersDesc);
        System.out.println("Desc:" + number1String);

        String[] argsInner = Arrays.copyOf(args, args.length);// Создаем копию массива для сортировки
        int[] numbersInner = new int[argsInner.length];
        for (int i = 0; i < numbersInner.length; i++) {
            numbersInner[i] = Integer.parseInt(argsInner[i]);
        }
        for (int i = 0; i < numbersInner.length - 1; i++) {
            for (int j = 0; j < numbersInner.length / 2 - i - 1; j++) {
                if (numbersInner[j] < numbersInner[j + 1]) {
                    int temp = numbersInner[j];
                    numbersInner[j] = numbersInner[j + 1];
                    numbersInner[j + 1] = temp;
                }
            }
        }
        for (int i = numbersInner.length - 1; i > 0; i--) {
            for (int j = i; j > numbersInner.length / 2; j--) {
                if (numbersInner[j] < numbersInner[j - 1]) {
                    int tmp = numbersInner[j];
                    numbersInner[j] = numbersInner[j - 1];
                    numbersInner[j - 1] = tmp;
                }
            }
        }
        String numberInnerString = Arrays.toString(numbersInner);
        System.out.println("Inner:" + numberInnerString);

        String[] argsInner1 = Arrays.copyOf(args, args.length);// Создаем копию массива для сортировки
        int[] inner = new int[argsInner1.length];
        for (int i = 0; i <= argsInner1.length - 1; i++) {
            inner[i] = Integer.parseInt(argsInner1[i]);
        }
        Arrays.sort(inner);//  Сортируем копию массива
        for (int i = 0; i < inner.length - 1; i++) {
            if (i%2 == 0) {
                   inner[i/2] = inner[i];
  //                 continue;
            }
              else {
                 inner[inner.length - i/2 - 1] = inner[i];
       }
        }
        System.out.println("Inner1:" + Arrays.toString(inner)); // Выводим отсортированные элементы массива
    }
}

