package hello.proxy;

import hello.proxy.code.ProxyPatternClient;
import hello.proxy.code.RealSubject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProxyApplicationTests {

	@Test
	void contextLoads() {
		RealSubject realSubject = new RealSubject();
		ProxyPatternClient client = new ProxyPatternClient(realSubject);
		client.execute();
		client.execute();
		client.execute();
	}

}
