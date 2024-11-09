### DFS 구현
- st 포함 X
```
// # dfs(int st, int dep, int cnt, int number)
for(int i = st; i<number.length; i++){
    if(!visited[i]){
        visited[i] = true;
        dfs(i,dep+1,cnt+number[i],number);
        visited[i] = false;
    }
}

// # main()
visited = new boolean [number.length];
dfs(0,0,0,number);
```

- st 포함 O
```
// # dfs(int st, int dep, int cnt, int number)
for(int i = st+1; i<number.length; i++){ //for문 시작점 위치가 st+1가 됨.
    if(!visited[i]){
        visited[i] = true;
        dfs(i,dep+1,cnt+number[i],number); 
        visited[i] = false;
    }
}

// # main()
//시작점을 main에서 지정 
for(int i = 0 ;i<number.length; i++){
    visited = new boolean [number.length];
    visited[i] = true; //시작점 방문 표시 
    dfs(i,1,number[0],number);  // dep은 1부터 시작
}
```