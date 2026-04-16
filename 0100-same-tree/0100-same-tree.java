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
    static List<Integer> generate(TreeNode root){
        List<Integer> l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                l.add(1_000_000);
                continue;
            }
            l.add(curr.val);
            q.add(curr.left);
            q.add(curr.right);
        }
        return l;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> l1=generate(p);
        List<Integer> l2=generate(q);
        if(l1.size()!=l2.size())
        return false;
        System.out.println(l1+" "+l2);
        for(int i=0;i<l1.size();i++){
            if(!l1.get(i).equals(l2.get(i)))
            return false;
        }
        return true;
    }
}