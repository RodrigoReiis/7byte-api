package sevenbyte.sevenbyte_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories({"sevenbyte.sevenbyte_project"})
@SpringBootApplication
public class BootDataApplication {

 public static void main(String[] args) {
  SpringApplication.run(BootDataApplication.class, args);
 }
}
