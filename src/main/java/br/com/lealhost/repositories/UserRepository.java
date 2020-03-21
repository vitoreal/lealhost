package br.com.lealhost.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lealhost.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
