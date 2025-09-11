``` java

package mx.edu.uttt.Arreglos;

public class DeclaringArrays {
    public static void main(String[] args) {
        /*sintaxis para declarar un arreglo
        *dataType [] arrayName;
        *
        * double [] dailyTemps;
        *
        * dataType[] arrayName[];
        *
        * double dailyTemps[];
        *
        * dataType [] arrayName1, arrayName2;
        */

        double[] ar1;
        String [] ar2, arr3;
        boolean [] arr4;
        char arr5 [];
        int []arr6;

//como hacer que se instancie
        ar1= new double[3];
        System.out.println(ar1[0]);

        ar1[1]=6.7;
        System.out.println(ar1[1]);
        String nombre[]=new String[4];

        System.out.println(nombre[0]);

        double arr7 []={25.3,15.6,7.9,12.5};
    }

}//fin de la clase principal
```