package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> empty = new ArrayList<>();
        lists.add(empty);
        lists.addAll(subsets(nums, 0, nums.length - 1));
        return lists;
    }
    public List<List<Integer>> subsets(int[] nums, int left, int right) {
        List<List<Integer>> lists = new ArrayList<>();
        List<List<Integer>> newLists = new ArrayList<>();
        List<List<Integer>> leftLists = new ArrayList<>();
        List<List<Integer>> rightLists = new ArrayList<>();
        if (right == left) {
            List<Integer> min = new ArrayList<>();
            min.add(nums[left]);
            lists.add(min);
            return lists;
        }
        int center = (right + left) / 2;
        leftLists = subsets(nums, left, center);
        rightLists = subsets(nums, center + 1, right);
        for (List<Integer> i : leftLists) {
            for (List<Integer> j : rightLists){
                List<Integer> list = new ArrayList<>();
                list.addAll(i);
                list.addAll(j);
                newLists.add(list);
            }
        }
        lists.addAll(leftLists);
        lists.addAll(rightLists);
        lists.addAll(newLists);
        return lists;
    }
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] nums = {1, 2, 3, 4};
        Question78 question78 = new Question78();
        lists = question78.subsets(nums);
        System.out.println(lists.size());
    }
}
