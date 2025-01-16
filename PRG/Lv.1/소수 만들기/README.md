## [PRG] - 소수 만들기
>[문제 링크]()

### 핵심 포인트
- dfs를 통해 수의 조합을 구해주고 , 해당 수들의 합이 소수인지 판별

### 개선할 부분
- nums의 크기가 50이기 때문에 3중 for문을 사용하는게 훨씬 효율적임
- 함수 호출 오버헤드가 없고, 메모리 샤용량이 적음 ! 
~~~java
for(int i= 0; i<nums.length-2; i++){
    for(int j= i+1; j<nums.length-1; j++){
        for(int k= j+1; k<nums.length; k++){
            if(check(nums[i]+nums[j],nums[k])) cnt++;
        }
    }
}
~~~