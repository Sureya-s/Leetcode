class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int max = candies[0];
       for(int i =1;i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int a = 0;a < candies.length;a++){
            if(candies[a]+extraCandies >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }

        }
        return list;
       
    }
}
