import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner datos= new Scanner(System.in);
    int valor;
    do{
      System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
      valor=datos.nextInt();
    if(valor>=100){
      System.out.print("Es de 3 digitos.");
    }else{
      if (valor>=10){
      System.out.print("Es de 2 digitos.");
    }else{ 
         System.out.print("Es de 1 digito.");
    } 
     }
      }while (valor!=0);
    
  }
}