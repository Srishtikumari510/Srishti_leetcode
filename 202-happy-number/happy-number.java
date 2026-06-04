import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {

            set.add(n);

            int num = 0;

            while (n != 0) {
                int temp = n % 10;
                num += temp * temp;
                n = n / 10;
            }

            n = num;
        }

        return n == 1;
    }
}