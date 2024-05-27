
public class mayorArreglo {

	public static void main(String[] args) {
		//Dado un arreglo de el numero mayor de este
		// TODO Auto-generated method stub
		
		int camilo[] ={111,23,12,2,52,6,7};
			int mayor=camilo[0];
	for (int i=0; i<camilo.length;i++){
		if(mayor<camilo[i]){
		mayor =camilo[i] ;
		}
	}
	System.out.println("el mayor es:" + mayor);
	}



	public static void buscar(int[] lista, int dato){
	int cantidad=0;

	    for (int i=0;i<lista.length;i++) {
	        if (dato==lista[i]){
	            cantidad++;
   
   
            }else(dato|=lista[i]){
                System.out.println("el número "+ dato  + "FALSE");
            }
            
        } System.out.println("el número "+ dato +" está repetido " + cantidad + "TRUE");

	    
	}  








}
