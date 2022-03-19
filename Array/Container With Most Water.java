class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
        while(i<j){
        int area =(j-i)*Math.min(height[i],height[j]);
        if(max<area)
            max=area;
        if(height[i]<height[j]){
            i++;
        }else{
            j--;
        }
        }
        return max;
    }
}
