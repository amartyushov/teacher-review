package io.mart.worktrack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorktrackApplicationTests {

	@Test
	public void assertContextLoads() {
		assertThat(true).isTrue();
	}
	
	
	@Test
	public void assertFakeTest() {
		assertThat(true).isFalse();
	}
}
