class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
           else
           {
            set.remove(nums[i]);
           } 
        }
        for(int x:set)
        {
            count=x;
        }
        return count;
    }   
}