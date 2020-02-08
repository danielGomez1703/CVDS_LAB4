/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.Exceptions;

/**
 *
 * @author daniel.gomez-su
 */
public class HangmanException  extends Exception{
    
    public static final String COUNT_INCORRECTO = "EL PARAMETRO COUNT ES NEGATIVO";
    public static final String INCORRECTCOUNT_INCORRECTO = "EL PARAMETRO INCORRECTCOUNT ES NEGATIVO";
    public static final String PUNTAJE_MAXIMO ="EL PUNTAJE ESXCEDE LOS LIMITES";
    public static final String PUNTAJE_MINIMO ="EL PUNTAJE ESXCEDE LOS LIMITES";

    public HangmanException(String mensaje){
        super(mensaje);
    }
}

