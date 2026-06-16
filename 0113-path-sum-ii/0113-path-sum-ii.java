/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void backtrack(TreeNode root,int k,List<List<Integer>> l,List<Integer> temp){
        if(root==null)
        return;
        temp.add(root.val);
        k-=root.val;
        if(root.left==null && root.right==null){
            if(k==0){
                l.add(new ArrayList<>(temp));
            }
        }else{
        backtrack(root.left,k,l,temp);
        backtrack(root.right,k,l,temp);
        }
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> l=new ArrayList<>();
        backtrack(root,targetSum,l,new ArrayList<>());
        return l;
    }
}