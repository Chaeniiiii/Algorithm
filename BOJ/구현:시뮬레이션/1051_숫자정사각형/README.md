### [BOJ] - 1051 숫자 정사각형
> [문제 링크](https://www.acmicpc.net/problem/1051)

**핵심 포인트**
1. 정사각형의 한 변이 될 수 있는 가장 긴 길이는 `Math.min(N, M)`
---
**참고**
- **입력값이 `123123`일 때, 배열에 한 요소씩 넣는 방법**

    ~~~java
    // 1. Arrays.stream() 사용
    square[i] = Arrays.stream(br.readLine().split("")).mapToInt(s -> Integer.parseInt(s)).toArray();

    // 2. String.chars() 사용
    square[i] = br.readLine().chars().map(c -> c - '0').toArray();

    // 3. for문과 charAt() 사용
    for (int i = 0; i < N; i++) {
        String str = br.readLine();
        for (int j = 0; j < M; j++) {
            square[i][j] = str.charAt(j) - '0';
        }
    }
    ~~~