class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Arrays.sort(nums);
        // HashSet<List<Integer>> threeSum = new HashSet<>();
        // if(nums.length < 3) return new ArrayList<>(threeSum);
        // for (int i=0;i<nums.length-2;i++){
        //     int j=i+1;
        //     int k=nums.length-1;
        //     while(j<k){
        //         int sum=nums[i] + nums[j] + nums[k];
        //         if(sum==0){
        //             List<Integer> temp = new ArrayList<>();
        //             temp.add(nums[i]);
        //             temp.add(nums[j]);
        //             temp.add(nums[k]);
        //             threeSum.add(temp);
        //             j++;
        //             k--;
        //         }else if(sum>0){
        //             k--;
        //         }else{
        //             j++;
        //         }
        //     }
        // }
        // return new ArrayList<>(threeSum);
    
    --------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                                         2nd APPROACH     
    
        SOLUTION 2:--------------->
      Arrays.sort(nums);
		List<List<Integer>> res = new LinkedList();
		for (int i = 0; i < nums.length-2; i++) {
			if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
				int lo = i + 1, hi = nums.length-1, sum = 0 - nums[i];
				while(lo < hi) {
					if(nums[lo] + nums[hi] == sum) {
						res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
						while(lo < hi && nums[lo] == nums[lo+1]) lo++;
						while(lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;
						hi--;
					} else if(nums[lo] + nums[hi] < sum)
						lo++;
					else
						hi--;
				}
			}
		}
		return res;
    }
}
