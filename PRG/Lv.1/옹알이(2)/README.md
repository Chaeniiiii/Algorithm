## [PRG] - 옹알이(2)
>[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/133499)

### 핵심 포인트
- Map을 활용해 특정 단어를 찾음 
- prev를 통해 같은 단어가 연속해서 나오는지 체크 

### 개선할 점 
- substring()은 새로운 문자열이 생성되므로 regionMatches()를 사용하는 것이 좋음    
- 문자열이 같은지 비교할 때, substring()을 사용하지 말고, index로 관리

~~~ java
for (String str : babbling) {

    int index = 0; //str에서 탐색할 인덱스
    char prev = ' '; //이전 단어의 첫 글자
    
    while (index < str.length()) {

        char st = str.charAt(index);
        
        if (st == prev || map.get(st) == null) {  
            answer--;
            break;
        }
        
        String child = map.get(st);
        int childLen = child.length();

        if (index + childLen > str.length() || !str.regionMatches(index, child, 0, childLen)) {
            answer--;
            break;
        }

        index += childLen; 
        prev = st;  
    }

}
~~~

### regionMatches() 
: 부분 문자열 비교
- regionMatches(int toffset, String other, int ooffset, int len)

- regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)

    - **ignoreCase** : 대소문자 무시 여부
    - **toffset** : 기존 문자열에서 매칭을 시작할 인덱스 번호 
    - **other** : 매칭시킬 문자열
    - **ooffset** : 매칭 문자열에서 매칭을 시작할 인덱스 번호
    - **len** : 매칭 문자열의 길이