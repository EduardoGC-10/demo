package mx.edu.utez.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.demo.entity.User;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, Serializable>{

	
	public abstract User findByUsername(String username);
}
