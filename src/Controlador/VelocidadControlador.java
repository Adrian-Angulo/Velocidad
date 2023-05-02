/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import  DAO.DAOovelocidad;
import java.text.DecimalFormat;


/**
 *
 * @author Adrian Castillo
 */
public class VelocidadControlador implements DAOovelocidad{
    
    
    @Override
    public double velocidad(double distancia, double tiempo) {
        double velocidad= distancia / tiempo;
        return velocidad;
    }

    @Override
    public double distancia(double velocidad, double tiempo) {
        return velocidad*tiempo;
    }

    @Override
    public double tiempo(double velocidad, double distancia) {
        return distancia/velocidad;
    }
    
    
}
