/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_outils_formel;

import javafx.stage.Stage;

/**
 *
 * @author cleme
 */
public class TP_OUTILS_FORMEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        // Commercant
        
        /*monCommmercant.setNom("Dupond");
        monCommmercant.setPrenom("Paul");
        monCommmercant.setId(3);*/
       // ListeDeComptes lescomptesducommercant = new ListeDeComptes();
        Utilisateur monCommmercant = new Utilisateur(3,"Dupond","Paul", "25, Rue du Change, 37000 TOURS ",0); 
       // System.out.println(" Commercant : "+monCommmercant.getNom()+" "+ monCommmercant.getPrenom()+" , id : ");//+ monCommmercant.getMontantComptePrincipal()+ "\n");
        System.out.println(monCommmercant.recupererInfosUtilisateur());
        monCommmercant.setMontantComptePrincipal(24.56);
        //System.out.println(" Montant compte principal : " + monCommmercant.getMontantComptePrincipal());
       /*ListeDeComptes tempC = monCommmercant.getMesComptes();
       Compte t = tempC{0};
        System.out.println(" montant : "+ monCommmercant.);*/ 
        // Comptable
      /*  ListeDeComptes lescomptesducomptable = new ListeDeComptes();
        Utilisateur monComptable = new Utilisateur(5,"Martin","Pierre"," ", lescomptesducomptable, 1); 
        DonneesBancaires DonnesCompt = new DonneesBancaires("popo2", "caca23f"); 
        Compte comptePrincCompt = new Compte(32.25, DonnesCompt);
        lescomptesducomptable.setComptePrincipal(comptePrincCompt);
        System.out.println(" Comptable : "+monComptable.getNom()+" "+ monComptable.getPrenom()+" , id : "+monComptable.getId()+ "montant compte princ " +comptePrincCompt.getMontantCourant()+ "\n");
        
        
        monCommmercant.demanderPrelevementComptePricincipal(36.50, monComptable);
        System.out.println(" Nouveaux montant : Commercant : "+ comptePrinc.getMontantCourant() + "  , Comptable "+ comptePrincCompt.getMontantCourant()+"\n ");
        */
       /* 
        Ihm monIhm = new Ihm();
        Stage myStage = new Stage();
        monIhm.start(myStage);*/
    }
    
}
