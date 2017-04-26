package modele;

public class SQLSalle {
	
	private static int num_salle;
	private static int num_bat;
	private static int etage ;
	private static String nom_salle;
	private static int places ;
	
	public static int getNum_salle() {
		return num_salle;
	}
	public static void setNum_salle(int num_salle) {
		SQLSalle.num_salle = num_salle;
	}
	public static int getNum_bat() {
		return num_bat;
	}
	public static void setNum_bat(int num_bat) {
		SQLSalle.num_bat = num_bat;
	}
	public static int getEtage() {
		return etage;
	}
	public static void setEtage(int etage) {
		SQLSalle.etage = etage;
	}
	public static String getNom_salle() {
		return nom_salle;
	}
	public static void setNom_salle(String nom_salle) {
		SQLSalle.nom_salle = nom_salle;
	}
	public static int getPlaces() {
		return places;
	}
	public static void setPlaces(int places) {
		SQLSalle.places = places;
	}
	
	

}
