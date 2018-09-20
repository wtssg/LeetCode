package leetcode;

/**
 * 旋转数组
 *给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class Question189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int flag = nums.length - k - 1;
        turnArrary(nums, 0, flag);
        turnArrary(nums,flag + 1, nums.length - 1);
        turnArrary(nums, 0, nums.length - 1);
    }

    /**
     * 翻转数组
     * @param a
     * @param left
     * @param right
     */
    public void turnArrary(int[] a, int left, int right) {
        int begin = left;
        int end = right;
        for (; left < right; right--, left++) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }
    }
    public static  void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        Question189 q = new Question189();
        q.rotate(a, 3);
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
