## [IFL] - 공통원소구하기

### Integer [] VS int []
- 배열 선언 시 , Integer[] 로 선언을 했음. -> 오답 
    - [이유] : Wrapper 클래스끼리의 비교는 '주소값'을 비교하기 때문에 equals()를 사용해야 함 
- int []의 요소 끼리는 실제 값을 비교하고 Integer[] 요소끼리는 주소 값을 비교함 !
    - int [] 요소와 Integer [] 요소도 실제 값을 비교함
    - Integer [] 에는 자동 언박싱 기능이 있어 Integer 객체를 기본형 int로 자동 변환하게 됨 
