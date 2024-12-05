public class PRG_둘만의암호{

    public String solution(String s, String skip, int index) {
        
        StringBuilder sb = new StringBuilder();
        
        boolean [] skipAlpha = new boolean[26];
        
        for(char c : skip.toCharArray()) skipAlpha[c-'a'] = true;
        
        for(char c : s.toCharArray()){
            
            int cnt = 0;
            char chr = c;
            
            while(cnt < index){
                
                chr = chr == 'z' ? 'a' : (char) (chr+1);
                if(skipAlpha[chr-'a']) continue;
        
                cnt++;
                
            }
            
            sb.append(chr);
        }
    
        return sb.toString();
    }

}