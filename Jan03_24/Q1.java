// https://www.codechef.com/START115D/problems/CODECHEF

package Jan03_24;

import java.lang.*;
import java.io.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        String ans = (day % 4 == 0) ? "YES" : "NO";
        System.out.println(ans);
        
    }
}


