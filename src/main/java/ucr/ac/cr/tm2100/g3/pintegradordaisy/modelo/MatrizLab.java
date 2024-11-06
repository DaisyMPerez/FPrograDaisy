/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.pintegradordaisy.modelo;

/**
 *
 * @author Daisy
 */
public class MatrizLab {
    
    private int [][] laberinto;
    private Personaje personaje;
    private Enemigo enemigo;
    
    public MatrizLab () {
        //Definir tamaño matriz
        laberinto = new int [][]{
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,0,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1},
        {0,0,1,0,1,1,0,1,0,1}
        };
        
        //Inicializar al personaje y al enemigo
        personaje = new Personaje(0, 0);
        enemigo = new Enemigo(4, 4);
    }
    
    public int [][] getlaberinto(){
        return laberinto;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

}
