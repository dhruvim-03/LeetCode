class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        int b[]=new int[n];
        int c1=0;int c2=0;
        a[0]=nums[0];
        b[0]=nums[1];
        for(int i=2;i<n;i++){
            if(a[c1]>b[c2]){
                a[++c1]=nums[i];
                
            }
            else
            b[++c2]=nums[i];
            

            
        }int j=0;
       for(int i=c1+1;i<n;i++){
        a[i]=b[j++];
       }
       return(a);



        
    }
}