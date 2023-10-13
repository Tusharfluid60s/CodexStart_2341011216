/*

Name: Tushar Kumar
Reg_No: 2341011216
PS LINK: https://cses.fi/problemset/task/1069

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

            public static void main(String[] args) {
                FastReader sc = new FastReader();
                String str = sc.next();
                int countcur =1;
                int max=0;

                for(int i =0; i<str.length()-1; i++){
                    if(str.charAt(i)==str.charAt(i+1)){
                        countcur++;

                    }else{
                        max = Math.max(max,countcur);
                        countcur=1;
                    }
                }
               int ans = Math.max(countcur,max);
                System.out.println(ans);
            }


            // TC:O(N)
        // SC:O(1)

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