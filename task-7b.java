class PathSum {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        return dfs(root, targetSum) 
             + pathSum(root.left, targetSum) 
             + pathSum(root.right, targetSum);
    }

    private int dfs(TreeNode node, long target) {
        if (node == null) return 0;
        int count = (node.val == target) ? 1 : 0;
        count += dfs(node.left, target - node.val);
        count += dfs(node.right, target - node.val);
        return count;
    }
}
