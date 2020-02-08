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
public class GameScore {
    
    protected int points = 100;
     /**
     * Este metodo devuelve el valor del score de acuerdo a los puntos obtenidos
     * @pre los puntajes deben ser enteros y positivos .
     * @param count letras correctas
     * @param incorrectCount  letras incorrectas
     * @return retorna el total de los puntos 
     * @pos el valor de los puntos obtenidos en el juego .
     */
    public int calculateScore (int count , int incorrectCount) throws HangmanException{
        return 100;
    }
}
