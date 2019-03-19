import java.util.Arrays;

public class Merge {
    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            boolean isDone = false;
            int now = data[i];
            int j = i - 1;
            while (j > -1 && data[j] > now) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = now;
        }
    }
    
    public static void mergesort(int[] data) {
        int[] temp = new int[data.length];
        temp = Arrays.copyOf(data, data.length);
        mergesort(data, temp, 0, data.length - 1);
    }

    public static void mergesort(int[] data, int start, int end) {
        if (data.length <= 1) {
            return;
        }
        int[] left = new int[(start + end) / 2 - start + 1];
        for (int i = 0; i < left.length; i++) {
            left[i] = data[i];
        }
        mergesort(left, 0, left.length - 1);
        int[] right = new int[end - (start + end) / 2];
        for (int i = 0; i < right.length; i++) {
            right[i] = data[i + (start + end) / 2 + 1];
        }
        mergesort(right, 0, right.length - 1);
        int i = 0; //records for left array
        int j = 0; //records for right array
        for (int k = 0; k < data.length; k++) {
            if (i >= left.length) {
                data[k] = right[j];
                j++;
            } else if (j >= right.length) {
                data[k] = left[i];
                i++;
            } else {
                int l = left[i];
                int r = right[j];
                if (l < r) {
                    data[k] = l;
                    i++;
                } else {
                    data[k] = r;
                    j++;
                }
            }
        }
    }

    public static void mergesort(int[] data, int[] temp, int start, int end) {
        if (start == end) {
            return;
        }
        int i = start; //left part
        int j = (start + end) / 2 + 1; //right part
        mergesort(temp, data, i, j - 1);
        mergesort(temp, data, j, end);
        for (int k = start; k <= end; k++) {
            if (i > (start + end) / 2) {
                data[k] = temp[j];
                j++;
            } else if (j > end) {
                data[k] = temp[i];
                i++;
            } else {
                int l = temp[i];
                int r = temp[j];
                if (l < r) {
                    data[k] = l;
                    i++;
                } else {
                    data[k] = r;
                    j++;
                }
            }
        }
    }
}
