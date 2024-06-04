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
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		try {
			transaction.begin();

			// Création de la Banque
			Banque banque = new Banque();
			banque.setNom("BNP");
			em.persist(banque);
	

			// Création de l'AbstractCompte
			AbstractCompte cpt1 = new AbstractCompte();
			cpt1.setNumero("123456");
			cpt1.setSolde(1000);
			cpt1.setType("A");

			em.persist(cpt1);
			// Création de l'AbstractCompte
			AbstractCompte cpt2 = new AbstractCompte();
			cpt2.setNumero("123456");
			cpt2.setSolde(1000);
			cpt2.setType("L");

			em.persist(cpt2);

			AbstractCompte compteAssuranceVie = new AbstractCompte();
			compteAssuranceVie.setType("assurance vie");
			compteAssuranceVie.setNumero("123456");
			em.persist(compteAssuranceVie);

			AbstractCompte compteLivretA = new AbstractCompte();
			compteLivretA.setType("A");
			compteLivretA.setNumero("654321");
			em.persist(compteLivretA);
			// Création du Client
			Client client1 = new Client();
			client1.getComptes().add(cpt1);
			client1.setBanque(banque);
			client1.setNom("Dupont");
			client1.setPrenom("Jean");
			client1.setDateNaissance(new Date(30 / 03 / 1990));
			client1.setAdresse(1, " Rue de Paris", 75000, "Paris");

			em.persist(client1);

			Client client2 = new Client();
			client2.getComptes().add(cpt2);
			client1.setBanque(banque);
			client2.setNom("Martin");
			client2.setPrenom("Paul");
			client2.setDateNaissance(new Date(30 / 03 / 1990));
			client2.setAdresse(2, "Avenue de Lyon", 69000, "Lyon");
			em.persist(client2);

			// Associer les clients aux comptes
			client1.getComptes().add(compteAssuranceVie);
			client1.getComptes().add(compteLivretA);
			client2.getComptes().add(compteAssuranceVie);
			client2.getComptes().add(compteLivretA);
			em.persist(client1);
			em.persist(client2);

			Operation operationVirement = new Operation();
			operationVirement.setMontant(500.0);
			operationVirement.setDate(new Date());
			operationVirement.setMotif("Virement");
			operationVirement.setCompte(compteAssuranceVie);
			em.persist(operationVirement);

			Operation operationDepot = new Operation();
			operationDepot.setMontant(200.0);
			operationDepot.setDate(new Date());
			operationDepot.setMotif("Dépot");
			operationDepot.setCompte(compteLivretA);
			em.persist(operationDepot);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}
