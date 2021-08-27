/*
 * Aqui realizaremos nuestras distintas pruebas.
 */
package Herencia;

/**
 *
 * @author pedro
 */

public class Principal {
    public static void main(String [] args){
        
        UltraEspadon nuevo = new UltraEspadon(100, 45, "Dorado_Musgo.png", "Barrido a dos manos");
    
        nuevo.ataqueEspecial();
        
        nuevo.mostrarEstatus();
    
        
    }
    
}
