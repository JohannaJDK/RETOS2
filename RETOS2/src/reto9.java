//Multiplo de dos(ARREGLOS)
import java.util.Scanner;

public class reto9 {
    public static void main(String[] args) {
        
        int cantidadNum;

        Scanner leer=new Scanner(System.in);

        System.out.println("Digite La Cantidad De Numeros Que Desea Comprobar Si Son Multiplos Del Dos");
        cantidadNum=leer.nextInt();

        int[] numeros=new int [cantidadNum];

        for (int i=0; i<cantidadNum; i++ ) {


            System.out.println("Digita El Numero " +i);
            numeros[i]=leer.nextInt(); 


        }
        System.out.println("Los números que son múltiplos de 2:");
        for (int i = 0; i < cantidadNum; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
        }
    }
}
}