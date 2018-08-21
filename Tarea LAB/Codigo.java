import java.util.*;
public class Codigo{
	public static void main(String args[]){
		Scanner vica = new Scanner(System.in);
		float num1=0, num2=0, reultado=0;
		int opc =0;
		boolean banderita = true;
		while(banderita){
			System.out.println("1	Suma");
			System.out.println("2	Resta");
			System.out.println("3	Multiplicacion");
			System.out.println("4	Division");
			System.out.println("5	Salir");
			System.out.println("Selecciona la opcion a ejecutat");
			opc = vica.nextInt();
			switch(opc){
				case 1:
					System.out.println("Ingresa el primer numero");
					num1 = vica.nextFloat();
					System.out.println("Ingresa el segundo numero");
					num2 = vica.nextFloat();
					resultado = num1 + num2;
					break;
				case 2:
					System.out.println("Ingresa el primer numero");
					num1 = vica.nextFloat();
					System.out.println("Ingresa el segundo numero");
					num2 = vica.nextFloat();
					resultado = num1 - num2;
					break;
				case 3:
					System.out.println("Ingresa el primer numero");
					num1 = vica.nextFloat();
					System.out.println("Ingresa el segundo numero");
					num2 = vica.nextFloat();
					resultado = num1 * num2;
					break;
				case 4:
					System.out.println("Ingresa el primer numero");
					num1 = vica.nextFloat();
					System.out.println("Ingresa el segundo numero");
					num2 = vica.nextFloat();
					resultado = num1 / num2;
					break;
				case 5:
					System.out,println();
					banderita = false;
					break;
			}
			System.out.println("El resultado "+ resultado);
		}
	}
}