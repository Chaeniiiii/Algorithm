### [PRG] - 푸드 파이트 대회

- **핵심 포인트** 

~~~java
//deque 의 Integer 요소를 String으로 변환하는 방법
deque.stream().map(String :: valueOf).collect(Collectors.joining());
~~~

---
### 방법 2
~~~java
//문자열 활용
class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i; 
            }
        }

        return answer;
    }
}
~~~

### 방법 3
~~~java
//0 이전의 문자열만 구하고 이후 reverse()함수 활용하기 
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<food.length; i++) {
            int result = food[i] / 2;
            sb.append(String.valueOf(i).repeat(result));
        }

        String answer = ;
        return sb + "0" + sb.reverse();
    }
}
~~~