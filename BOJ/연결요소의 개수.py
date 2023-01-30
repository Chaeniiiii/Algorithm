from collections import deque
from collections import defaultdict
import sys

visited=[] # 방문한 노드 리스트
count=0 # 연결 요소 개수 
# value 값을 리스트로 여러개 넣기 위해 dict의 default를 list로 설정.
graph=defaultdict(list)

def DFS(graph,root,n):
    
    need_visited=deque() #방문해야 하는 노드 덱 

    global visited
    global count

    while root:
        need_visited.append(root[0])

        while need_visited:
            
            node=need_visited.pop()

            if node not in visited:
                visited.append(node)
                root.remove(node)

                need_visited.extend(graph[node])

        if len(visited)<=n: # 방문한 정점의 개수가 선언했던 정점 개수보다 작으면 
            count+=1
    
    if len(visited)!=n:
        count+=(n-len(visited))
    print(count)
    
# 정점의 개수 n, 간선의 개수 m 
n,m = map(int, sys.stdin.readline().split())

# 그래프 생성 
for i in range(m):
    u,v = map(int, sys.stdin.readline().split())

    graph[u].append(v)
    graph[v].append(u)

root= list(graph.keys())

DFS(graph,root,n)
