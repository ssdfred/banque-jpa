package Entites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * Création de la Table Client
 */
@Entity
public class Client {

	@Id
	private int id;
	
	private String nom;
	
	private String prenom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	@Embedded
	private Adresse adresse;
	
	@ManyToOne
	@JoinColumn(name="BAN_ID")
	private Banque banque;
	
	@ManyToMany
	@JoinTable(name="CPT_CLI",
					joinColumns=@JoinColumn(name="ID_CLI", referencedColumnName = "ID"),
					inverseJoinColumns = @JoinColumn(name="ID_CPT", referencedColumnName = "ID")
	)
	private Set<AbstractCompte> comptes = new HashSet<>();
	
	/** Constructeur
	 * 
	 */
	public Client() {
		
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

	/** Getter pour prenom
	 * @return the prenom 
	*/
	public String getPrenom() {
		return prenom;
	}

	/** Setter pour prenom
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter pour dateNaissance
	 * @return the dateNaissance 
	*/
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/** Setter pour dateNaissance
	 * @param dateNaissance
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	/** Getter pour banque
	 * @return the banque 
	*/
	public Banque getBanque() {
		return banque;
	}

	/** Setter pour banque
	 * @param banque
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/** Getter pour adresse
	 * @return the adresse 
	*/
	public Adresse getAdresse() {
		return adresse;
	}

	/** Setter pour adresse
	 * @param adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/** Getter pour comptes
	 * @return the comptes 
	*/
	public Set<AbstractCompte> getComptes() {
		return comptes;
	}

	/** Setter pour comptes
	 * @param comptes
	 */
	public void setComptes(Set<AbstractCompte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", adresse=" + adresse + ", banque=" + banque + ", comptes=" + comptes + "]";
	}

}
