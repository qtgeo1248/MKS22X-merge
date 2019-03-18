import java.util.Arrays;

public class Merge {
    public static void mergesort(int[] data) {
        mergesort(data, 0, data.length - 1);
    }

    public static void mergesort(int[] data, int start, int end) {
        if (data.length <= 1) {
            return;
        }
        //System.out.println(Arrays.toString(data));
        int[] left = new int[(start + end) / 2 - start + 1];
        for (int i = 0; i < left.length; i++) {
            left[i] = data[i];
        }
        //System.out.println(Arrays.toString(left));
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
        //System.out.println(Arrays.toString(data));
    }

    public static void mergesort(int[] data, int[] temp, int start, int end) {
        if (start == end) {
            return;
        }
        mergesort(temp, data, start, (start + end) / 2);
        mergesort(temp, data, (start + end) / 2 + 1, end);
        int i = 0;
        int j = (start + end) / 2 + 1;
        for (int k = 0; k < data.length; k++) {
            if (i > (start + end) / 2) {
                data[k] = temp[j];
            } else if (j >= data.length) {
                data[k] = temp[i];
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
