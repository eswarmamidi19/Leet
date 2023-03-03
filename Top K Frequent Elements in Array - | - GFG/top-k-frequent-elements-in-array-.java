//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends
 class Pair{
        int key;
        int value;
        public Pair(int key,int value){
            this.key = key;
            this.value = value;
        }
    }  
class Solution {
      
    
    public int[] topK(int[] nums, int k) {
      HashMap<Integer,Integer> hm = new HashMap<>();
      
      for(int i=0;i<nums.length;i++){
          hm.put(nums[i],hm.get(nums[i])==null?1:hm.get(nums[i])+1);
      }
      
      PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
          if(a.value==b.value) {
              return b.key-a.key;
          }
          return b.value-a.value;
      });
      
      for(Integer ele: hm.keySet()){
          Pair p = new Pair(ele,hm.get(ele));
          pq.add(p);
      }
      int[] ans = new int[k];
      int j=0;
      while(k--> 0){
          ans[j]=pq.poll().key;
          j++;
      }
      
     return ans;
          
          
    }
}