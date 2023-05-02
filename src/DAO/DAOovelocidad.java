/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author Adrian Castillo
 */
public interface DAOovelocidad {
    
    public double velocidad(double distancia, double tiempo);
    public double distancia(double velocidad, double tiempo);
    public double tiempo(double velocidad, double distancia);
}
