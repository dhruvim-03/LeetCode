class Solution {
    public int maxProduct(int n) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
        while(n!=0)
        {
            arr.add(n%10);
            n/=10;
        }   
        Collections.sort(arr);
        int a=arr.getLast();
        arr.removeLast();
        int b=arr.getLast();
        return a*b;
    }
}