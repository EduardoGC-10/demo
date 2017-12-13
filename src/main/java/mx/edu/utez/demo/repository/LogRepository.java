package mx.edu.utez.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.demo.entity.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Serializable>  {

}
