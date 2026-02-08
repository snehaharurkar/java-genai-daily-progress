package day06;


    public class FrequencyOfElement {
        public static void main(String[] args) {

            int[] arr = {2, 4, 6, 2, 8, 2, 4};
            int element = 2;

            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    count++;
                }
            }

            System.out.println("Frequency of " + element + " is: " + count);
        }
    }



