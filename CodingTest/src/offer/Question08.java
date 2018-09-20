package offer;

public class Question08 {
    public int JumpFloor(int target) {
        int first = 1;
        int second = 2;
        if (target == 1) {
            return 1;
        }
        if (target == 0) {
            return 0;
        }
        for (int i = 3; i <= target; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
