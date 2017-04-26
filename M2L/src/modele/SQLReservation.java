package modele;

import java.sql.Date;

public class SQLReservation {
	
	private static int num_res;
	private static int num_user;
	private static int num_bat ;
	private static int etage ;
	private static int num_salle;
	private static Date date ;
	
	public static int getNum_res() {
		return num_res;
	}

	public static void setNum_res(int num_res) {
		SQLReservation.num_res = num_res;
	}
	

	public static int getNum_user() {
		return num_user;
	}

	public static void setNum_user(int num_user) {
		SQLReservation.num_user = num_user;
	}



	public static int getNum_bat() {
		return num_bat;
	}

	public static void setNum_bat(int num_bat) {
		SQLReservation.num_bat = num_bat;
	}



	public static int getEtage() {
		return etage;
	}

	public static void setEtage(int etage) {
		SQLReservation.etage = etage;
	}



	public static int getNum_salle() {
		return num_salle;
	}

	public static void setNum_salle(int num_salle) {
		SQLReservation.num_salle = num_salle;
	}



	public static Date getDate() {
		return date;
	}

	public static void setDate(Date date) {
		SQLReservation.date = date;
	}


}
