package EjemplosArreglos;

public class ArreglosEjemplo {

	public static void main(String[] args) {
		//Ambas son declaraciones validas
		int intArray [];
		int [] intArray2;
		//declarar un array de string
		 
		String[] arr;	
		arr=new String[6];
		//inicializar el primer elemento del array
		arr[0]="cero";
		arr[1]="uno";
		arr[2]="dos";
		arr[3]="tres";
		arr[4]="cuatro";
		arr[5]="cinco";
		System.out.println(arr[4]);
		//obtener a todos los elementos del array
		for (int i = 0; i < arr.length; i++) {//arr.length calcula la longitud del arreglo
			System.out.println("Elemento en el indice " + i + " : " +arr[i]);
			
		}
		

	}

}
