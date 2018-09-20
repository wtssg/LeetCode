package offer;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
//分治算法
public class Question04 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructBinaryTree(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }
    public TreeNode reConstructBinaryTree(int[] pre, int[] in, int pLeft, int pRight, int iLeft, int iRight) {
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
        node.left = reConstructBinaryTree(pre, in, pLeft + 1, pLeft + i - iLeft, iLeft, i - 1);
        node.right = reConstructBinaryTree(pre, in, pLeft + i - iLeft + 1, pRight, i + 1, iRight);
        return node;
    }
}
