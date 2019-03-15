import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] test1 = {2, 3, 1, 4};
        Merge.mergesort(test1);
        System.out.println(Arrays.toString(test1));

        int[] test2 = {10};
        Merge.mergesort(test2);
        System.out.println(Arrays.toString(test2));

        int[] test3 = {6, 2};
        Merge.mergesort(test3);
        System.out.println(Arrays.toString(test3));

        int[] test4 = {9, 6, 2, 9};
        Merge.mergesort(test4);
        System.out.println(Arrays.toString(test4));

        int[] test5 = {5, 5};
        Merge.mergesort(test5);
        System.out.println(Arrays.toString(test5));

        int[] test6 = {9, 2, 10, -2};
        Merge.mergesort(test6);
        System.out.println(Arrays.toString(test6));
    }
}
