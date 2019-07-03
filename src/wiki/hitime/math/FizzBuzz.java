package wiki.hitime.math;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhangdaoping
 * @create 2019-07-03 15:44
 */
public class FizzBuzz {

    public static void main(String[] args) {
        int n = 15;
    }

    private static List<String> fizzBuzz(int n) {
        List<String> resultList = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            String s1 = i % 3 == 0 ? "Fizz" : "";
            String s2 = i % 5 == 0 ? "Buzz" : "";
            resultList.add(s1.equals(s2) ? String.valueOf(i) : s1 + s2);
        }
        return resultList;
    }
}
