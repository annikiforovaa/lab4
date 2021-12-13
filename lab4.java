import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] array;
        float[] array2;
        int arrayLength = 1;
        array = new float[arrayLength];
        System.out.println("Введите элементы массива, закончите ввод словом 'quit': ");
        for (int i = 0; i < arrayLength; i++) {
            String enter = in.nextLine();
            if (Objects.equals(enter, "quit"))
                break;
            if (array.length < arrayLength) {
                array2 = new float[arrayLength];
                for (int j = 0; j < array.length; j++) {
                    array2[j] = array[j];
                }
                array = array2;
            }
            array[i] = Float.parseFloat(enter);
            arrayLength++;
        }
        System.out.println(" ");
        System.out.println("Ваш массив" + Arrays.toString(array));
        System.out.println(" ");

        int resultArrayLength = 0;
        int lastIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= array[lastIndex]) {
                resultArrayLength++;
                lastIndex = i + 1;
            }
        }
        resultArrayLength++;

        float[] result = new float[resultArrayLength];
        int resultIndex = 0;

        result[resultIndex] = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= result[resultIndex]) {
                resultIndex++;
                result[resultIndex] = array[i + 1];
            }
        }
        System.out.println("Итоговый массив:");
        for (float v : result) {
            System.out.println(v);
        }
        in.close();
    }
}
