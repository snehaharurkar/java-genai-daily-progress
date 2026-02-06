package day04;
import java.util.ArrayList;
public class Studentmarks{
    static void main(String[] args) {
        ArrayList<Integer>marks=new ArrayList<>();
        marks.add(45);
        marks.add(56);
        marks.add(76);
        marks.add(87);
        marks.add(66);

        for(int m:marks){
            System.out.println(m);
        }
        int total=0;
        for(int m:marks){
            total=total+m;
        }
        double average= (double)total/marks.size();
        System.out.println("total marks is : " + total);
        System.out.println("average marks is : " + average);
    }

}
