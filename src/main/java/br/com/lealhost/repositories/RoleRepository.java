package br.com.lealhost.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lealhost.entities.Roles;

public interface RoleRepository extends JpaRepository<Roles, Long> {

}
