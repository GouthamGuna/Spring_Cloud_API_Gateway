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
@RequestMapping("/course/api")
public class CourseServiceApplication {
	@GetMapping
	public List<Course> saveCourseDetails(){

		return Stream.of(
				new Course(1,"JAVA","8 - Months", "FREE"),
				new Course(2,"PYTHON","8 - Months", "FREE"),
				new Course(3,"SQL","8 - Months", "FREE"),
				new Course(4,"SPRING","8 - Months", "FREE"),
				new Course(5,"SPRING BOOT","8 - Months", "FREE"),
				new Course(6,"Django","8 - Months", "FREE")
		).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		SpringApplication.run(CourseServiceApplication.class, args);
	}

}
