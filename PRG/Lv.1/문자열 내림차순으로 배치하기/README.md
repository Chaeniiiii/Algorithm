### 방법 1.
~~~
Charater [] chrr = s.chars().mapToObj(c -> (char)c)
                                .toArray(Charater [] :: new);
                                
!! Arrays.sort()는 기본적으로 Objcet[]에만  Comparator를 사용할 수 있음 
    -> Charater[] 배열 생성 이유

Arrays.sort(c,Collections.reverseOrder());
for(char cc : c) sb.append(cc);
~~~

### 방법 2. 
~~~
char[] chrr = str.toCharArray();
Arrays.sort(chrr);
return new StringBuilder(new String(chrr)).reverse().toString();
~~~