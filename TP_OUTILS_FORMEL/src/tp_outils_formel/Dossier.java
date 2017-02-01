/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_outils_formel;

/**
 *
 * @author Administrateur
 * Le dossier contient l'ensemble des éléments entre un comptable et un commercant
 * Un dossier ne peut être créé que par un comptable mais il peut être alimenté par le commercant ou par le comptable (bilans comptables, factures, ...)
 */
public class Dossier {
    private int _idCommercant; 
    private int _idComptable; 
    private ListeDeFactures _listeDeFactures;
       
    //Constructeur

    /**
     *
     * @param _idCommercant
     */
        public Dossier(int _idCommercant) {
        _idCommercant=0; 
        _idComptable=0; 
        _listeDeFactures=null; 
        
    }
    
    
    //Getter & Setters

    /**
     *
     * @return
     */
        public int getIdCommercant() {
        return _idCommercant;
    }

    /**
     *
     * @param _idCommercant
     */
    public void setIdCommercant(int _idCommercant) {
        this._idCommercant = _idCommercant;
    }

    /**
     *
     * @return
     */
    public int getIdComptable() {
        return _idComptable;
    }

    /**
     *
     * @param _idComptable
     */
    public void setIdComptable(int _idComptable) {
        this._idComptable = _idComptable;
    }

    /**
     *
     * @return
     */
    public ListeDeFactures getListeDeFactures() {
        return _listeDeFactures;
    }

    /**
     *
     * @param _listeDeFactures
     */
    public void setListeDeFactures(ListeDeFactures _listeDeFactures) {
        this._listeDeFactures = _listeDeFactures;
    }
}
