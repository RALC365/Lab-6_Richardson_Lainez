
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RALC
 */
public class Universo {
    String nombre;
    ArrayList<Seres_Vivos> seres_vivos;

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Seres_Vivos> getSeres_vivos() {
        return seres_vivos;
    }

    public void setSeres_vivos(ArrayList<Seres_Vivos> seres_vivos) {
        this.seres_vivos = seres_vivos;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", seres_vivos=" + seres_vivos + '}';
    }
    
    
    
}
