class Solution {
    public boolean predictTheWinner(int[] nums) {
        int playerMaxAdv= currPlayerAdv(nums,0,nums.length-1);
        if(playerMaxAdv >=0){
            return true;
        }else{
            return false;
        }
    }

    private int currPlayerAdv(int[] nums, int left, int right){
        //base case
        if(left==right) return nums[left];

        // Choose left 
        int chooseleft=nums[left]-currPlayerAdv(nums,left+1,right);
    
        // Choose right 
        int chooseRight= nums[right]-currPlayerAdv(nums,left,right-1);

        return Math.max(chooseleft,chooseRight);



    }
}