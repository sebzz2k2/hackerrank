import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_6_let's_review {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i=0;i<T;i++){
            String s = scan.next();
            for (int j=0; j<s.length();j=j+2)
                System.out.print(s.charAt(j));
             System.out.print(" ");
            for (int j=1; j<s.length();j=j+2)
                System.out.print(s.charAt(j));
            System.out.println();
        }
    }
}
