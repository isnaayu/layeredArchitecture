package isnaayum.co.id.myproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MyprojectApplicationTests {

	@Test
	void contextLoads() {
		// This test method is intentionally left empty
		// because it serves as a basic context load check.
	}

}
