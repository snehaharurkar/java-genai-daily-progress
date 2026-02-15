package day01;


//public class basics {
//    static void main(String[] args) {
//        int a=5;
//        int b=4;
//        System.out.println(a+b);
//
//    }
//}

//this is area of circle
//public class basics{
//    static void main() {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the radius: ");
//        int r=sc.nextInt();
//
//        float area=(float)Math.PI*r*r;
//        System.out.println(area);
//    }
//}

//this problem is of largest element in an array

//public class basics {
//    static void main() {
//        int arr[]={1,2,4,5,3,8,10,9};
//        int max=arr[0];
//
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//
//
//            }
//        }
//        System.out.println(max);
//
//    }
//}

// check the array is sorted or no
public class basics {
//    public static boolean basics(int[] arr) {
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < arr[i - 1]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 7, 4, 5, 6};
//        System.out.println(basics(arr));
//
//    }
//}


//    static void main() {
//        int a=5;
//        int b= 7;
//        int c=8;
//
//        if(a>b && a>c){
//            System.out.println("a");
//
//        } else if (b>a && b>c) {
//            System.out.println("b");
//
//
//        }else{
//            System.out.println("c");
//        }
//
//    }
//}

// in an easy way we can solve the above problem as

//    static void main() {
////        int a=3;
////        int b=5;
////        int v=8;
//
////        int max=Math.max(a, Math.max(b,v));
////        System.out.println(max);
//
////        OR
//    int[] numbers={1,2,3};
//    int max=numbers[0];
//     for(int num:numbers){
//       if(num>max){
//           max=num;
//       }
//
//        }
//        System.out.println(max);
//
//
//    }
//}

// this is a grade calculator
static void main() {
    int marks=90;

    if(marks>=90){
        System.out.println("A+");

    }else if (marks<90 && marks>80){
        System.out.println("A");
    }else{
        System.out.println("B");
    }
    System.out.println();
}
}