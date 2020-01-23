package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import convertisseur.Convertisseur;
import junit.framework.TestCase;

public class ConvertisseurTest extends TestCase {
	private Convertisseur convertisseur;

	public ConvertisseurTest(String name) {
		super(name);
	}
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		convertisseur = new Convertisseur();    
		convertisseur.ajouterDevise("EUR", 1.36);
	}

	@Test
	public void testAjouterDevise() throws Exception {
		
		try {
			convertisseur.ajouterDevise("EUR", 1.36);
			fail("Erreur non détectée : devise déjà ajoutée");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void testConvertir() throws Exception {
	
		convertisseur.ajouterDevise("USD", 1.0);
		convertisseur.ajouterDevise("GBP", 1.6);

		// conversion d'un euro en euros
		double resultat = convertisseur.convertir(1.0, "EUR", "EUR");
		assertEquals(1.0, resultat);

		// conversion d'une livre en dollars
		resultat = convertisseur.convertir(1.0, "GBP", "USD");
		assertEquals(1.6, resultat);

		// conversion de 20 euros en livres
		resultat = convertisseur.convertir(20.0, "EUR", "GBP");
		assertEquals(17.0, resultat);

		try {
			convertisseur.convertir(1.0, "YEN", "USD");
			fail("Erreur non détectée : devise inconnue");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
