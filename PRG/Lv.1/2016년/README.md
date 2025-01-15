## [PRG] - 2016년 
>[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12901)

### 핵심 포인트
- 금요일이 기준이므로 day[0] = FRI로 설정
- 금요일이 1월 1일이므로 today = 0이 아닌 -1로 설정 

### 개선할 점
- 아래와 같이 불필요한 연산을 줄이고 코드를 직관적으로 개선할 수 있음
~~~java
String [] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

int [] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};

for(int i = 1; i<a; i++){
    b += month[i];
}       

return day[(b-1)%7];
~~~