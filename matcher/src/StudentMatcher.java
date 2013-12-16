/**
 * Created by grangerabuhoff on 12/11/13.
 */
import java.util.LinkedList;
import java.util.Scanner;

public class StudentMatcher {
    public static void main(String[] args) {
        matchStudents();
    }



    public static void matchStudents(){
        Scanner scanner = new Scanner(System.in);

        String[] students = {"Kevin", "Ernie", "Marine", "Granger", "Shirley",
                "Fred", "Rachel", "Mandeep", "Hunter", "TJ"};

//        System.out.println("Default list? y/n: ");
//        String defaultList = scanner.next();
//
//        if(defaultList == "n"){
//            System.out.println("How many students: ");
//            int l = scanner.nextInt();
//            String[] students = new String[l];
//
//            for(int iStudent = 0; iStudent < l; iStudent++){
//                System.out.println("Enter a new name: ");
//                String nextInput = scanner.next();
//                 students[iStudent] = nextInput;
//            }
//        }
         int l = 10;

        boolean sorting = true;
        while(sorting){
            //generate a random string
            double[] randArr = new double[l];
            for(int i = 0; i < l; i++)
                randArr[i] = Math.random();



            //now sort the random array and the student arr side by side
            for(int n = 0; n < l; n++){
                for(int m = n; m < l; m++){
                    if(randArr[n] > randArr[m]){
                        double dummy = randArr[n];
                        String dummyStr = students[n];
                        randArr[n] = randArr[m];
                        students[n] = students[m];
                        randArr[m] = dummy;
                        students[m] = dummyStr;
                    }
                }
            }

        //Sort people

            for(int pCounter = 0; pCounter < l; pCounter++){
                if(l > 1 && l - pCounter == 1)
                    System.out.print(" & " + students[pCounter]);
                else if(pCounter%2 ==1)
                    System.out.print("& " +students[pCounter]);
                else{
                    System.out.println();
                    System.out.print("Group " + (pCounter/2+1) + " " + students[pCounter] + " ");
                }
            }
            System.out.println();
            System.out.println("Re-sort? y/n: ");
            if(scanner.next().equals("n"))
                sorting = false;
        }

    }
}
