public class Solution {
    public int[] countBits(int num) {
        if (num < 0) {
            return new int[0];
        }
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = getNumOfBits(i);
        }
        return res;
    }
    
    public int getNumOfBits(int num) {
        int counter = 0;
        for (int i = 0; i < 32; i++) {
            counter += (num & (1 << i)) != 0 ? 1 : 0;
        }
        return counter;
    }
}