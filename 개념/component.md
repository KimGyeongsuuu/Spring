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

# Bean
개발자가 작성한 Method를 반환하는 객체를 Bean으로 만드는 것이다.
`@Configuration` 어노테이션이 들어간 Spring을 설정하는 클래스 내에 들어가는 메소드에서 선언한다.
```java
@Configuration
public class ApplicationConfig{
    @Bean
    public ArrayList<String> array(){
        return new ArrayList<String>();
    }
}
```
```java
@Configuration
public class ApplicationConfig{
    @Bean(name="myarray")
    public ArrayList<String> array(){
        return new ArrayList<String>();
    }
}
```
위와 같이 `@Bean`어노테이션에 `name`이라는 값을 이용하면 자신이 원하는 id로 `Bean`을 조정할 수 있다.