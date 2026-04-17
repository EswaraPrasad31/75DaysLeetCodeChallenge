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
    static boolean issame(TreeNode a,TreeNode b){
        if(a==null && b==null)
        return true;
        if(a==null || b==null)
        return false;
        if(a.val!=b.val)
        return false;
        return issame(a.left,b.left)&&issame(a.right,b.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
        return false;
        if(issame(root,subRoot))
        return true;
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
}