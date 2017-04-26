package modele;

public class SQLUtilisateur {
	
	private static int num_user;
	private static String nom;
	private static String prenom ;
	private static String adresse;
	private static String email;
	private static int tel;
	private static String mdp;
	
	public static int getNum_user() {
		return num_user;
	}
	public static void setNum_user(int num_user) {
		SQLUtilisateur.num_user = num_user;
	}
	
	
	public static String getNom() {
		return nom;
	}
	public static void setNom(String nom) {
		SQLUtilisateur.nom = nom;
	}
	
	
	public static String getPrenom() {
		return prenom;
	}
	public static void setPrenom(String prenom) {
		SQLUtilisateur.prenom = prenom;
	}
	
	
	public static String getAdresse() {
		return adresse;
	}
	public static void setAdresse(String adresse) {
		SQLUtilisateur.adresse = adresse;
	}
	
	
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		SQLUtilisateur.email = email;
	}
	
	
	public static int getTel() {
		return tel;
	}
	public static void setTel(int tel) {
		SQLUtilisateur.tel = tel;
	}
	public static String getMdp() {
		return mdp;
	}
	public static void setMdp(String mdp) {
		SQLUtilisateur.mdp = mdp;
	}
	
	

}
