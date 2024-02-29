package com.mycompany.calculadora;

public class Calculadora {

    public static void main(String[] args) {
      Operaciones op = new Operaciones ();
      op.leerNumeros();
      op.sumar();
      op.multiplicar();
      op.division();
      op.mostrarResultados();
    }          
 }