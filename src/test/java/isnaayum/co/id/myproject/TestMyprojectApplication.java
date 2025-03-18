package isnaayum.co.id.myproject;

import org.springframework.boot.SpringApplication;

public class TestMyprojectApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyprojectApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
