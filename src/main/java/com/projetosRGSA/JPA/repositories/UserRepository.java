package com.projetosRGSA.JPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosRGSA.JPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
