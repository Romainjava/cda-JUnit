package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import convertisseur.Devise;
import junit.framework.TestCase;

public class DeviseTest extends TestCase {

	public DeviseTest(String name) {
		super(name);
	}

	@Test
	public void testReglesMetier() throws Exception {
		Devise devise;
		try {
			devise = new Devise("USD", -1);
			fail("Erreur non détectée : nom incorrect");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void testConstructeur() throws Exception {
		String nom = "USD";
		double tauxChange = 1.0;
		Devise devise = new Devise(nom, tauxChange);
		assertEquals(nom, devise.getNom());
		assertEquals(tauxChange, devise.getTauxChange());
	}

}
