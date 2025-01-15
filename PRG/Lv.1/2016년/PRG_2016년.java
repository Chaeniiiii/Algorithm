class Solution {
    public String solution(int a, int b) {

        int today = -1;
        
        String [] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int [] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};

        int date = 0;
        
        for(int i = 1; i<a; i++){
            date += month[i];
        }       
        
        today += (b+(date%7))%7;
        
        return day[today == -1 ? 6 : today];
        
    }
}