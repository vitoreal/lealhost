package br.com.lealhost.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.lealhost.entities.User;
import br.com.lealhost.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", true);
		User u2 = new User(null, "Alex Green", "alex@gmail.com", true); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
