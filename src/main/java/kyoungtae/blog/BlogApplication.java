package kyoungtae.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // createdAt, updatedAt 자동 업데이트
@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args){
        SpringApplication.run(BlogApplication.class, args);
    }
}
