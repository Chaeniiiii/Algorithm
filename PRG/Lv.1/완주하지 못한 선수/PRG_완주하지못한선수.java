import java.util.HashMap;
import java.util.Map;

public class PRG_완주하지못한선수{

    public String solution(String[] participant, String[] completion) {
        
        Map<String,Integer> map = new HashMap<>();
        
        for(String str : completion) map.put(str,map.getOrDefault(str,0)+1);
        
        for(String str : participant){
            
            if(map.get(str) == null) return str;
            
            if(map.get(str) >= 2) map.replace(str,map.get(str)-1);
            else map.remove(str);
            
        }
        
        return "";
    }

    public static void main(String[] args) {

        PRG_완주하지못한선수 prg = new PRG_완주하지못한선수();
        prg.solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        
    }

}