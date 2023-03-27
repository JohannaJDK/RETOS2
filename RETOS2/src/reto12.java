import java.util.Scanner;

public class reto12 {

    public static void main(String[] args) {

        String[][] productos = new String[2][2];
        Scanner leer = new Scanner(System.in);

        for (int fila=0; fila<2; fila++) {
            for (int columna=0; columna < 2; columna++) {

                if (columna == 0) {
                    System.out.print("Ingrese el código del producto  [" + fila + "][" + columna + "]");
                } 
                else if (columna == 1) {
                    System.out.print("Ingrese el nombre del producto  [" + fila + "][" + columna + "]");
                } 
                else if(columna == 2){
                    System.out.print("Ingrese el precio del producto  [" + fila + "][" + columna + "]");
                }
                productos[fila][columna] = leer.nextLine();

            }

        }

        System.out.println("CATÁLOGO");

        String codigo, nombre, precio;

        for (int fila = 0; fila < 2; fila++){
        for ( int columna = 0; columna < 2; columna++) {
            codigo = productos[fila][0];
            nombre = productos[fila][1];
            precio = productos[fila][2];

            System.out.println(codigo + " - " + nombre + " - $" + precio);
        }
    }
        leer.close();

    }
}