class Solution {
    public int findDuplicate(int[] nums) {

        int toret=0;
        Set<Integer > set = new HashSet<>();{
            for( int i=0 ;i< nums.length;i++)
            {
                  if(set.add(nums[i])==false){
                    toret=nums[i];
                  }
            }
        }
        return toret;
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
     int toret=0;
       Map<Integer,Integer>mp= new HashMap<>();
       for( int i=0;i<nums.length;i++){
        if(mp.get(nums[i])==null){
            mp.put(nums[i],1);
        }else{
            mp.put(nums[i],mp.get(nums[i])+1);
        }
       }
       for( var v : mp.entrySet()){
        if(v.getValue()>1){
            toret=v.getKey();
            break;
        }
       }
       return toret;
    }
}
