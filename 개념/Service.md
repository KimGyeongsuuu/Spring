# Service
### Service란?
1. Client가 Request를 보낸다.
2. Reqeust를 Controller가 받는다.
3. Controller가 처리하기 위해서 `Service`를 호출한다.
4. `Service`가 알맞은 정보를 가공하여 Controller에게 전송한다.
5. Controller가 받은 정보를 Client에게 제공한다.

`Service`가 알맞은 정보를 가공하는 것을 `비즈니스 로직을 수행한다.`라고 말한다.
`Service`가 비즈니스 로직을 수행하고 데이터베이스에 접근하는 DAO를 이용하여 결과값을 받아온다.

### DAO
`DAO`는 Mysql서버에 접근하여 SQL문을 실행할 수 있는 객체입니다.

### JPA
`JPA`는 매우 적은 코드로 `DAO`를 구현되게 할 수 있습니다.
@Entity 인터페이스를 만드는 것 만으로도 `insert`, `Update`, `Delete`, `Select`를 모두 실행할 수 있게 만듭니다.

`JPA`가 만드는 코드는 매우 가볍운 쿼리를 대체하는 것이기 때문에 복잡해지면 SQL로 구현하는 것보다 못한 상황이 나올 수 있습니다.
그래서 복잡해지면 DAO로 같이 구현하는 방법도 있습니다.

![JPA](https://velog.velcdn.com/images%2Fjybin96%2Fpost%2F7304b826-dcdb-4ec8-a980-b5b43519cbb8%2F%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-11-17%20%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB%2012.13.53.png)