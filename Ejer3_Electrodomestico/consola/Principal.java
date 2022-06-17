package consola;
import java.util.Scanner;
import logica.*;

public class Principal {

	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
		String nombre;
		String marca;
		double consumo;
  

     Fecha e1=new Fecha();
		 
		 e1.setNombre("Heladera");
		 e1.setMarca("Samsung");
		 e1.setConsumo(26.7);
		 
		  Fecha e2=new Fecha();
		  
		 System.out.println("Ingrese el nombre : ");
		 nombre=teclado.nextLine();
		 System.out.println("Ingrese la marca: ");
		 marca=teclado.nextLine();
		 System.out.println("Ingrese el consumo : ");
		 consumo=teclado.nextDouble();
			
		 e2.setNombre(nombre);
		 e2.setMarca(marca);
		 e2.setConsumo(consumo);
		 
		 System.out.println("Nombre: " + e1.getNombre()); 
		 System.out.println("Electrodomestico 2: " +e2.toString());

  }
}