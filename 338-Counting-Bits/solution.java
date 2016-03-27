public class Solution {
    public int[] countBits(int num) {
        if (num < 0) {
            return new int[0];
        }
        int[] res = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }
}