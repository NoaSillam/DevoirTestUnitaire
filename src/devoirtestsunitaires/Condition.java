/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirtestsunitaires;

/**
 *
 * @author jbuffeteau
 */
public class Condition
{
    static final int nbJours = 30;
    private static int txtPrix;
    private static boolean cboCategories;
    private static boolean cboEtats;
    private static boolean rembourser;
    //methode 1
     // Permet de savoir si on a le droit d'être remboursé
    // On l'est à condition que le nombre de jours ne dépasse pas 30 !
    // Voir la constante déclarée ci-dessus
    public static boolean Valider(int unNbDeJours)
    {
        if(nbJours<=30)
        {
            return true;
        }
        else
        {
            return false;
        }
       
        
        
    }
    //methode 2
    // Permet de renvoyer le montant MAX remboursé en fonction de la catégorie
    // 30 pour Livre : si j'achète un livre à 14 euros ==> prix est de 14 ; si j'achète un livre à 54 euros ==> le prix est de 30
    // 50 pour Jouet
    // 1000 pour Informatique
    public static int CalculerMontantMaxCategorie(String uneCategorie)
    {
        
       
        int max = 0;
        
        String livre;
        String jouet;
        String informatique;
        
        if (uneCategorie=="Livre")
        {
            max = 30;
        }
        else if(uneCategorie=="Jouet")
        {
            max = 50;
            
        } 
        else if(uneCategorie=="Informatique")
         {
          max = 1000;
          }
        return max;
           
        }
       
   
    //methode 3
    // Permet de retourner le total remboursé en fonction de tous les critères
    public static boolean CalculerMontantRembourse(int unNbDeJours, String uneCategorie,
            boolean estMembre, String unEtat,
            int unPrix)
    {
        if(nbJours<=30)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
        
       
        
        
         int max = 0;
        
        
        
         if (uneCategorie=="Livre")
        {
            max = 30;
        }
        else if(uneCategorie=="Jouet")
        {
            max = 50;
            
        } 
        else if(uneCategorie=="Informatique")
         {
          max = 1000;
          }
           
        
        
        
         
           if(estMembre)
           {
            double  rembourser = txtPrix;
           }
           else
           {
               double rembourser = 0;
              if(unEtat == "Abimé" && unEtat == "Très Abimé")
               {
                   if(cboCategories)
                     {
                           double calculeRembourser = txtPrix * 0.3;
                          rembourser = txtPrix - calculeRembourser;
                           
                 
                   }
               }
               if(unEtat == "Neuf" && unEtat == "Occasion")
               {
                   if(cboCategories)
                     {
                           double calculeRembourser = txtPrix * 0.1;
                          rembourser = txtPrix - calculeRembourser;
                           
                   
                   }
               }
           }
            
            return rembourser;
        

    }
    //methode 4
    // Permet de renvoyer la réduction si on est membre ou pas
    // Membre  = 0.0
    // Pas membre = 0.2
    public static double CalculerReductionMembre(boolean estMembre)
    {
        double reduction;
        if(estMembre)
        {
           reduction = txtPrix;
        }
        else
        {
           reduction = txtPrix*0.2;
        }
        
        
        
        return reduction;
    }
    //methode 5
    // Permet de renvoyer la réduction en fonction de l'état de l'achat
    // Abimé ou Très abimé = 0.3
    // Pour tous les autres états = 0.1
    public static double CalculerReductionEtat(String unEtat)
    {
        double rembourser = 0;
        if(unEtat == "Abimé" && unEtat == "Très Abimé")
               {
                   if(cboCategories)
                     {
                           double calculeRembourser = txtPrix * 0.3;
                          rembourser = txtPrix - calculeRembourser;
                           
                 
                   }
               }
               if(unEtat == "Neuf" && unEtat == "Occasion")
               {
                   if(cboCategories)
                     {
                           double calculeRembourser = txtPrix * 0.1;
                          rembourser = txtPrix - calculeRembourser;
                           
                   
                   }
               }
        return rembourser;
    }
}
