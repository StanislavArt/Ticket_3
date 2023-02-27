import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] ar = {"1", "2", "3", "4", "5"};
        System.out.println(Arrays.toString(ar));
        reverseArray(ar);
        System.out.println(Arrays.toString(ar));

        System.out.println();
        Double[] ar2 = {1.2, 3.2, 5.78, 6.2, 2.33};
        System.out.println(Arrays.toString(ar2));
        reverseArray(ar2);
        System.out.println(Arrays.toString(ar2));
    }

    public static <T> void reverseArray(T[] array) {
        int middleIndex = array.length / 2;
        int lastIndex = array.length - 1;
        T tmp;
        for (int i = 0; i < middleIndex; i++) {
            tmp = array[lastIndex - i];
            array[lastIndex - i] = array[i];
            array[i] = tmp;
        }
    }
}