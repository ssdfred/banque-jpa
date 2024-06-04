package Entites;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


/**
 * 
 */
@Embeddable
public class Adresse {

	
	
	/** Constructeur
	 * 
	 */
	public Adresse() {

	}

	@Column(name="numero")
	private int numero;
	
	private String rue;
	
	private int codePostal;
	
	private String ville;

	/** Getter pour numero
	 * @return the numero 
	*/
	public int getNumero() {
		return numero;
	}

	/** Setter pour numero
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/** Getter pour rue
	 * @return the rue 
	*/
	public String getRue() {
		return rue;
	}

	/** Setter pour rue
	 * @param rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/** Getter pour codePostal
	 * @return the codePostal 
	*/
	public int getCodePostal() {
		return codePostal;
	}

	/** Setter pour codePostal
	 * @param codePostal
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/** Getter pour ville
	 * @return the ville 
	*/
	public String getVille() {
		return ville;
	}

	/** Setter pour ville
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
