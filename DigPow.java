import java.util.ArrayList;

/*
Some numbers have funny properties. For example:

89 --> 8¹ + 9² = 89 * 1
695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p we want to find a
 positive integer k, if it exists, such as the sum of the digits of n taken to the successive powers of p is equal to
  k * n. In other words:
Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
If it is the case we will return k, if not return -1.
*/
public class DigPow {
    public static void main(String[] args) {
        System.out.println(digPow(0, 1));
    }

    public static long digPow(int n, int p) {
        if (n > 0 && p > 0) {
            ArrayList<Integer> digits = new ArrayList();
            int num = n / 10;
            int ost = n % 10;
            while (num > 0) {
                digits.add(ost);
                ost = num % 10;
                num = num / 10;
            }
            digits.add(ost);
            int summ = 0;
            int power = p;
            for (int i = digits.size() - 1; i >= 0; i--) {
                summ = summ + (int) Math.pow(digits.get(i), power);
                power++;
            }
            int res = summ / n;
            if (res > 0 && res * n == summ) {
                return res;
            }
        }
        return -1;
    }
}
