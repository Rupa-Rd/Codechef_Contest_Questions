
// https://www.codechef.com/START115D/problems/CHRISDECOR
import java.util.*;
import java.lang.*;
import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        while (testcase != 0) {
            int NoOfLeaves = in.nextInt();
            int LargeOrnaments = in.nextInt();
            int SmallOrnaments = in.nextInt();
            if (SmallOrnaments >= 3) {
                int i = (int) Math.floor((float) SmallOrnaments / 3.0);
                LargeOrnaments -= i;
                NoOfLeaves -= i;
            } else {
                int j = (int) Math.floor((float) LargeOrnaments / 2.0);
                NoOfLeaves -= j;
            }
            if (NoOfLeaves != 0 && LargeOrnaments >= 2) {
                int k = (int) Math.floor((float) LargeOrnaments / 2.0);
                NoOfLeaves -= k;
            }
            if (NoOfLeaves == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            // while(NoOfLeaves != 0){
            // if(SmallOrnaments >= 3 && LargeOrnaments >= 1){
            // SmallOrnaments -= 3;
            // LargeOrnaments -= 1;
            // NoOfLeaves --;
            // }
            // else if(LargeOrnaments >= 2){
            // LargeOrnaments -= 2;
            // NoOfLeaves --;
            // }
            // else{
            // break;
            // }

            // }
            // if(NoOfLeaves == 0){
            // System.out.println("YES");
            // }else{
            // System.out.println("NO"); }

            testcase--;
        }
    }
}
