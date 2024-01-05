// https://www.codechef.com/START115D/problems/MAKE0

import java.util.*;
import java.lang.*;
import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        while (testcase != 0) {
            int size = in.nextInt();
            int[] A = new int[size];
            for (int i = 0; i < size; i++) {
                A[i] = in.nextInt();
            }
            int stepCount = 0;
            int lastindex = getNonZeroArray(A);
            if (lastindex == -1) {

            }

            testcase--;
        }

    }

    static int getNonZeroArray(int[] temp) {
        int lastindex = -1;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {

                break;
            } else {
                lastindex = i;
            }

        }
        return lastindex;
    }
}
