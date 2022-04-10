import java.util.*;

class Main {
  public static void main(String[] args) {
    /*Encotrar mayor y menor elemento del vector sin
    * los Algirtmo de Ordenación de Vectores(Sort,Quick,shell, etc,)
    * Author Nordevelop
    */
		 int [] a  = {8,1,5};
		    int menor=0;
		    int mayor=0;
        int medio=0;

		    for(int i = 0; i < 10; i++){    //encontrar el menor
		    	if (a[0] < a[1] && a[0] < a[2])
		    	   menor = a[0];
		    	else
		    		if (a[1] < a[0] && a[1] < a[2]) {
		        	menor = a[1];
		         }
		        else
		        	if (a[2] < a[0] && a[2] < a[1])
		        {
		        	menor = a[2];
		        }
		        
		 }
		    for (int j =0; j<10; j++) {
		    	if (a[0] > a[1] && a[0] > a[2])
			    	   mayor = a[0];
			    	else
			    		if (a[1] > a[0] && a[1] > a[2]) {
			        	mayor = a[1];
			         }
			        else
			        	if (a[2] > a[0] && a[2] > a[1])
			        {
			        	mayor = a[2];
			        }
		    	
		    }
		    	
		    	
		    	
		    	
		    	
		    System.out.println("El elemento menor es: " + menor);
		    System.out.println("el elemento mayor es: " + mayor);
		    System.out.println("cuyo vector completo es: " + Arrays.toString(a));
		   
	}
}
