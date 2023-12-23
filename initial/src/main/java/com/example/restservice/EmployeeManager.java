import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeManager {

    public List<Employee> getEmployees() {
        // Hard-code example employees
        return Arrays.asList(
                new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer"),
                new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Product Manager"),
                new Employee(3, "Bob", "Johnson", "bob.johnson@example.com", "Data Analyst")
        );
    }
}