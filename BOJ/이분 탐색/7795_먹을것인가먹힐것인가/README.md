### [BOJ] - 7795 먹을 것인가 먹힐 것인가 

- **핵심 포인트** 
1. 생명체 B를 탐색해야 하므로 B를 정렬 
2. A의 생명체를 하나씩 순회하면서 B에 자신보다 작은 생명체가 몇 개인지 확인 
   -> 현재 A의 생명체가 B의 중간 위치에 존재하는 생명체보다 작으면 B의 왼쪽을 탐색 
   -> 현재 A의 생명체가 B의 중간 위치에 존재하는 생명체보다 크거나 같으면 B의 오른쪽을 탐색 
3. 쌍의 개수는 result += (mid - str + 1); 로 계산 
