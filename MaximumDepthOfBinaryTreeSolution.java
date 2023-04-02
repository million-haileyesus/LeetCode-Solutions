public class MaximumDepthOfBinaryTreeSolution {
    public int maxDepth(TreeNode root) {
        int result = 0;
        if(root != null) {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            result = ((left > right) ? left : right) + 1;
        }
        return result;
    }
}
