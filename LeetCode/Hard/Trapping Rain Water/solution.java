class Solution {
    public int trap(int[] height) {
        int n=height.length,water=0;;
        int leftmax=0,rightmax=0,maxheight=height[0],index=0;
        //Max height building
        for(int i=1;i<n;i++){
            if(maxheight<height[i]){
                maxheight=height[i];
                index=i;
            }
        }
        //left part
        for(int i=0;i<index;i++){
            if(leftmax>height[i]){
                water+=leftmax-height[i];
                

            }else{
                leftmax=height[i];
            }
        }
        for(int i=n-1;i>index;i--){
            if(rightmax>height[i]){
                water+=rightmax-height[i];
            }else{
                rightmax=height[i];
            }
        }
        return water;
        
    }
}