package trabajos;
import java.util.*;
public class UD1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]agenda=new String[3];
		String[]palabras=new String[3];
		String nombrecompleto=" ";
		int opcion=0;
		boolean pav=false;
		while(opcion != 4) {
			System.out.println("1-Introduce un nombre\r\n"
					+ "2-Agregar nombre en la agenda\r\n"
					+ "3-Listar nombres de la agenda\r\n"
					+ "4-Salir del programa");
			opcion = s.nextInt();
			if(opcion!=1){
				System.out.println("Todavía no se ha tecleado ningún nombre.");
				continue;
			}
			s.nextLine();
			switch(opcion) {
			case 1:
				pav=true;
				System.out.println("Introduzca nombre y 2 apellidos por favor:");
				nombrecompleto=s.nextLine();
				String[] partes=nombrecompleto.split(" ");
				System.out.println("Nombre: "+partes[0]);
				System.out.println("Primer apellido: "+partes[1]);
				System.out.println("Segundo apellido: "+partes[2]);
				break;
			case 2:
				pav=true;
				if(pav==true)
				System.out.println(" agregado a la agenda en la posición 1");
				break;
			case 3:
				System.out.println();
				break;
			case 4:
				System.out.println();
				break;
			default:
				System.out.println("Todavía no se ha tecleado ningún nombre.");
				break;
			}
		}
	}

}
