## [SFT] - 함께하는 효도

> [문제 링크](https://softeer.ai/practice/7727)

### 고려해야 할 점

- 해당 지문이 변경된 후 아래 방법의 백트래킹은 오답처리 됨

```
또, 친구들끼리 이동하는 도중 이동 경로가 겹치는 것은 불가능합니다

                       ⬇️

이때, 친구들끼리 이동하는 도중 동시에 같은 사과나무에서 마주치는 경우에는 싸움이 일어날 수 있기 때문에 남우는 이와 같은 경우가 없기를 바랍니다.
```

```java
for(int i = 0; i<4; i++){

        int mvX = pos.x + dx[i];
        int mvY = pos.y + dy[i];

        if(mvX < 0 || mvY < 0 || mvX >= n || mvY >= n || visited[mvX][mvY]) continue;
        visited[mvX][mvY] = true;
        dfs(new Pos(mvX,mvY), idx, dep+1,cnt+board[mvX][mvY]);
        visited[mvX][mvY] = false;

}

```

-> 한 친구가 방문한 후, 다른 친구도 같은 위치를 방문할 수 있음 ! visited[mvX][mvY] = true 로 처리할 경우 다른 친구가 해당 위치를 아예 방문도 못하게 되기 때문에 경로 선택에 있어서 예외가 발생 !
