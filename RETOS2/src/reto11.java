import java.util.Scanner;

//Concentrese (Matrices)
public class reto11 {
public static void main(String[] args) {

Scanner leer=new Scanner(System.in);

  int n=3;
  
  System.out.println("Descubre las 10 palabras");

  String [][] Palabras = new String [4][3];

  for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        System.out.println("Dijite la palabra  "+i+"/"+j);
        Palabras[i][j]= leer.next();

    }

   
  }
  for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
        System.out.print("/n"+Palabras[i][j]);

    }
    System.out.println("");

  }
  










}

}