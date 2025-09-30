```java
package mx.edu.uttt.Arreglos;
import javax.swing.JOptionPane;
public class VectoresDoubles {
    public static void main(String[] args) {
        int tamanio=0;
        tamanio=obtenerTamanio();
        double arr[]= new double [tamanio];
        llenarArereglo(arr);
        imprimir (arr);
    }//fin del main

    public static int obtenerTamanio(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introcuce el tamaño del arreglo"));

    }//fin de obtener tamaño
    public static void  llenarArereglo(double [] vector){
        for (int i = 0; i < vector.length; i++) {
          vector[i]= Double.parseDouble(JOptionPane.showInputDialog("Introcucve el valor de la posicion [ "+ i + " ]"));
        }
    }
    public static void imprimir(double vector []){
        String salida= "";
        for(double valor: vector){
          salida+="| "+ valor + " |";
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}
```