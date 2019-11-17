package com.example.demoImmobilierBack.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demoImmobilierBack.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	  @Query("select u from User u where u.email = :email or u.password = :password")
	  User findByEmailAndPassword(@Param("email") String email,
	                                 @Param("password") String password);
	  
	  @Query("select u from User u where u.email = :email")
	  User findByEmail(@Param("email") String email);
	  
	  <S extends User> S saveAndFlush(S entity);
	  
	  void deleteInBatch(Iterable<User> entities);
	  
	  <S extends User> S save(S entity);
	  
	  Optional<User> 	findById(Long id);
	  boolean 	existsById(Long id);
	  List<User> findAll();
	  
	  void 	deleteAll();
	  void 	deleteById(Long id);
	  void delete(User user);
	  
	  long count();
	  
	}