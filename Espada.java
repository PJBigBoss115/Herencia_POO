/*
 * Clase padre de la cual podran partir las distintas
 * clases hijas.
 */
package Herencia;

/**
 *
 * @author pedro
 */

public class Espada {
    
    private int durabilidad;
    private int peso;
    private String textura;

    public Espada(int durabilidad, int peso, String textura) {
        
        this.durabilidad = durabilidad;
        this.peso = peso;
        this.textura = textura;
        
    }

    public int getDurabilidad() {
        
        return durabilidad;
        
    }

    public int getPeso() {
        
        return peso;
        
    }

    public String getTextura() {
        
        return textura;
        
    }
    
    public void atacar(){
    
        this.durabilidad = durabilidad - 1;
        System.out.println("Cada vez que atacas la durabilidad se acaba");
        
    }
    
}
