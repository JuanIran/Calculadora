package com.mycompany.calculadora;

import javax.swing.JOptionPane;
public class Operaciones {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //metodos
    
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("coloca el num 1"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("coloca el num 2"));
    }
    public void sumar(){
    suma=numero1+numero2;
    }
    public void restar(){
        resta=numero1-numero2;
    }
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    public void division(){
        division=numero1/numero2;
    }
    public void mostrarResultados(){
        System.out.print("La suma es: " + suma);
        System.out.print("La resta es: " + resta);
        System.out.print("La multiplicacion es: " + multiplicacion);
        System.out.print("La division es: " + division);
    }
}