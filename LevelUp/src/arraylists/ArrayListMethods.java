package arraylists;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(45,8,15,99,4,81,18,28,78,20));
//        array1.add(45);
//        array1.add(8);
//        array1.add(15);
//        array1.add(99);
//        array1.add(4);
//        array1.add(81);
//        array1.add(18);
//        array1.add(28);
//        array1.add(78);
//        array1.add(20);
    System.out.println("The max number of array is " + maxInt(array1));
//    System.out.println("The average of array is " + average(array1));
//    System.out.println("The average of maximum and minimum is " + maxAndMinAverage(array1));
//    System.out.println("The revert of the array is " + revertArrayList(array1));
//    System.out.println("The revert of the array is " + sortArray(array1));
//    System.out.println("The revert of the array is " + sortArray2(array1));
    }

    private static int maxInt (ArrayList<Integer> A){
//        int max = A.get(0);
        int max = Collections.max(A);
//        for (int i = 1; i<A.size();i++) {
//            if (max < A.get(i)) {
//                max = A.get(i);
//            }
//        }
        return max;
    }
    private static float average (ArrayList<Integer> A){
        float sum = 0;
        for (int i = 0; i<A.size();i++) {
            sum = sum + A.get(i);
        }
        return sum/A.size();
    }
    private static float maxAndMinAverage (ArrayList<Integer> A) {
        float max = A.get(0);
        float min = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            if (max < A.get(i)) {
                max = A.get(i);
            }
            else if (min > A.get(i)) {
                min = A.get(i);
            }
        }
        return (max + min) / 2;
    }
    private static ArrayList<Integer> revertArrayList (ArrayList<Integer> A) {

//        Collections.reverse(A);     //this version works too

        int a;
        for (int i = 0; i<A.size()/2; i++) {
            a = A.get(i);
            A.set(i, A.get(A.size()-1-i));
            A.set(A.size()-1-i, a);
        }
        return A;
    }
    private static ArrayList<Integer> sortArray (ArrayList<Integer> A){
        ArrayList<Integer> secondArray = new ArrayList<>();
        for (int i = 0; i<A.size();i++) {
//       for (int i = 0; i<10;i++) {
            int min = A.get(0);
            int index = 0;
            for (int j = 1; j < A.size(); j++) {
                if (min > A.get(j)) {
                    min = A.get(j);
                    index = j;
                }
            }
            secondArray.add(min);
            A.remove(index);
        }
        return secondArray;
    }
    private static ArrayList<Integer> sortArray2 (ArrayList<Integer> A){        //second version of sorting (bubble sorting)
        int temp;
        for (int i = 0; i<A.size();i++) {
            for (int j = 1; j < A.size() - i; j++){
                if (A.get(j - 1) > A.get(j)) {
                    temp = A.get(j - 1);
                    A.set(j - 1, A.get(j));
                    A.set(j, temp);
                }
            }
        }
        return A;
    }
}