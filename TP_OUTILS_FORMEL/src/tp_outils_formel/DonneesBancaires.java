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
public class DonneesBancaires {
    private String _iban;    
    private String _bic; 
    //private Utilisateur _owner;
    
public DonneesBancaires(String iban, String bic){
    _iban=iban; 
    _bic=bic; 
   // _owner=owner; 
}

//Getters & Setters
    public String getIban() {
        return _iban;
    }

    public void setIban(String _iban) {
        this._iban = _iban;
    }

    public String getBic() {
        return _bic;
    }

    public void setBic(String _bic) {
        this._bic = _bic;
    }
/*
    public Utilisateur getOwner() {
        return _owner;
    }

    public void setOwner(Utilisateur _owner) {
        this._owner = _owner;
    }
  */
}
