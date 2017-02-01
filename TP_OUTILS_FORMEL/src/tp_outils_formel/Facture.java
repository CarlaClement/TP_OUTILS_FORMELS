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
    private int _idEmetteur; 
    private int _idRecepteur; 
    private static int _id; 
    
    public Facture(){
        _date=""; 
        _montant=0.0; 
        _idEmetteur=0; 
        _idRecepteur=0; 
        _id=0; 
                
    }
    
    public Facture(String date, double montant, int idEmetteur, int idRecepteur ){
        _date = date; 
        _montant = montant; 
        _idEmetteur=idEmetteur; 
        _idRecepteur=idRecepteur; 
        _id++;
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

    public int getEmetteur() {
        return _idEmetteur ;
    }

    public void setEmetteur(int idEmetteur) {
        this._idEmetteur = idEmetteur;
    }

    public int getRecepteur() {
        return _idRecepteur;
    }

    public void setRecepteur(int idRecepteur) {
        this._idRecepteur = idRecepteur;
    }
    
    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }
}
