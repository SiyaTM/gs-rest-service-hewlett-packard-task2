import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(EmployeeManager employeeManager, Employees employees) {
		return args -> {
			// Hard-code example employees and set them to the Employees component
			employees.setEmployeeList(employeeManager.getEmployees());
		};
	}
}
