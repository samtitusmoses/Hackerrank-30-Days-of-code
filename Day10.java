import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String i;
        String a="";
        while(n>0){
            if(n%2==1){
                i="1";
            }
            else{
                i="0";
            }
            a=a+i;
            n=n/2;
        }
        StringBuffer h=new StringBuffer(a);
        h=h.reverse();
        int max1=0;
        int sum=0;
        for(int j=0;j<h.length();j++){
            if(h.charAt(j)=='1'){
                sum++;
                if(sum>max1){
                    max1=sum;
                }
            }
            else{
                sum=0;
            }
        }
        System.out.println(max1);
        scanner.close();
    }
}
