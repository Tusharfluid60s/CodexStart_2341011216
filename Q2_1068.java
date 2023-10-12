import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Solved it via recursion
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        System.out.print(n+" ");
        helper(n);

    }
    public  static  void helper(Long n){
        // Base Condition
        if(n==1){
            return;
        }
        if(n%2==0){
            System.out.print(n/2 + " ");
            helper(n/2);
        }else{
            System.out.print((n*3)+1 + " ");
            helper((n*3)+1);
        }
    }


}