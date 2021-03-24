package tn.esprit.spring.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Publicity;
import tn.esprit.spring.entities.PublicityCategory;

@Repository
public interface PublicityRepository extends JpaRepository<Publicity, Integer> {
	
	List<Publicity> findByPublicitycategory (PublicityCategory publicitycategory);
	

}