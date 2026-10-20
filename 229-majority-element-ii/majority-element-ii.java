class Solution {
public List<Integer> majorityElement(int[] nums) {
int n = nums.length;
List<Integer> l = new ArrayList<>();
HashMap<Integer, Integer> h = new HashMap<>();
    for (int i = 0; i < n; i++) {
        h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
        if (entry.getValue() > n / 3) {
            l.add(entry.getKey());
        }
    }
    return l;
}

}
