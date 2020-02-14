/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

import hangman.Exceptions.HangmanException;

/**
 *
 * @author daniel.gomez-su
 */
public class OriginalScore implements GameScore{
    private int points =100;
    
    @Override 
      /**
     * Este metodo devuelve el valor del score de acuerdo a los puntos obtenidos
     * @pre los puntajes no deben ser negativos ya que el calculo dejaria de validarse correctamente.
     * @param count letras correctas
     * @param incorrectCount  letras incorrectas
     * @return retorna el total de los puntos 
     * @pos el valor de los puntos obtenidos en el juego .
     */
    public int calculateScore (int count , int incorrectCount) throws HangmanException {
        
         if ( count <0 ) 
            throw (new HangmanException(HangmanException.COUNT_INCORRECTO)); // count < 0 
        if ( incorrectCount <0 ) 
            throw (new HangmanException(HangmanException.COUNT_INCORRECTO)); // incorrectcount < 0
        
        if (points - (10*incorrectCount)<0 ){
            return 0;
        }
        return points - (10*incorrectCount);
    }
    
}
