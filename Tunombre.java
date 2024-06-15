import java.util.Scanner;
public class Tunombre{
    public static void main(String args[]){
	Scanner entrale = new Scanner(System.in);
	String nombre ="";
	String nombre_correcto="goofy";
	System.out.println("decime tu nombre");
	nombre = entrale.nextLine();
	if(nombre.equals(nombre_correcto)){
	    System.out.println("puedes entrar "+nombre_correcto );
	}
	else{
	    System.out.println("acceso denegado");
	}
    }
}
