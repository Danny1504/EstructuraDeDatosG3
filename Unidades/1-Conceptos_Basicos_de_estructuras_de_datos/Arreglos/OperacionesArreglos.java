package mx.edu.uttt.Arreglos;

import javax.swing.*;

public class OperacionesArreglos {
    private double [] vector;
    private final int TAMANIO = 5;

    public OperacionesArreglos (){
        this.vector = new double [TAMANIO];

    }

    public OperacionesArreglos (int tamanio){
        this.vector = new double [tamanio];

    }

    public OperacionesArreglos (double [] vector){
        this.vector = new double[vector.length];
        this.llenarArreglo(vector);
    }

    public void llenarArreglo (double [] vector){
        int i = 0;
        while (i<this.vector.length){
            this.vector [i] = vector[i];
            i++;
        }

    }
    public void llenarArreglo (){
        int i=0;
        do{
          this.vector[i]=Double.parseDouble
                  (JOptionPane.showInputDialog("Introduce el valor decimal: "));
            i++;
        }while(i<this.vector.length);
    }
    public double sumarValores (){
        double suma = 0.0;
        for (int i=0; i<this.vector.length; i++) {
            suma+=this.vector[i];
        }
       // JOptionPane.showMessageDialog(null,"la suma de los valores es: " + suma);
        return suma;

    }
    public double obtenerValorMaximo (){
        double maximo = 0.0;
        int i=0;
        while(i<this.vector.length){
            if(maximo<this.vector[i])
                maximo = this.vector[i];
            i++;
        }
        return maximo;
    }

    public double obtenerValorMinimo (){
        double minimo = this.vector[0];
        for (double valor : this.vector){
            if (valor<minimo){
                minimo=valor;
            }
        }
        return minimo;
    }

    public boolean compararArreglos (double [] vector){
        boolean isEquals = true;

        if (vector.length != this.vector.length){
            isEquals = false;
        }else{
            for (int i = 0; i < this.vector.length && isEquals; i++) {
                if (this.vector[i] != vector[i]){
                    isEquals = false;
                }
            }

        }
        return isEquals;
    }

    public void cambiarTamanio (int tamanio){
        double [] cambiar = new double [tamanio];
        for (int i =0; i < this.vector.length; i++) {
            cambiar[i] = this.vector[i];
        }
        this.vector = cambiar;
        cambiar = null;
    }

    public String buscarValor (double valor) {
        String posicion = "";
        boolean sentinel = false;
        for (int i = 0; i < this.vector.length; i++) {
            if (vector[i] == valor) {
                sentinel = true;
                posicion += "el valor " + valor + "esta en la posicion  " + i;
                break;

            }
        }

        if (!sentinel) {
            posicion ="el valor no se encontro en el arreglo ";

        }
        return posicion;
    }

    public void imprimir (){
        String salida1 = "";
        for (double valor : vector){
            salida1 += "| " + valor + " |";
        }
        JOptionPane.showMessageDialog(null, salida1);

        String salida2 = "";
        for (int i = 0; i < vector.length ; i++) {
            salida2 += "| " + vector[i] + " |";
        }
        JOptionPane.showMessageDialog(null, salida2);

        String salida3 = "";
        int i = 0;
        while   (i<vector.length){
            salida3 += "| " + vector[i] + " |";
            i++;
        }

        JOptionPane.showMessageDialog(null,salida3);
    }

}
