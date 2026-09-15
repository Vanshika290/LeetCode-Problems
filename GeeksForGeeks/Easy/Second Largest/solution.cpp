class Solution {
    public int getSecondLargest(int[] arr) {
        int ans=-1;
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            
            }
            //Second large
   
        }
        int second=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=ans){
                second=Math.max(second,arr[i]);
            }
        }
            
        return second;
    }
}