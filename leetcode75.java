class Solution {
    public void sortColors(int[] nums) {
    int arr[]=new int[3];
    Arrays.fill(arr,0);
    for( int i=0;i<nums.length;i++)
    {
        if(nums[i]==0){
          arr[0]++;
        }
        else if (nums[i]==1){
         arr[1]++;
        }else{
            arr[2]++;

        }
    }
    int j=arr[0];
    int k = arr[0]+arr[1];
    int l=arr[0]+arr[1]+arr[2];
    for( int i=0 ;i<nums.length;i++ ){
        if(i<j)
        nums[i]=0;
        else if(i<k)
        nums[i]=1;
        else
        nums[i]=2;
        
    }

  
    }

}