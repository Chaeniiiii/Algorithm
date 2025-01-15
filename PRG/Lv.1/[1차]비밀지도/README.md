## [PRG] - 1차 비밀지도
>[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/17681)

### 핵심 포인트 
- 비트 연산자를 통해 두 개의 지도를 결합 
- 자릿수를 맞추기 위해 한 비트씩 오른쪽으로 이동 

### 다른 방법
- format()함수와 replace() 함수 사용 (시간복잡도 측면에서 비효율적일 순 있음)

~~~java
String [] answer = new String[arr1.length];

for(int i = 0; i<arr1.length; i++){
            
    int num = arr1[i]|arr2[i];
    
    String len = "%"+n+"s"; //%5s -> 5자릿수
        
    String str = String.format(len,Integer.toBinaryString(num))
                        .replace("1","#")
                        .replace("0"," ");
    
}
~~~