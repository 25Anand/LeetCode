class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=0;
        List<Boolean> ans = new ArrayList(candies.length);
        for(int i = 0;i<n;i++)
        {
            max = Math.max(candies[i],max);
        }
        for(int i = 0;i<n;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                ans.add(true);
            }else
                ans.add(false);
        }

    return ans;
    }
}
