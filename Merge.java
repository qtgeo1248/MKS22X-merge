public class Merge {
    public static void mergesort(int[] data) {
        mergesort(data, 0, data.length - 1);
    }

    public static void mergesort(int[] data, int start, int end) {
        if (start == end) {
            return;
        }
        int[] left = new int[(start + end) / 2 - start];
        int[] right= new int[end - (start + end) / 2 + 1]
    }
}
