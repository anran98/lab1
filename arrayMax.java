import java.util.Arrays;

public class arrayMax {
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] x = { 10, 232, 31, 45, 63 };
        int[] y = { 3, 76, 39, 346, 13 };
        int[] z = new int[5];

        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println("Array x = { " + arrayToString(x) + " }");
        System.out.println("Array y = { " + arrayToString(y) + " }");
        System.out.println("Array z = x + y = { " + arrayToString(z) + " }");
    }
}
