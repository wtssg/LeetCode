package leetcode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
public class Question105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }
    public TreeNode buildTree(int[] pre, int[] in, int pLeft, int pRight, int iLeft, int iRight) {
        if (pLeft > pRight || iLeft > iRight) {
            return null;
        }
        int i = iLeft;
        for (; i < iRight; i++){
            if (pre[pLeft] == in[i]) {
                break;
            }
        }
        TreeNode node = new TreeNode(in[i]);
        node.left = buildTree(pre, in, pLeft + 1, pRight, iLeft, i - 1);
        node.right = buildTree(pre, in, pLeft + i - iLeft + 1, pRight, i + 1, iRight);
        return node;
    }
}
