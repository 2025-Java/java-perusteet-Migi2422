package viikko1;

public class TimesTable {
    public static String table(int n) {
        if (n < 1 || n > 10) return null;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(n + " x " + i + " = " + (n * i) + "\n");
        }
        return result.toString();
    }

public static int max(int[] arr) {
    if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
    int max = arr[0];
    for (int n : arr) {
        if (n > max) max = n;
    }
    return max;
    
    }
}
