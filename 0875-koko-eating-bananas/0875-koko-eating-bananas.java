class Solution {
    static int findHours(int[] piles,int speed){
        int hours=0;
        for(int pile:piles){
            hours+=Math.ceil((double)pile/speed);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        int answer=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int requiredHours=findHours(piles,mid);
            if(requiredHours<=h){
                answer=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return answer;
    }
}