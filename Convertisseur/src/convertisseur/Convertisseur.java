package convertisseur;

import java.util.HashMap;

public class Convertisseur {
	HashMap<String, Devise> _listeDevises = new HashMap<>();

	public void ajouterDevise(String nom, double tauxChange) throws Exception {
		if(this._listeDevises.containsKey(nom)) {
			throw new Exception(nom + " déjà contenu");
		}
		Devise devise = new Devise(nom, tauxChange);
		this._listeDevises.put(nom, devise);

	}

	public double convertir(double montant, String nomDeviseDepart, String nomDeviseCible) throws Exception {
		double tauxDechangeDepart = this.getDevise(nomDeviseDepart).getTauxChange();
		double tauxDeChangeCible = this.getDevise(nomDeviseCible).getTauxChange();
		double newMontant =  montant / tauxDeChangeCible * tauxDechangeDepart;
		System.out.println(montant + " " + nomDeviseDepart + " = " + newMontant + " " + nomDeviseCible);
		return newMontant;
	}

	public Devise getDevise(String nom) {
		return this._listeDevises.get(nom);

	}
}
