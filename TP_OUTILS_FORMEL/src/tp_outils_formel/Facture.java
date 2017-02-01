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
    
    /**
     *
     */
    public Facture(){
        _date=""; 
        _montant=0.0; 
        _idEmetteur=0; 
        _idRecepteur=0; 
        _id=0; 
                
    }
    
    /**
     *
     * @param date
     * @param montant
     * @param idEmetteur
     * @param idRecepteur
     */
    public Facture(String date, double montant, int idEmetteur, int idRecepteur ){
        _date = date; 
        _montant = montant; 
        _idEmetteur=idEmetteur; 
        _idRecepteur=idRecepteur; 
        _id++;
    }
    
    // Getters & Setters

    /**
     *
     * @return
     */
        public String getDate() {
        return _date;
    }

    /**
     *
     * @param _date
     */
    public void setDate(String _date) {
        this._date = _date;
    }

    /**
     *
     * @return
     */
    public double getMontant() {
        return _montant;
    }

    /**
     *
     * @param _montant
     */
    public void setMontant(double _montant) {
        this._montant = _montant;
    }

    /**
     *
     * @return
     */
    public int getEmetteur() {
        return _idEmetteur ;
    }

    /**
     *
     * @param idEmetteur
     */
    public void setEmetteur(int idEmetteur) {
        this._idEmetteur = idEmetteur;
    }

    /**
     *
     * @return
     */
    public int getRecepteur() {
        return _idRecepteur;
    }

    /**
     *
     * @param idRecepteur
     */
    public void setRecepteur(int idRecepteur) {
        this._idRecepteur = idRecepteur;
    }
    
    /**
     *
     * @return
     */
    public int getId() {
        return _id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this._id = id;
    }
}
