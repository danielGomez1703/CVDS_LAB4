/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.test;

/**
 *
 * @author daniel.gomez-su
 * 
 * Clases de equivlaencia
 *      Bonus score
 *        los valores de count e incorrectcount deben ser positivos 
 *          count > 0
 *          incorrectcount >0
 *        los parametros son enteros :
 *          count -> int
 *          incorrecot count  -> int
 *        no hay limite para la puntuacion maxima.
 * 
 *      power Score
 *          los valores de count e incorrectcount deben ser positivas
 *          count > 0
 *          incorrectcount >0
 *        los parametros son enteros :
 *          count -> int
 *          incorrecot count  -> int
 * 
 *       <----- 0 < puntaje < 500  ----------->
 *       Original Score
 *       los valores de count e incorrectcount deben ser positivas
 *          count > 0
 *          incorrectcount >0
 *        los parametros son enteros :
 *          count -> int
 *          incorrecot count  -> int
 *        puntaje > 0
 *          
 * 
 */

import hangman.Exceptions.HangmanException;
import hangman.model.*;

import org.junit.Assert;
import org.junit.Test;

public class HangmanTest {
    
        
    @Test
    public void validateOriginalScorecorrect (){
        try{
            OriginalScore sc =new OriginalScore();
            int resultado = sc.calculateScore(10, 3);
            Assert.assertEquals(70,resultado);
        }catch ( HangmanException e){
            
            
        }  
    }
    
    @Test
    public void validateOriginalScorecorrectSup (){
        try{
            OriginalScore sc =new OriginalScore();
            int resultado = sc.calculateScore(3, 0);
            Assert.assertEquals(100,resultado);
        }catch ( HangmanException e){        
        }  
    }
    
    @Test
    public void validateOriginalScorecorrectInf (){
        try{
            OriginalScore sc =new OriginalScore();
            int resultado = sc.calculateScore(10, 11);
            Assert.assertEquals(0,resultado);
        }catch ( HangmanException e){  
        } 
    }
    
    
    @Test
    public void validateOriginalScoreInParam (){
        try{
            OriginalScore sc =new OriginalScore();
            int resultado = sc.calculateScore(-1,3);  
        }catch ( HangmanException e){
            Assert.assertTrue(true);
        }  
    }
 /* -------------------------------------------------- BONUS SCORE ----------------------------------------------*/  
    @Test
    public void validateBonusScorecorrect (){
        try{
            BonusScore sc =new BonusScore();
            int resultado = sc.calculateScore(3,5);
            Assert.assertEquals(5,resultado);
        }catch ( HangmanException e){
            
            
        }  
    }
   
    @Test
    public void validateBonusScorecorrectInf (){
        try{
            BonusScore sc =new BonusScore();
            int resultado = sc.calculateScore(2, 6);
            Assert.assertEquals(0,resultado);
        }catch ( HangmanException e){  
        } 
    }
    
    
    @Test
    public void validateBonusScoreInParam (){
        try{
            BonusScore sc =new BonusScore();
            int resultado = sc.calculateScore(-11,-6);  
        }catch ( HangmanException e){
            Assert.assertTrue(true);
        }  
    }  
    
    /* --------------------------- POWER SCORE ----------------------*/
       @Test
    public void validatePowerScorecorrect (){
        try{
            PowerScore sc =new PowerScore();
            int resultado = sc.calculateScore(2, 3);
            Assert.assertEquals(1,resultado);
        }catch ( HangmanException e){
            
            
        }  
    }
    
    @Test
    public void validatePowerScorecorrectSup (){
        try{
            PowerScore sc =new PowerScore();
            int resultado = sc.calculateScore(4, 0);
            Assert.assertEquals(500,resultado);
        }catch ( HangmanException e){        
        }  
    }
    
    @Test
    public void validatePowerScorecorrectInf (){
        try{
            PowerScore sc =new PowerScore();
            int resultado = sc.calculateScore(1, 3);
            Assert.assertEquals(0,resultado);
        }catch ( HangmanException e){  
        } 
    }
    
    
    @Test
    public void validatePowerScoreInParam (){
        try{
            PowerScore sc =new PowerScore();
            int resultado = sc.calculateScore(8,-11);  
        }catch ( HangmanException e){
            Assert.assertTrue(true);
        }  
    }
    
}
