class Solution {
    public void moveZeroes(int[] nums) {

    
    int m= nums.length;
    int j = -1;
    int k= 0; 
   
    while(k< m){
        
        if(nums[k]== 0 && j == -1) j = k;
        else if(nums[k]!= 0 && j != -1 ){
            nums[j] = nums[k];
            nums[k]= 0; 
            j++ ;  
         }
        k++;
    }
}
}
        
