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
    public void validateOriginalScore (){
        try{
            OriginalScore sc =new OriginalScore();
            int resultado = sc.calculateScore(10, 3);
            
        }catch ( HangmanException e){
            
            
        }
    
       
    }
    
    
    
}
