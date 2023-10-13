/*

Name: Tushar Kumar
Reg_No: 2341011216
PS LINK: https://cses.fi/problemset/task/1071

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {


    public static void main(String[] args) throws IOException {
        FastReader scanner = new FastReader(); // taked help from geekforgeeks for this FastReader Class because it gives TLE without it

        int n = scanner.nextInt();
        while(n!=0 ){
            long x = scanner.nextLong();
            long y = scanner.nextLong();


            if(x<y){
                if(y%2==1){
                    long ans = y * y - x + 1;
                    System.out.println(ans);
                }else {
                    long ans = (y-1) * (y-1) + x;
                    System.out.println(ans);
                }
            }else {
                if(x%2==1){
                    long ans = (x-1) * (x-1) +y;
                    System.out.println(ans);
                }else {

                    long ans = (x) * (x) - y + 1;
                    System.out.println(ans);
                }
            }
            n--;


        }
        // TC:O(N)
        // SC:O(1)
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}