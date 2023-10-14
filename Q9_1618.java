/*

Name: Tushar Kumar
Reg_No: 2341011216
PS LINK: https://cses.fi/problemset/task/1618

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int result = 0;
       int denominator = 5;
       while(n/denominator!=0){
           result += n/denominator;
           denominator *= 5;
       }
        System.out.println(result);

    }

}
