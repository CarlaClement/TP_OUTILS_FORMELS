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
    private int _id; 
    
   

    /**
     *Constructeur par défaut
     */
        public Compte() {
        _montantCourant = 0.0;
        _mesDonnesBancaires = new DonneesBancaires();
        _id=0; 
    }

    /**
     *Constructeur 
     * @param montant
     * @param donnees
     * @param id
     */
    public Compte(double montant, DonneesBancaires donnees, int id) {
        _montantCourant = montant;
        _mesDonnesBancaires = donnees;
        _id=id; 
    }    

    /**
     *Permet de mofidifier les données bancaires liées à l'utilisateur 
     * @param _newBic
     * @param _newIban
     * @return  0 : Action valdiée, 
     *          1 : bic passé nul, 
     *          2 : bic non mis a jour en bdd, 
     *          3 : iban passé nul, 
     *          4 :  non mis à jour en bdd
     */
    public int modifierDonneesBancaires(String _newBic, String _newIban){
        if(_newBic==null){
            return  1;
        }else{
            _mesDonnesBancaires.setBic(_newBic);
        }
        if(!_mesDonnesBancaires.getBic().equals(_newBic)){
            return 2;
        }
        if(_newIban==null){
            return 3; 
        }else{
            _mesDonnesBancaires.setIban(_newIban);
        }
        if(!_mesDonnesBancaires.getBic().equals(_newBic)){
            return 4;
        }        
        return 0; 
    }
    
    // Getters & Setters

    /**
     * Retourne le montant présent actuellement sur le compte 
     * @return
     */
    public double getMontantCourant() {
        return _montantCourant;
    }
    
    /**
     * Permet de mettre à jour le montant présent sur le compte 
     * @param _newMontantCourant
     * @return  0 : Action validée ; 
     *          1 : Donnée non mise à jour en bdd
     */
    public int setMontantCourant(double _newMontantCourant) {
        this._montantCourant = _newMontantCourant;
        if(this.getMontantCourant()!=_newMontantCourant){
            return 1; 
        }
        return 0; 
    }

    /**
     * Retourne les données bancaires si l'utilisateur faisant la demande est le propriétaire du compte
     * Les données bancaires sont cryptées en base de données 
     * @return
     */
    public DonneesBancaires getMesDonnesBancaires() {
        return _mesDonnesBancaires;
    }

    /**
     * Permet de mettre à jour les données bancaires du compte
     * @param _newDonnesBancaires
     * @return  0 : Action validée; 
     *          1 : Bic vide ; 
     *          2 : Iban vide; 
     *          3 : Données non mises à jour en bdd
     */
    public int setMesDonnesBancaires(DonneesBancaires _newDonnesBancaires) {
        if(_newDonnesBancaires.getBic()== null){
            return 1; 
        } 
        if(_newDonnesBancaires.getIban()==null){
            return 2;
        }
        // On ne met à jour les données que si elles sont non vides
        else{
            this._mesDonnesBancaires = _newDonnesBancaires;
        }        
        if(this.getMesDonnesBancaires() != _newDonnesBancaires){
            return 3; 
        }
        return 0;
    }
    
}
