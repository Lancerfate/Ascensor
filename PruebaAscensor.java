package Tp6While;

import java.util.Scanner;

public class PruebaAscensor 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in); //teclado
		Ascensor miAscensor = new Ascensor(15,0,0); //creo mi objeto ascensor con un maximo de 15 pisos y minimo de 0
		int opcion = 0; //inicializo una variable opcion que servira para elegir diferentes opciones para mi ascensor
		
		//creo un do-while que funcionara hasta que opcion valga 0
		
		do 
		{
			System.out.println("Presione 1 si desea subir un piso.");
			System.out.println("Presione 2 si desea bajar un piso.");
			System.out.println("Presione 3 si desea ir a un piso en concreto.");
			System.out.println("Presione 4 si desea mostrar un piso.");
			System.out.println("Presione 0 si desea terminar el programa.");
			
			opcion = teclado.nextInt(); //lo que ingrese por teclado se guardara en la variable opcion
			
			//creare un switch con las opciones correspondientes
			
			switch(opcion) 
			{
			case 1:
				miAscensor.subirUnPiso();
				break;
			case 2:
				miAscensor.bajarUnPiso();
				break;
			case 3:
				int opcion2 = 0; //en esta variable se guardara el piso al que se desee ir
				
				System.out.println("Ingrese el numero del piso que desee subir: "); //se eligira el piso donde se desee ir
				
				opcion2 = teclado.nextInt();
				
				miAscensor.irAlPiso(opcion2);
				break;
			case 4:
				System.out.println("El ascensor se encuentra en el piso: " + miAscensor.decirPiso() + ".\n");
				break;
			}
			
		}while(opcion != 0);

	}

}
