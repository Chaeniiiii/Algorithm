## [BOJ] - 13549 숨바꼭질3
>[문제 링크](https://www.acmicpc.net/problem/13549)

### 핵심 포인트
- 방문 처리는 deque에서 위치를 꺼낼 때 해줘야 함.
    => 만약, deque에 삽입할 때 , 방문처리를 할 경우 가중치가 더 적은 '순간 이동' 상황이 고려가 되지 않을 수 있음 

### 0-1 BFS
- 가중치가 0,1로 주어진 그래프에서 최단 경로를 찾아낼 수 있는 알고리즘 
- 가중치가 0인 정점이 존재하기 때문에 실제로 정점의 방문 횟수가 더 많더라도 가중치가 낮은 경우를 고려해주어야 함.   
    => 거쳐온 노드 수가 많은 경로일지라도, 가중치에 0이 포함되어있기 때문에 도착지점에 왔을 때 누적 가중치는 거쳐온 노드 수가 적은 경로보다 작을 수 있음