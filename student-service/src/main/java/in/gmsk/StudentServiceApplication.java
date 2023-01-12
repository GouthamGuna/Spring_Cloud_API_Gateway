package in.gmsk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@RequestMapping("/student/api")
public class StudentServiceApplication {

	@GetMapping
	public List<Student> getStudentList(){

		return Stream.of(
				new Student(1, "Abdul", "CE23", "Civil","IV"),
				new Student(2, "Mani", "MBA23", "MBA","IV"),
				new Student(3, "Dinesh", "MCA23", "MCA","IV"),
				new Student(4, "Fahad", "CE23", "Civil","IV"),
				new Student(5, "Jay Kumar", "EE23", "EEE","IV"),
				new Student(6, "Manoj", "EE23", "EEE","IV"),
				new Student(7, "Mohan", "EE23", "EEE","IV")
		).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

}
