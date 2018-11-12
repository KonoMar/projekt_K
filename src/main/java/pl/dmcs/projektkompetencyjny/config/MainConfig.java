package pl.dmcs.projektkompetencyjny.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import pl.dmcs.projektkompetencyjny.domain.Knight;
import pl.dmcs.projektkompetencyjny.domain.Quest;
import pl.dmcs.projektkompetencyjny.domain.repository.DBKnightRepository;
import pl.dmcs.projektkompetencyjny.domain.repository.InMemoryRepository;
import pl.dmcs.projektkompetencyjny.domain.repository.KnightRepository;

@Configuration
public class MainConfig {


    @Bean(name="inMemoryKnighRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepo() {
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name="DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBRepo() {
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }
}