package io.mart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnalyticApplicationTests {

	@Test
	public void assertContextLoads() {
		assertThat(true).isTrue();
	}
	
	
	@Test
	public void newTest() {
		assertThat(true).isFalse();
	}
}
