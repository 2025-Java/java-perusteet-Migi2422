package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    public static int max(int[] arr) {
        
        if (arr != null && arr.length > 0) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
        return Integer.MIN_VALUE;
    }
}
