/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.pintegradordaisy.modelo;

import java.util.Random;

/**
 *
 * @author rossm
 */
public class Enemigo {
    
    private int posX;
    private int posY;
    private Random random = new Random();

    public Enemigo(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
}
