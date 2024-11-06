/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.pintegradordaisy.modelo;

/**
 *
 * @author rossm
 */
public class Personaje {
    
    private int posX;
    private int posY;

    public Personaje(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    public void mover(String direccion, int [][]laberinto){
        int nuevaPX = posX;
        int nuevaPY = posY;
        
        switch (direccion) {
            case "ARRIBA":
                nuevaPY--;
            break;
            
            case "ABAJO":
                nuevaPY++;
            break;
            
            case "IZQUIERDA":
                nuevaPX--;
            break;
            
            case "DERECHA":
                nuevaPX++;
            break;
        
        }
        
        if (nuevaPY>=0 && nuevaPY < laberinto.length && nuevaPX >= 0 && nuevaPX < laberinto[0].length) {
            
            int valorCelda = laberinto [nuevaPY][nuevaPX]; //invertido
            
            switch (valorCelda) {
                case 0: 
                    System.out.println("Direcion: "+ direccion);
                    System.out.println("Posicion actual en x: "+  posX + "en y: "+ posY);
                    posX = nuevaPX;
                    posY = nuevaPY;
                    break;
                    
                case 2: // agua
                    System.out.println("Cayo al agua");
                    posX = nuevaPX;
                    posY = nuevaPY;
                    break;
                    
                case 3: // fuego
                    System.out.println("Me quemo!");
                    posX = nuevaPX;
                    posY = nuevaPY;
                    break;
                    
                case 4: // Meta
                    System.out.println("Meta!!");
                    posX = nuevaPX;
                    posY = nuevaPY;
                    break;
                    
                default:
                    break;
                    
            
            }
        } else {
            System.out.println("Movimiento fuera de los limites");
        
        }
    
            
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
