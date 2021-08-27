/*
 * Clase hija de la clase padre "Espada", hereda todos los atributos
 * y metodos de la clase padre.
 */
package Herencia;

/**
 *
 * @author pedro
 */

/**
 * Para poder crear una clase hija utilizamos la palabra
 * reservada "extends" seguido de la clase padre.
 */

public class UltraEspadon extends Espada {
    
    /**
     * Solo declaramos las variables adicionales de esta
     * nueva clase.
     */
    
    private String habilidad;
    
    public UltraEspadon(int durabilidad, int peso, String textura, String habilidad){
        
        /**
         * Con la palabra reservada "super" indicamos
         * que las variables ya estan inicializadas
         * y las traemos de la clase padre a la clase
         * hija.
         */
        
        super(durabilidad, peso, textura);
        this.habilidad = habilidad;
        
    }
    
    public void ataqueEspecial(){
        
        System.out.println("Utilizar la habilidad " + "'" + habilidad + "'" + " consume el doble de durabilidad");
        atacar();
        atacar();
        
    }
    
    public void mostrarEstatus(){
        
        System.out.println("UltraEspadon-->> Durabilidad: " + getDurabilidad() + " Peso: " + getPeso() 
                + "kg Habilidad: " + habilidad + " <<--");
        
    }
    
}
