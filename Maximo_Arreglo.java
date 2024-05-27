

import java.util.Scanner;

public class Maximo_Arreglo {
	// Solicite al usuario un arreglo de 10 numeros y el programa calcule el numero mayor que hay
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, max = 0;
		for (int i = 1; i < 11; i++) {
			System.out.print("ingrese un numero:");
			num = in.nextInt();

			if (max != 0) {
				if (num > max) {
					max = num;
				}
			} else {
				max = num;
			}

		}
		System.out.println("numero maximo " + max);

	}






//metodo que dice si la resta de los numeros consecutivos del arreglos es la misma imprime true en otro caso false

	public static void buscar(int[] lista){
        int dato1=0;
        int dato2=1;
        int valor;
        int nuevo;
      Boolean palabra;
	    for (int i=0;i<lista.length;i++) {
	        valor=lista[dato1]-lista[dato2];
	        nuevo=valor;
	        dato1++;
	        dato2++;
	        if(valor==nuevo){
	       palabra=true;
	       
	            
	        }else{
	       boolean palabra=false;      }
	       
	  
            
    } 
	    	        System.out.print("palabra" + palabra);
	}
}