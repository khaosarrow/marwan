/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenacar;

/**
 *
 * @author Equipo4
 */
public class Cadenacar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    String cadena="En esta cadena hay solo texto y ningun numero";
    char car='a';
    int contador=0;
    for(int i=0;i<cadena.length();i++)
    {
        if(cadena.charAt(i)==car)
        {
            contador++;
        }
    }
    System.out.println("En esta cadena hay "+contador+" caracteres "+car);
}
    
}
