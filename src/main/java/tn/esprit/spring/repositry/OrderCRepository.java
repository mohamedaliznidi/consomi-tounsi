package tn.esprit.spring.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import tn.esprit.spring.entities.OrderC;

@Repository
public interface OrderCRepository extends JpaRepository<OrderC, Integer> {





}
