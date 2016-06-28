package com.github.mkopylec.sb6240;

import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import static com.github.mkopylec.sb6240.SampleProperties.DEFAULT_CLASSES;
import static org.slf4j.LoggerFactory.getLogger;

@SpringBootApplication
@EnableConfigurationProperties(SampleProperties.class)
public class Application implements CommandLineRunner {

    private static final Logger log = getLogger(Application.class);

    @Autowired
    private SampleProperties sample;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.error("\n\n    Default exceptions from SampleProperties class: {}\n    Exceptions from application.yml file:           {}\n", DEFAULT_CLASSES, sample.getClasses());
    }
}
