class Solution {
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder, inorder, 0, inorder.length - 1);
    }

    TreeNode solve(int[] preorder, int[] inorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int value = preorder[preIndex++];
        TreeNode root = new TreeNode(value);

        int index = left;

        while (inorder[index] != value) {
            index++;
        }

        root.left = solve(preorder, inorder, left, index - 1);
        root.right = solve(preorder, inorder, index + 1, right);

        return root;
    }
}