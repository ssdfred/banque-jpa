package Entites;



import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;


/**
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE")
public class AbstractCompte {

	@Id
	@Column(name="ID")
	private int id;
	
	private String numero;
	
	private double solde;
	

	
	@OneToMany(mappedBy = "compte")
		private Set<Operation> operations = new HashSet<>();
	
	@ManyToMany
	@JoinTable(name="CPT_CLI",
					joinColumns=@JoinColumn(name="ID_CPT", referencedColumnName = "ID"),
					inverseJoinColumns = @JoinColumn(name="ID_CLI", referencedColumnName = "ID")
	)
	private Set<Client> clients;

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + ", clients=" + clients + "]";
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

	/** Getter pour numero
	 * @return the numero 
	*/
	public String getNumero() {
		return numero;
	}

	/** Setter pour numero
	 * @param numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/** Getter pour solde
	 * @return the solde 
	*/
	public double getSolde() {
		return solde;
	}

	/** Setter pour solde
	 * @param solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/** Getter pour clients
	 * @return the clients 
	*/
	public Set<Client> getClients() {
		return clients;
	}

	/** Setter pour clients
	 * @param clients
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	/** Getter pour operations
	 * @return the operations 
	*/
	public Set<Operation> getOperations() {
		return operations;
	}

	/** Setter pour operations
	 * @param operations
	 */
	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}





	
}
