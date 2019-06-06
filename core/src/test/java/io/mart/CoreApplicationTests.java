package io.mart;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CoreApplicationTests {

	@Test
	void assertContextLoads() {
		assertThat(true).isTrue();
	}

}
