/*

Name: Tushar Kumar
Reg_No: 2341011216
PS LINK: https://cses.fi/problemset/task/1094

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

            public static void main(String[] args) {
                FastReader sc = new FastReader();//3 2 5 1 7
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0 ; i<arr.length; i++){
                    arr[i]=sc.nextInt();
                }
                long result =0;

                for(int i =0 ; i< arr.length-1 ; i++){
                   if(arr[i+1]<arr[i]){
                       result += (arr[i]-arr[i+1]);
                       arr[i+1]=arr[i];

                   }
                }
                System.out.println(result);
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