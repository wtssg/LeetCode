package leetcode;

public class Question106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    public TreeNode buildTree(int[] inorder, int iLeft, int iRight, int[] postorder, int pLeft, int pRight) {
        if (iLeft > iRight || pLeft > pRight) {
            return null;
        }
        int i = iLeft;
        for (; i <= iRight; i++) {
            if (inorder[i] == postorder[pRight]) {
                break;
            }
        }
        TreeNode p = new TreeNode(inorder[i]);
        p.right = buildTree(inorder, i + 1, iRight, postorder, pLeft + i - iLeft, pRight - 1);
        p.left = buildTree(inorder, iLeft, i - 1, postorder, pLeft, pLeft + i - iLeft - 1);
        return p;
    }
    public static void main(String[] args) {
        int[] a = {9, 3, 15, 20, 7};
        int[] b = {9, 15, 7, 20, 3};
        Question106 question106 = new Question106();
        TreeNode root = question106.buildTree(a, b);
        System.out.println(root.val);
        root = root.right;
        System.out.println(root.val);
    }
}
