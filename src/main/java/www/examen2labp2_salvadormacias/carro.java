/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.examen2labp2_salvadormacias;

import java.io.Serializable;

/**
 *
 * @author Apple
 */
public class carro implements Serializable {

    String modelo, marca;
    int velocidad;

    public carro() {
    }

    public carro(String modelo, String marca, int velocidad) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "carro{" + "modelo=" + modelo + ", marca=" + marca + ", velocidad=" + velocidad + '}';
    }

}
