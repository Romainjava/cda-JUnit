package convertisseur;

public class Devise {

	String nom;
	double tauxCHange;

	public Devise(String nom, double tauxChange) throws Exception {
		if (nom.length() == 3) {
			this.nom = nom;

		} else {
			throw new Exception("Le nom " + nom + " est incorrect !");
		}
		if (tauxChange > 0) {
			this.tauxCHange = tauxChange;
		} else {
			throw new Exception("le taux de change " + tauxChange + " est incorrect");
		}
	}

	public String getNom() {
		return this.nom;
	}

	public double getTauxChange() {
		return this.tauxCHange;
	}

}
