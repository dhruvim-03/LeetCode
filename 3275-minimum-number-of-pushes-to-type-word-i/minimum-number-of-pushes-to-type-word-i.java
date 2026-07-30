class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int c=n/8;
        int rem=n%8;
        int cost=0;
        for(int i=1;i<=c;i++){
            cost=cost+(i*8);
        }
        if(c==0&&rem>0){
            cost+=rem;
        }
        else if(c==1&&rem>0){
            cost+=(rem*2);
        }
        else if(c==2&&rem>0){
            cost+=(rem*3);
        }
        else if(c==3&&rem>0) {
            cost+=(rem*4);
        }
        return cost;
    }
}