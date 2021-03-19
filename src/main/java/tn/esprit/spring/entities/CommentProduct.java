package tn.esprit.spring.entities;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class CommentProduct {
	

	
	
	public CommentProduct(Client client, Product product, String content, Date date) {
		super();
		this.client = client;
		this.product = product;
		this.content = content;
		this.date = date;
	}

	private CommentProductId id;
	private Client client;
	private Product product;
	private String content;
	private Date date;
	
	@EmbeddedId 
	public CommentProductId getCommentProductId(){
		return id;
	}
	
	@ManyToOne
	@JoinColumn(name="idClient",referencedColumnName="id"
	, insertable=false, updatable=false)
	
	public Client getClient(){
		return client;
		
	}
	public void setClient(Client client){
		
		this.client=client;
	}
	
	@ManyToOne
	@JoinColumn(name="idProduct",referencedColumnName="id"
	, insertable=false, updatable=false)
	
	public Product getProduct(){
		return product;
		
	}
	public void setProduct(Product product){
		
		this.product=product;
	}
	
	public String getContent(){
		return content;
		
	}
	public void setContent(String content){
		
		this.content=content;
	}
	
	
	public Date getDate(){
		return date;
		
	}
	public void setDate(Date date){
		
		this.date=date;
	}
	
	
	
	

}