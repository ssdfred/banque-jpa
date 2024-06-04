package Entites;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * 
 */
@Entity
@DiscriminatorValue("A")
public class AssuranceVie extends AbstractCompte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	/** Constructeur
	 * 
	 */
	public AssuranceVie() {

	}

	private Date dateFin;
	
	private double taux;

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

	/** Getter pour dateFin
	 * @return the dateFin 
	*/
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter pour dateFin
	 * @param dateFin
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter pour taux
	 * @return the taux 
	*/
	public double getTaux() {
		return taux;
	}

	/** Setter pour taux
	 * @param taux
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "AssuranceVie [id=" + id + ", dateFin=" + dateFin + ", taux=" + taux + "]";
	}
	

}
