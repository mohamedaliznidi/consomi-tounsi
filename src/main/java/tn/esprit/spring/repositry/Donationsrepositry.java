package tn.esprit.spring.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Donations;
@Repository
public interface Donationsrepositry extends JpaRepository<Donations,Integer>  {
	List<Donations> findAll();
}