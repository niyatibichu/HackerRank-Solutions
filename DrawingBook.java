import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int pageTurn1 = 0;
		int pageTurn2 = 0;
		int start = 1;
		int end=n;
		// your code goes here
		while (start != p) {
			if (start % 2 != 0) {
				pageTurn1++;
			}
			start++;
		}
		while(end!=p){
			if(end%2==0){
				pageTurn2++;
			}
			end--;
		}
		if(pageTurn1<pageTurn2){
			System.out.println(pageTurn1);
		}
		else{
			System.out.println(pageTurn2);
		}
	}
}
