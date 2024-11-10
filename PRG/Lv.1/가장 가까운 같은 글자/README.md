**방법 2.**
- Map + getOrDefault() 사용하기 

~~~java
HashMap<Character,Integer> map = new HashMap<>();
for(int i=0; i<s.length();i++){
    char ch = s.charAt(i);
    answer[i] = i-map.getOrDefault(ch,i+1); // ch라는 키에 매핑된 값이 없는 경우 i+1 반환 
    map.put(ch,i);
}
~~~