package Entites;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * 
 */
@Entity
public class Banque {
	
	@Id
	private int id;
	private String nom;
	
	@OneToMany(mappedBy="banque")
	private Set<Client> clients = new HashSet<Client>();

	/** Constructeur
	 * 
	 */
	public Banque() {
		
	}

	/** Getter pour id
	 * @return the id 
	*/
	public int getId() {
		return id;
	}

	/** Setter pour id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter pour nom
	 * @return the nom 
	*/
	public String getNom() {
		return nom;
	}

	/** Setter pour nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
