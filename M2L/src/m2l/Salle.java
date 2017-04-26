package m2l;

public class Salle {
	
	private String Num_Salle;
	private int Num_Bat;
	private String Nom_Salle;
	private int Places;
	
	public Salle(){
		
	}

	public Salle(String num_Salle, int num_Bat, String nom_Salle, int places) {
		super();
		Num_Salle = num_Salle;
		Num_Bat = num_Bat;
		Nom_Salle = nom_Salle;
		Places = places;
	}

	public String getNum_Salle() {
		return Num_Salle;
	}

	public void setNum_Salle(String num_Salle) {
		Num_Salle = num_Salle;
	}

	public int getNum_Bat() {
		return Num_Bat;
	}

	public void setNum_Bat(int num_Bat) {
		Num_Bat = num_Bat;
	}

	public String getNom_Salle() {
		return Nom_Salle;
	}

	public void setNom_Salle(String nom_Salle) {
		Nom_Salle = nom_Salle;
	}

	public int getPlaces() {
		return Places;
	}

	public void setPlaces(int places) {
		Places = places;
	}

	@Override
	public String toString() {
		return "Salle [Num_Salle=" + Num_Salle + ", Num_Bat=" + Num_Bat + ", Nom_Salle=" + Nom_Salle + ", Places="
				+ Places + "]";
	}
	
}
