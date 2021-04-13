package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.build.HashCodeAndEqualsPlugin.Sorted;
import tn.esprit.spring.entities.Category;
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.repositry.productRepository1;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


//algorithme qui va calculer les meilleurs produits chaque mois et les mettre dans le 1er rangé du rayon

@Service
public class BestOf {
	
	@Autowired
	productRepository1 product1;
	
//bestproduct	
	public List<Product> SortBySold() {
		List<Product> sorted=product1.findAll();
	     sorted.sort(new Comparator<Product1>() {
	    	@Override
	    	public int compare(Product P1,Product P2){
	    		return P2.getSold()-P1.getSold();
	    	}
		});
	     return sorted;
	}
	
	
	
	
	
	}