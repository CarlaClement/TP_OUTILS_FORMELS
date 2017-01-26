/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_outils_formel;

/**
 *
 * @author cleme
 */
public class TP_OUTILS_FORMEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Commercant
        Utilisateur monCommmercant = new Commercant(); 
        monCommmercant.setNom("Dupond");
        monCommmercant.setPrenom("Paul");
        monCommmercant.setId(3);
        ListeDeComptes lescomptesducommercant = monCommmercant.getMesComptes();
        String ibanComm = "caca"; 
        String bicComm = "pipi"; 
        DonneesBancaires DonnesComm = new DonneesBancaires(ibanComm, bicComm); 
        Compte comptePrinc = new Compte(1232.23, DonnesComm);
        lescomptesducommercant.setComptePrincipal(comptePrinc);
        //System.out.println(" Commercant : "+monCommmercant.getNom()+' '+ monCommmercant.getPrenom() +' , id : '+ monCommmercant.getId()+ "montant compte princ ");
        
        // Comptable
        Utilisateur monComptable = new Comptable(); 
        monComptable.setNom("Martin");
        monComptable.setPrenom("Pierre");
        monComptable.setId(5);
        ListeDeComptes lescomptesducomptable = monComptable.getMesComptes();
        String ibanCompt = "caca"; 
        String bicCompt = "pipi"; 
        DonneesBancaires DonnesCompt = new DonneesBancaires(ibanCompt, bicCompt); 
        Compte comptePrincCompt = new Compte(32.50, DonnesCompt);
        lescomptesducomptable.setComptePrincipal(comptePrincCompt);
        
        
        
        
    }
    
}
