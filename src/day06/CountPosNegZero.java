package day06;


    public class CountPosNegZero {
        public static void main(String[] args) {

            int[] arr = {5, -3, 0, 7, -1, 0, 4};

            int positive = 0;
            int negative = 0;
            int zero = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] > 0) {
                    positive++;
                } else if (arr[i] < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }

            System.out.println("Positive numbers: " + positive);
            System.out.println("Negative numbers: " + negative);
            System.out.println("Zeros: " + zero);
        }
    }


