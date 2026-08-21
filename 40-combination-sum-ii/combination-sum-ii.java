class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombinations(0,target,candidates,ds,ans);
        return ans;      
    }
    public void findCombinations(int ind,int target,int candidates[],List<Integer> ds,List<List<Integer>> ans){
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        Arrays.sort(candidates);
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            ds.add(candidates[i]);
            findCombinations(i+1,target-candidates[i],candidates,ds,ans);
            ds.remove(ds.size()-1);
        }
        

    }
}