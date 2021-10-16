package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(1234568L, "KEHIDUPAN TERARAH","ROLLY ORTIS",
                    "2009", "NOVEL", 30000L )));
            log.info("Preloading" + repository.save(new Data(123466L, "CINTA MATI", "ASEP DAYAT",
                    "2020", "CERPEN", 40000L )));
            log.info("Preloading" + repository.save(new Data(1242465L, "ANTARIKSA", "JAJA MIHARJA",
                    "2011", "ILMU PENGETAHUAN", 50000L )));
        };
    }
}
