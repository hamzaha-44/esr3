/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auto1;

/**
 *
 * @author moham
 */

public class Auto1 {
    private String marca;
    private String modello;
    private String targa;
    private int anno;

    public Auto1(String marca, String modello, String targa, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.anno = anno;
    }

    public String toString() {
        return "Marca: " + marca + ", Modello: " + modello + ", Targa: " + targa + ", Anno: " + anno;
    }
}