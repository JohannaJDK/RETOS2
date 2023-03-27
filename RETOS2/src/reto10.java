import java.util.Scanner;
//ARREGLO
public class reto10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        

        System.out.println("Digite el numero de competidores que participaran");
        int competidores = leer.nextInt();


        String[] nombre = new String[competidores];
 
        int[] tiempo = new int[competidores];

        for (int i=0;i<competidores;i++){

            System.out.println("Digite nombre del competidor " +(i+1)+":");
            nombre[i] = leer.next(); 



            System.out.print("Digite el tiempo del competidor " + (i+1)+ ":" );
            tiempo[i] = leer.nextInt();



        }System.out.println("Los resultados son : " );

        double menor_temp=0;
        int ganador=0;

        for(int i=0;i<competidores;i++){

            System.out.println(nombre[i]+" y su tiempo es " +tiempo[i]);
            if(tiempo[i]<menor_temp){
                menor_temp = tiempo[i];

                ganador = i;
            }
        }System.out.println("el ganador es " +nombre[ganador]+" con un tiempo de "+tiempo[ganador]);

        leer.close();



    }
}
