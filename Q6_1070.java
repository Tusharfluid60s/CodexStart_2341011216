/*

Name: Tushar Kumar
Reg_No: 2341011216
PS LINK: https://cses.fi/problemset/task/1070

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

            public static void main(String[] args) {
                FastReader sc = new FastReader();//4
              int n = sc.nextInt();
              if(n==2 || n==3) System.out.println("NO SOLUTION");
              else{
                  int i = 1;
                  int j =2;
                  StringBuilder sb = new StringBuilder();
                  while(j<=n){
                      sb.append(j + " ");
                      j+=2;
                  }
                  while (i<=n){
                      sb.append(i + " ");
                      i+=2;
                  }
                  System.out.println(sb);
              }

            }

            // TC:O(N)
        // SC:O(N)

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