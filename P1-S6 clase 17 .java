import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   String nombre, clave;
    Scanner entrada = new Scanner (System.in);
      System.out.print("Ingrese Nombre de usuario:");
    nombre = entrada.nextLine();
    System.out.print("Ingrese Clave de usuario:");
    clave = entrada.nextLine();
    if(nombre.equals("juan")&& clave.equals("123456")) {
      System.out.println("Bienvenido al Sistema");
     } 
    else {
      System.out.println("Nombre de Usuario o contraseña Incorrecto");
    
    
  }
}
  }