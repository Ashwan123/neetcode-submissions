class Solution {
    public int maxArea(int[] heights) {
        int low = 0;
        int high = heights.length -1;
        int maxarea = 0;
        while(low<high)
        {
            int width = high-low;
            int height = Math.min(heights[low],heights[high]);
            int currarea = width* height;
            maxarea = Math.max(maxarea,currarea);
            if(heights[low]>heights[high])
            {
                high--;
            }
            else if(heights[low]<heights[high])
            {
                low++;
            }
            else
            {
                low++;
                high--;
            }
            
            
        }
        return maxarea;
    }
}
