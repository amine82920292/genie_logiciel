package myPackage;

import java.util.ArrayList;

public class Banquier {

	private  String _nom;
	private  String _prenom;
	private int id;
	private ArrayList<DossierBancaire> dossiersbancaire ;
	
	//getters et setters 
	///////
	public String get_nom() {
		return _nom;
	}
	//nom
	public void set_nom(String _nom) {
		this._nom = _nom;
	}
	//prenom
	public String get_prenom() {
		return _prenom;
	}
	public void set_prenom(String _prenom) {
		this._prenom = _prenom;
	}
	//ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<DossierBancaire> getDossiersbancaire() {
		return dossiersbancaire;
	}
	public void setDossiersbancaire(ArrayList<DossierBancaire> dossiersbancaire) {
		this.dossiersbancaire = dossiersbancaire;
	}
	
}
