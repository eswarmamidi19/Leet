//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
// 0 1 2 3 4 5 6

// 6 48 4 2 4 0 78   ans = 48
//               ^             

// fm = 78
// sm = 48  sm!=fm ce>sm








class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
        int firstMax = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i] > firstMax){
                firstMax =arr[i];
            }
        }
        
        int secondMax = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i] > secondMax && arr[i]!=firstMax){
                 secondMax = arr[i];
            }
        }
        
        
        if(secondMax==Integer.MIN_VALUE){
            return -1;
        }
        
        return secondMax;
     
     
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     max = Math.max(max,arr[i]);
        // }
        // int sm = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //      if(sm<arr[i] && arr[i] < max){
        //          sm =arr[i];
        //      }
        // }
        // return sm==Integer.MIN_VALUE?-1 : sm;
    }
}