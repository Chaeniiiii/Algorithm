import java.util.*;

public class PRG_데이터분석 {
    
    public int[][] solution(int[][] dataArr, String ext, int val_ext, String sort_by) {
        
        ArrayList<int []> arr = new ArrayList<>();
        
        List<String> str = Arrays.asList("code", "date", "maximum", "remain");
     
        int std = str.indexOf(ext);
        int sort = str.indexOf(sort_by);
        
        for(int [] data : dataArr){
            if(data[std] < val_ext) arr.add(data);
        }
        
        int [][] answer = arr.toArray(new int[0][]);
        Arrays.sort(answer, (a,b) -> Integer.compare(a[sort],b[sort]));
        
        return answer;
        
    }

}