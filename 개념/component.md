# Component
`Component`어노테이션의 경우 개발자가 직접 짠 클래스를 Bean으로 등록하기 위한 어노테이션이다.
```java
@Component
public class Student(){
    public Student(){
        System.out.println("hi);
    }
}
```
`Student`클래스는 개발자가 직접 짠 코드이다. 이러한 클래스를 Bean으로 사용하기 위해 상단의 `@Component`어노테이션을 사용하였다.

즉, 패키지 스캔 안에 이 어노테이션은 "이 클래스를 정의했으니 빈으로 등록하라" 는 뜻이 된다.