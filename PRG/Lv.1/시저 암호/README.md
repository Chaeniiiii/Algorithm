### Character.isUpperCase()
: 문자가 대문자인지 판단 -> boolean 값 리턴
### Character.isLowerCase()
: 문자가 소문자인지 판단 -> boolean 값 리턴

--- 

- **시저 암호 구현 방법 2.**
~~~java
if (Character.isLowerCase(ch)) ch = (char) ((ch - 'a' + n) % 26 + 'a');
else if (Character.isUpperCase(ch)) ch = (char) ((ch - 'A' + n) % 26 + 'A');
~~~