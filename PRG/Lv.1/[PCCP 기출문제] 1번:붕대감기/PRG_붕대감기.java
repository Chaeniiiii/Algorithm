class PRG_붕대감기 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int time = 0; //현재 시간
        int power = health; //현재 체력
        
        for(int [] atk : attacks){
            
            int cnt = 0; //기술 성공 횟수
            int nowT = atk[0]; //공격 시간
            int nowP = atk[1]; //피해량
            
            while(time <= nowT){
                
                time ++;
                
                if(time == nowT){
                    cnt = 0;
                    power -= nowP;
                    break;
                }
                
                cnt ++;
                power+=bandage[1];
                
                if(cnt >= bandage[0]) {
                    cnt = 0;
                    power+=bandage[2];
                }
                if(power >= health) power = health;
                
            }
            
            if(power <= 0) return -1;
            
        }
        
        return power;
    }
}