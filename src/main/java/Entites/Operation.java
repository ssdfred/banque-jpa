package Entites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * 
 */
@Entity

public class Operation  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	protected int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	private double montant;
	
	private String motif;
	
		
	@ManyToOne
	@JoinColumn(name="CPT_ID")
	private AbstractCompte compte;
	
	


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

	/** Getter pour date
	 * @return the date 
	*/
	public Date getDate() {
		return date;
	}

	/** Setter pour date
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/** Getter pour montant
	 * @return the montant 
	*/
	public double getMontant() {
		return montant;
	}

	/** Setter pour montant
	 * @param montant
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/** Getter pour motif
	 * @return the motif 
	*/
	public String getMotif() {
		return motif;
	}

	/** Setter pour motif
	 * @param motif
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}


	/** Getter pour compte
	 * @return the compte 
	*/
	public AbstractCompte getCompte() {
		return compte;
	}

	/** Setter pour compte
	 * @param compte
	 */
	public void setCompte(AbstractCompte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Operation [id=" + id + ", date=" + date + ", montant=" + montant + ", motif=" + motif + ", compte="
				+ compte + "]";
	}

	

}
