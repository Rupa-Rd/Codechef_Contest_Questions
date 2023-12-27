// Question: https://www.codechef.com/START114D/problems/PAINTCHRIS

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t != 0){
		    int x = in.nextInt();
		    int y = in.nextInt();
		    int z = in.nextInt();
		    int area = x * y;
		    int TotalCostArea = z / 2;
		  //  double res = TotalCostArea / area;
		    System.out.println(Math.floorDiv(TotalCostArea,area));
		    t --;
    }
}
