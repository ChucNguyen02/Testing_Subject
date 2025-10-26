package iuh.com.project_test_jmeter.config;

import iuh.com.project_test_jmeter.entity.User;
import iuh.com.project_test_jmeter.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {
        return args -> {
            if (userRepository.findByUsername("user1").isEmpty()) {
                userRepository.save(new User(null, "user1", "pass123"));
                userRepository.save(new User(null, "user2", "abc123"));
                System.out.println("Đã khởi tạo 2 user mặc định: user1 / user2");
            }
        };
    }
}
