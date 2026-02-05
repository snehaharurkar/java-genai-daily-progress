package day03;

public class SecondLargest {

    public static int secondLargest(int[] a) {
        int max = a[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                second = max;
                max = a[i];
            }
            else if (a[i] > second && a[i] != max) {
                second = a[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 49, 65, 87, 34};
        System.out.println(secondLargest(arr));
    }
}
