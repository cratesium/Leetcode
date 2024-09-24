import java.util.Arrays;

public class Solution {
    static int dp[][];
    public static int count(int [][] points ,int n , int prev){
        int maxi=0;
     if( n==0){
         for( int i=0 ;i<3;i++){
              if(i!=prev){
                  
              maxi=Math.max(maxi, points[0][i]);
              }


         }



      return maxi;
     }

     if(dp[n][prev]!=-1) return dp[n][prev];
      

        for( int i=0 ;i< 3 ;i++){
       
       if(i!=prev){
        
       int earn = points[n][i] + count(points, n-1, i);


      maxi=Math.max(maxi, earn);




       }
       



      }

      return dp[n][prev]= maxi;







    }
    public static int ninjaTraining(int n, int points[][]) {
        dp= new int [points.length][4];
        for( int i=0 ;i<dp.length;i++){
         Arrays.fill(dp[i], -1);
        }
        return count(points,n-1,3);

        // Write your code here..
    }

}