import java.io.*;
import java.util.*;

public class SFT_플레이페어 {

    private static final int SIZE = 5;
    
    private static Map<Character,Pos> map; //알파벳 위치 저장 map

    private static char [][] board; // 5*5 표
    private static boolean [] visited; //알파벳 사용 여부 

    private static StringBuilder sb;

    private static class Pos {
        
        int x;
        int y;
        
        private Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
        
    }
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message = br.readLine();
        String key = br.readLine();

        map = new HashMap<>();

        board = new char [SIZE][SIZE];
        visited = new boolean [26];
        visited[(int)('J'-'A')] = true;

        sb = new StringBuilder();
        
        fillBoard(key); //key로 표를 채우기
        cutAlpha(message); //암호화

        System.out.println(sb.toString());
        
    }

    private static void fillBoard(String key){

        int x = 0; int y = 0; int idx;
        
        for(char c : key.toCharArray()){
            
            idx = (int)(c-'A');

            if(!visited[idx]){

                board[x][y] = c;
                visited[idx] = true;
                map.put(c,new Pos(x,y));

                y++;
                if(y/SIZE != 0) x ++;
                y%=SIZE;
                    
            }
            
        }

        if(board[SIZE-1][SIZE-1] == '\u0000') fillAlpha(x,y);
        
    }

    private static void fillAlpha(int x, int y){

        for(int i = 0; i<26; i++){
            
            if(visited[i]) continue;

            char c = (char)('A'+i);
            
            board[x][y] = c;
            visited[i] = true;
            map.put(c,new Pos(x,y));

            y++;
            if(y/SIZE != 0) x ++;
            y%=SIZE;
            
        }
        
    }

    private static void cutAlpha(String msg){

        int lt = 0;
        int rt = 1;

        int len = msg.length();
        
        while(lt < len ){

            if(lt == len - 1) {
                playfair(msg.charAt(lt),'X');
                break;
            }
            else {
                
                char ltC = msg.charAt(lt);
                char rtC = msg.charAt(rt);

                if(ltC == rtC){
                    if(ltC == 'X') playfair(ltC,'Q');
                    else playfair(ltC,'X');

                    lt ++;
                    rt ++;
                    
                }
                else {
                    playfair(ltC,rtC);
                    lt = rt + 1;
                    rt = lt + 1;
                }
                
            }
            
        }
        
    }

    private static void playfair(char ltC, char rtC){
        
        Pos lt = map.get(ltC);
        Pos rt = map.get(rtC);
        
        if(lt.x == rt.x){
            sb.append(board[lt.x][(lt.y+1)%SIZE]);
            sb.append(board[rt.x][(rt.y+1)%SIZE]);
        }
        else if(lt.y == rt.y){
            sb.append(board[(lt.x+1)%SIZE][lt.y]);
            sb.append(board[(rt.x+1)%SIZE][rt.y]);
        }
        else{
            sb.append(board[lt.x][(rt.y)]);
            sb.append(board[rt.x][(lt.y)]);
        }
        
    }
    
}
