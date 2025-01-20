## [PRG] - [PCCP 기출 문제] 10번/데이터 분석
>[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/250121)

### 핵심 포인트
- 데이터 뽑을 기준(ext)과 정렬 기준(sort_by)이 될 수 있는 데이터 구성 요소들을 리스트에 저장해두기 
- ext와 sort_by는 index로 관리해주기
    -> 처음에는 map을 통해 데이터 구성 요소 , 인덱스 번호를 저장함 (key값 : 데이터 구성 요소 / value : 인덱스 번호)
    -> 그러니 List의 indexOf() 함수를 쓰면 더 효율적으로 찾을 수 있음