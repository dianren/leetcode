public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        int[] res = new int[2];
        Node[] arr = new Node[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = new Node(i, nums[i]);
        }
        Arrays.sort(arr, new Comparator<Node>() {
            public int compare(Node a, Node b) {
                return a.value - b.value;
            }
        });
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (arr[left].value + arr[right].value == target) {
                res[0] = arr[left].index;
                res[1] = arr[right].index;
                return res;
            } else if (arr[left].value + arr[right].value > target) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }
    
    public class Node {
        int index;
        int value;
        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}

