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
    //private Utilisateur _owner;  --> En accédant aux données nacaires, on ne peut pas remonter au propriétaire du compte
    
    /**
     *
     * @param iban
     * @param bic
     */
    public DonneesBancaires(String iban, String bic){
    _iban=iban; 
    _bic=bic; 
   // _owner=owner; 
}

    /**
     *
     */
    public DonneesBancaires(){
    _iban=""; 
    _bic="";
}

//Getters & Setters

    /**
     *
     * @return
     */
        public String getIban() {
        return _iban;
    }

    /**
     *
     * @param _iban
     */
    public void setIban(String _iban) {
        this._iban = _iban;
    }

    /**
     *
     * @return
     */
    public String getBic() {
        return _bic;
    }

    /**
     *
     * @param _bic
     */
    public void setBic(String _bic) {
        this._bic = _bic;
    }
}
