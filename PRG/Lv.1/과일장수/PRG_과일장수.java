class Solution {
    public int solution(int k, int m, int[] score) {
        
        int [] cnt = new int[k+1];
        
        for(int i = 0; i<score.length; i++){
            cnt[score[i]]++;
        }
        
        int sum = 0;
        int pack = 0;

        for(int i = k; i>0; i--){
            
            cnt[i] += pack;
        
            sum += cnt[i]/m * m *i;
            pack = cnt[i] % m;

        }

        return sum;
    }
}