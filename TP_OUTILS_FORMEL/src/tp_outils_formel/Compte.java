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
public class Compte {
    private double _montantCourant; 
    private DonneesBancaires  _mesDonnesBancaires; 
    // Getters & Setters
    public double getMontantCourant() {
        return _montantCourant;
    }

    public void setMontantCourant(double _montantCourant) {
        this._montantCourant = _montantCourant;
    }

    public DonneesBancaires getMesDonnesBancaires() {
        return _mesDonnesBancaires;
    }

    public void setMesDonnesBancaires(DonneesBancaires _mesDonnesBancaires) {
        this._mesDonnesBancaires = _mesDonnesBancaires;
    }
    
}
