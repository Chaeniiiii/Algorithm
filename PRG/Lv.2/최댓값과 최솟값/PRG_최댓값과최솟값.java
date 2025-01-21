class PRG_최댓값과최솟값 {
    
    public String solution(String s) {
        
        String [] strArr = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String str : strArr){ 
            
            int num = Integer.parseInt(str);
            
            max = Math.max(num,max);
            min = Math.min(num,min);
            
        }
        
        return sb.append(min).append(" ").append(max).toString();
        
    }
}