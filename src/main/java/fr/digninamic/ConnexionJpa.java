package fr.digninamic;


import Entites.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.Date;

/**
 * 
 */
public class ConnexionJpa {

	/**
	 * Création des insertion et select sur la table Region
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();
/*nsérer en base de données des instances des différents objets en utilisant l’EntityManager
o insérer un compte associé à 2 clients
o insérer un client avec plusieurs comptes :
▪ 1 compte de type assurance vie
▪ 1 compte de type livret A
o insérer des opérations de type virements sur un compte
o insérer des opérations de type opérations sur un compte */
		//Création des AbstractCompte
		AbstractCompte cpt1 = new AbstractCompte();
		cpt1.setNumero("123456");
		cpt1.setSolde(1000);
		
		em.persist(cpt1);

		Client num1 = new Client();
		num1.setNom("ruhy");
		num1.setPrenom("fred");
		num1.setDateNaissance(new Date(30/03/1990));
		num1.setAdresse(1, "rue de la paix", 75000, "Paris");
		em.persist(num1);

		transaction.commit();
		

		//Fermeture des ressources
;		em.close();

	}

}
