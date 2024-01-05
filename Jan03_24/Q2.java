// https://www.codechef.com/START115D/problems/CHOCDISTRIB

import java.util.*;
import java.lang.*;
import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int testcases = in.nextInt();
        while (testcases != 0) {
            int MinimumNumberOfChildren = 0;

            int TotalChocolates = in.nextInt();
            if (TotalChocolates == 1 || TotalChocolates == 0) {
                MinimumNumberOfChildren = TotalChocolates;
            } else {
                MinimumNumberOfChildren = (int) Math.ceil((float) TotalChocolates / 2.0);

            }
            int MaximumNumberOfChildren = TotalChocolates;
            System.out.print(MinimumNumberOfChildren + " " + MaximumNumberOfChildren + "\n");

            testcases--;
        }

    }
}
