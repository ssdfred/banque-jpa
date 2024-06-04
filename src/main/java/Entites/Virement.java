package Entites;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * 
 */
@Embeddable
public class Virement {

	@Id
	@Column(name="ID")
	private int id;
	
	private String benificiaire;
	
	/** Constructeur
	 * 
	 */
	public Virement() {
		
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

	/** Getter pour benificiaire
	 * @return the benificiaire 
	*/
	public String getBenificiaire() {
		return benificiaire;
	}

	/** Setter pour benificiaire
	 * @param benificiaire
	 */
	public void setBenificiaire(String benificiaire) {
		this.benificiaire = benificiaire;
	}

	@Override
	public String toString() {
		return "Virement [id=" + id + ", benificiaire=" + benificiaire + "]";
	}
	
	
	
}
