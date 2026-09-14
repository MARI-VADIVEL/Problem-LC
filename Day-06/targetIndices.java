class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();

        int less = 0;
        int equal = 0;

        for(int num : arr) {
            if(num < target) {
                less++;
            } else if(num == target) {
                equal++;
            }
        }

        for(int i = 0; i < equal; i++) {
            list.add(less + i);
        }

        return list;
    }
}