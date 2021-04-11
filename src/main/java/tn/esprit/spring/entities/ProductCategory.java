package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;





@Entity

public class ProductCategory implements Serializable {
	
	
	/**
	 * @param id
	 * @param categoryName
	 * @param products
	 */
	public ProductCategory(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	public ProductCategory(String categoryName) {
		super();
	
	}
	private String categoryName;
	
	/**@ManyToOne
	Product products;*/
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="productCategory")
	private Set<Product> products;

	
	
		//Getters&Setters
	
	
	public int getId() {
		return id;
	}
	
	
	public ProductCategory() {
		super();
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getCategoryName() {
		return categoryName;
	}
	
	
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	
}
