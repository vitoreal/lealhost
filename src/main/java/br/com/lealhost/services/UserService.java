package br.com.lealhost.services;

import br.com.lealhost.entities.User;

public interface UserService {
	
    User save(User user);

    User findByUsername(String username);
}
