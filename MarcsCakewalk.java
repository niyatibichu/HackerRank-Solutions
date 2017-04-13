import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarcsCakewalk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        long miles=0;
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories);
        
        for(int j=n-1, k=0;j>=0;j--, k++){
        	miles= (long) (miles+(calories[j]*Math.pow(2, k)));
        }
        System.out.println(miles);
        
        
    }
}