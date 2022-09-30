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

# 의존관계
+ 스프링 어노테이션을 사용한 컴포넌트 설정
    + 어노테이션의 역할
        + 컴파일러에게 코드 작성 에러에 대한 정보 제공
        + 실행 시 특별한 기능을 실행하도록 정보를 제공

    스프링에서 어노테이션을 붙이게 되면 어떻게 작동할까?
    스프링이 실행되는 순간 해당 어노테이션을 스프링이 인식하고, 해당 어노테이션에 있는 객체를 생성하여 스프링 컨테이너에 넣어둔다.

    각 클래스당 1개의 객체만 생성가능하다. 그러므로 같은 스프링 빈이면 인스턴스의 값이 같다.


    + `memberService()`는 서비스를 담당하기 때문에 `Service`어노테이션을 추가한다.
    ```java
    @Service
    public class memberService{
        ....
    } 
    ```

    + `MemoryMemberRepository`는 저장소의 역할을 하기 때문에
    `Repository`의 어노테이션을 추가한다.
    ```java
    @Repository
    public class MemoryMemberRepository implements MemberRepository{
        ....
    }
    ```
+ 스프링 빈 Configuration을 사용하는 방법
    어노테이션을 사용한 방법은 자동으로 스프링 빈에 등록하는 방법이었다면, `Configuration`은 내가 직접 수동으로 스프링빈에 등록하는 방법입니다.

    + SpringConfig클래스 생성
        ```java
        @Configuration
        public class SpringConfig{
            
            @Bean // Bean에 등록되어야한다는 객체라는 의미의 Annotation
            public memberService memberService(){
                return new memberService(memberRepository());
                // 아래에서 생성된 memberRepository 객체를 넣어줌. 
            }
            @Bean
            // 여기서 MemberRepsitory는 인터페이스, MemoryMemberRepsitory로 구현하기 위해서 객체로 가져옴
            public MemberRepository memberRepository(){
                return new MemoryMemberRepository();
            }
        }
        ```