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
public class PowerScore extends GameScore{
    
    private int points = 0;
    
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
        if (points + java.lang.Math.pow(5,count) - (8*incorrectCount)<0 ){
            return 0;
        }else if (points + java.lang.Math.pow(5,count) - (8*incorrectCount) > 500 ){
            return 500;
        }
        return points + (int) java.lang.Math.pow(5,count) - (8*incorrectCount);
    }
    
}
