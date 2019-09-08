import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        s.nextLine();
        String init[]=new String[T];
        for(int i=0;i<T;i++){
            init[i]=s.nextLine();
        }
        for(int j=0;j<T;j++){
            String a=init[j];
            for(int k=0;k<a.length();k=k+2){
                System.out.print(a.charAt(k));
            }
            System.out.print(" ");
            for(int k1=1;k1<a.length();k1=k1+2){
                System.out.print(a.charAt(k1));
            }
            System.out.println();
        }
    }
}

