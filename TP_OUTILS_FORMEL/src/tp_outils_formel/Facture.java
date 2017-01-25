/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_outils_formel;

/**
 *
 * @author Administrateur
 */
public class Facture {
    private String _date; 
    private double _montant; 
    private String _emetteur; 
    private String _recepteur; 
    
    public Facture(){
        _date=""; 
        _montant=0.0; 
        _emetteur=null; 
        _recepteur=null; 
                
    }
    
    public Facture(String date, double montant, String recepteur , String emetteur){
        _date = date; 
        _montant = montant; 
        _emetteur=emetteur; 
        _recepteur=recepteur;     
    }
    // Getters & Setters
    public String getDate() {
        return _date;
    }

    public void setDate(String _date) {
        this._date = _date;
    }

    public double getMontant() {
        return _montant;
    }

    public void setMontant(double _montant) {
        this._montant = _montant;
    }

    public String getEmetteur() {
        return _emetteur;
    }

    public void setEmetteur(String _emetteur) {
        this._emetteur = _emetteur;
    }

    public String getRecepteur() {
        return _recepteur;
    }

    public void setRecepteur(String _recepteur) {
        this._recepteur = _recepteur;
    }
}
