package mx.edu.uttt.Arreglos;
import mx.edu.uttt.poo.*;
import javax.swing.*;
public class AlumnoVector {
    public static void main(String[] args) {
        int tamanio = 0;
        tamanio = obtenerTamanio();
        Alumno[] alumnos = new Alumno[tamanio];

    }

    public static int obtenerTamanio() {
        return Integer.parseInt(
                JOptionPane.showInputDialog("Introduce el numero de Alumnos a registrar: "));
    }

    public static String menu() {
        return "===== MENU PRINCIPAL =====\n" +
                "1) Llenar Arreglo\n" +
                "2) Imprimir Arreglo\n" +
                "3) Salir\n" +
                "Elegir Opcion";
    }

    public static void operaciones(Alumno[] alumnos) {

        String opcion = "";
        boolean sentinel = true;
        opcion = JOptionPane.showInputDialog(menu());
        do {
            switch (opcion) {
                case "1":
                    //llenar arreglo
                    break;
                case "2":
                    //imprimir arreglo

                    break;
                case "3":
                    //salir
                    JOptionPane.showMessageDialog(null,"Bye");
                    break;
                case "4":
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }//cierre de switch
        } while (sentinel);
    }//cierre del metodo estatico
    public static void llenarArreglo(Alumno []alumnos){
        int i =0;
        boolean activo= false;
        while(i<alumnos.length){
            Alumno a1= new Alumno();
            a1.setNombre(
                    JOptionPane.showInputDialog
                            ("Introduce el nombre del Alumno [ "+i+" ]"));
            a1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del Alumno [ "+i+" ]")));
            a1.setSexo(JOptionPane.showInputDialog("Introduce la edad del Alumno [ "+i+" ]").charAt(0));
            activo=JOptionPane.showInputDialog("Introduce el status del Alumno [ "+i+" ] Activo/Inactivo").equalsIgnoreCase("Activo")?true:false;
            a1.setActivo(activo);
            a1.setPromedio(Double.parseDouble(JOptionPane.showInputDialog("Introduce el promedio del Alumno [ "+i+" ]")));

            i++;
        }//fin del while
    }
}//fin de la clase
