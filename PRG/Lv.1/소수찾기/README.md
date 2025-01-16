## [PRG] - 소수 찾기
>[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12921)

### 핵심 포인트
- i = a*b 일 때, a와 b 중 최소 하나는 (int)Math.sqrt(i) 이하이므로 , (int)Math.sqrt(i) 까지만 나누어보면 약수의 존재를 판단할 수 있음 
- 1은 소수가 아니므로 초기 소수 개수를 n-1로 설정 
