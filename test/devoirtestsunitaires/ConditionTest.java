/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirtestsunitaires;

import devoirtestsunitaires.Condition;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jbuffeteau
 */
public class ConditionTest {
    
    public ConditionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Valider method, of class Condition.
     */
    @Test
    public void testValider() {
        
        // Test 1 = le nombre de jours ne dépasse pas 30 jours
        
        boolean expResult = true;
        boolean result = Condition.Valider(5);
        assertEquals(expResult, result);
        // Test 2 = le nombre de jours dépasse 30 jours
         
        expResult = false;
        result = Condition.Valider(63);
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculerMontantMaxCategorie method, of class Condition.
     */
    @Test
    public void testCalculerMontantMaxCategorie() {
        
        // Test 1 = Pour la catégorie Livre

        int expResult = 30;
        int result = Condition.CalculerMontantMaxCategorie("Livre");
        assertEquals(expResult, result);
        
        // Test 2 = Pour la catégorie Jouet

         expResult = 50;
        result = Condition.CalculerMontantMaxCategorie("Jouet");
        assertEquals(expResult, result);
        
        // Test 3 = Pour la catégorie Informatique
        expResult = 1000;
        result = Condition.CalculerMontantMaxCategorie("Informatique");
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculerMontantRembourse method, of class Condition.
     */
    @Test
    public void testCalculerMontantRembourse() {
        
        // Test 1 = nbJours = 20 ; Catégorie = Livre ; Etat = Abimé ; Membre = true ; Prix = 50
        boolean nbJours = true;
        boolean resultat = Condition.Valider(20);
        assertEquals(nbJours, resultat);
        int prix = 50;
        int categorie = Condition.CalculerMontantMaxCategorie("Livre");
        assertEquals(prix, categorie);
        boolean membre = true;
        double reductionMembre = Condition.CalculerReductionMembre(true);
        assertEquals(membre, reductionMembre);
        double expResult = 0.3;
        double result = Condition.CalculerReductionEtat("Abimé");
        assertEquals(expResult, result);
        
        
        
        
        
        // Test 2 = nbJours = 15 ; Catégorie = Livre ; Etat = Très abimé ; Membre = false ; Prix = 24
         nbJours = true;
         resultat = Condition.Valider(15);
        assertEquals(nbJours, resultat);
         prix = 24;
         categorie = Condition.CalculerMontantMaxCategorie("Livre");
        assertEquals(prix, categorie);
         membre = true;
         reductionMembre = Condition.CalculerReductionMembre(false);
        assertEquals(membre, reductionMembre);
         expResult = 0.3;
         result = Condition.CalculerReductionEtat("Très Abimé");
        assertEquals(expResult, result);

        // Test 3 = nbJours = 15 ; Catégorie = Livre ; Etat = Neuf ; Membre = true ; Prix = 24
         nbJours = true;
         resultat = Condition.Valider(15);
        assertEquals(nbJours, resultat);
         prix = 24;
         categorie = Condition.CalculerMontantMaxCategorie("Livre");
        assertEquals(prix, categorie);
         membre = true;
         reductionMembre = Condition.CalculerReductionMembre(true);
        assertEquals(membre, reductionMembre);
         expResult = 0.3;
         result = Condition.CalculerReductionEtat("Neuf");
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculerReductionMembre method, of class Condition.
     */
    @Test
    public void testCalculerReductionMembre() {
        
        // Test 1 = Je ne suis pas membre

        boolean expResult = false;
        double result = Condition.CalculerReductionMembre(false);
        assertEquals(expResult, result);
        // Test 2 = Je suis membre
        expResult = true;
        result = Condition.CalculerReductionMembre(true);
        assertEquals(expResult, result);

    }

    /**
     * Test of CalculerReductionEtat method, of class Condition.
     */
    @Test
    public void testCalculerReductionEtat() {
        
        // Test 1 = Pour un état Abimé
        double expResult = 15;
        double result = Condition.CalculerReductionEtat("Abimé");
        assertEquals(expResult, result);
        
        // Test 2 = Pour un état Très abimé
         expResult = 33;
        result = Condition.CalculerReductionEtat("Très Abimé");
        assertEquals(expResult, result);
        
        // Test 3 = Pour un état Neuf
        expResult = 55;
        result = Condition.CalculerReductionEtat("Neuf");
        assertEquals(expResult, result);
    }

    private void asserEquals(boolean expResult, boolean result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void asserEquals(int expResult, int result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void asserEquals(boolean expResult, double result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void asserEquals(double expResult, double result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
