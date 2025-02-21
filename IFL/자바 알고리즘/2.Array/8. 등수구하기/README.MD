## [IFL] 등수구하기 

### 핵심 포인트 
- **Quick Sort** 
    - 배열이 기본형 배열일 때(int [], double []) 이미 정렬된 배열, 역순으로 정렬된 배열, 동일한 값이 너무 많을 경우에는 시간복잡도가 O(N^2)이 될 수 있음 (최악의 경우)
        - 객체형 배열(Integer [], String []) 사용하기   
        - 기본형은 Dual-Pivot QuickSort를 사용하고 객체형은 TimSort(Merge + Insertion Sort)를 사용함
    - 기본적으로 배열 정렬 시간복잡도는 O(NlogN)