package offer;

public class Question10 {
    public int NumberOf1(int n) {
        int result = 0;
//        int flag = 1;
//        while (flag != 0) {
//            if ((n & flag) != 0) {
//                result++;
//            }
//            flag = flag << 1;
//        }
        while (n != 0) {
            result++;
            n = (n - 1) & n;
        }
        return result;
    }
}
