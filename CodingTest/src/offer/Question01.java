package offer;

public class Question01 {
    public  String replaceSpace(StringBuffer str) {
        int nums = 0;
        int oldLength = str.length();
        for (int i = 0; i < oldLength; i++) {
            if (str.charAt(i) == ' ') {
                nums++;
            }
        }
        int newLengh = str.length() + nums*2;
        str.setLength(newLengh);
        while (oldLength > 0 && oldLength < newLengh) {
            if (str.charAt(--oldLength) == ' ') {
                str.setCharAt(--newLengh,'0');
                str.setCharAt(--newLengh,'2');
                str.setCharAt(--newLengh,'%');
            } else {
                str.setCharAt(--newLengh, str.charAt(oldLength));
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("We Are Happy");
        Question01 q = new Question01();
        String s = q.replaceSpace(sb);
        System.out.println(s);
    }
}
