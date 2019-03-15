public class Merge {
    public static void mergesort(int[] data) {
        mergesort(data, 0, data.length - 1);
    }

    public static void mergesort(int[] data, int start, int end) {
        if (start == end) {
            return;
        }
        int[] left = new int[(start + end) / 2 - start];
        mergesort(left, 0, left.length);
        int[] right= new int[end - (start + end) / 2 + 1];
        mergesort(right, 0, right.length);
        int i = 0; //records for left array
        int j = 0; //records for right array
        for (int k = 0; k < data.length; k++) {
            if (i >= left.length) {
                data[k] = right[j];
            } else if (j >= right.length) {
                data[k] = left[i];
            }
        }
    }
}
