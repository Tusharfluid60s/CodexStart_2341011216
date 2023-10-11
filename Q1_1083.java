import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  int a = helper();
        System.out.println(a);
    }
   static int helper() {
       Scanner scanner = new Scanner(System.in);

       int n = scanner.nextInt();
       HashSet<Integer> set = new HashSet<>();

       for (int i = 1; i <= n-1; i++) {
           set.add(scanner.nextInt());
       }
       for(int i =1 ; i<=n ; i++){
           if(!set.contains(i)){
               return i;
           }
       }
     return -1;
       // TC : O(N)
       // SC : O(1)
   }
}