package tn.esprit.spring.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
@Inheritance( strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("CLIENT")
public class Client extends User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	
	//relation orderc
	@OneToMany (cascade = CascadeType.ALL, mappedBy="client" )
	private Set<OrderC> orderc;
	
	//adress
	@ManyToOne
	private Adress adress;
	
	//basket
	@OneToOne
	private Basket basket;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CL_EVT_ID")
	private Event event;
	
	@ManyToMany (cascade = CascadeType.ALL)
	private Set<Event> events ;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
	private Set<Subject> subjects;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
	private Set<Claim> claim;
	

}
