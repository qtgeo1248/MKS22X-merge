import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] test1 = {2, 3, 1, 4};
        Merge.mergesort(test1);
        System.out.println(Arrays.toString(test1));
    }
}
