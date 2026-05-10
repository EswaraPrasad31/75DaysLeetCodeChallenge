class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] smallLeft=new int[n];
        int[] smallRight=new int[n];
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s1.isEmpty() && heights[i]<=heights[s1.peek()]){
                s1.pop();
            }
            smallLeft[i]=(s1.isEmpty())?-1:s1.peek();
            s1.push(i);
        }
        Stack<Integer> s2=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s2.isEmpty() && heights[i]<=heights[s2.peek()]){
                s2.pop();
            }
            smallRight[i]=(s2.isEmpty())?n:s2.peek();
            s2.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int area=(smallRight[i]-smallLeft[i]-1)*heights[i];
            ans=Math.max(ans,area);
        }
        return ans;
    }
}