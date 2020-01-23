package convertisseur;

public class ConvertisseurBasique {

	double TAUX_CONVERSION;

	public double convertirEnEuros(double nombreEnFrancs) {
		nombreEnFrancs = (nombreEnFrancs / 6.55957);
		return nombreEnFrancs;
	}

	public double convertirEnFrancs(double nombreEnEuros) {
		nombreEnEuros = (nombreEnEuros * 6.55957);
		return nombreEnEuros;
	}
}
