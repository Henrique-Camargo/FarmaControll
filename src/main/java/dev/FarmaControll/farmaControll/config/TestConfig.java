package dev.FarmaControll.farmaControll.config;

import dev.FarmaControll.farmaControll.repository.MedicamentRepository;
import dev.FarmaControll.farmaControll.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private MedicamentRepository medicamentRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {



    }
}
