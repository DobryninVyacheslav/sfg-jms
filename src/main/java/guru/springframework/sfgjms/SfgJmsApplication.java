package guru.springframework.sfgjms;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgJmsApplication {

    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication.run(SfgJmsApplication.class, args);
    }

}
