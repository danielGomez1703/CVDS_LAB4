/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 * @author daniel.gomez-su
 */
public class OriginalScore extends GameScore{
    
    @Override 
      /**
     * Este metodo devuelve el valor del score de acuerdo a los puntos obtenidos
     * @pre los puntajes no deben ser negativos ya que el calculo dejaria de validarse correctamente.
     * @param count letras correctas
     * @param incorrectCount  letras incorrectas
     * @return retorna el total de los puntos 
     * @pos el valor de los puntos obtenidos en el juego .
     */
    public int calculateScore (int count , int incorrectCount){
        
        if (super.points - (10*incorrectCount)<0 ){
            return 0;
        }
        return super.points - (10*incorrectCount);
    }
    
}
