package com.farmaciasperuanas.springbootmicroservice.repositories;


//import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.farmaciasperuanas.springbootmicroservice.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}
