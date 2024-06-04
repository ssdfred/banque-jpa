package Entites;

import jakarta.persistence.Entity;

/**
 * 
 */
@Entity
public class Virement extends Operation{


	
	private String benificiaire;
	
	/** Constructeur
	 * 
	 */
	public Virement() {
		
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
