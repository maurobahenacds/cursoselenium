package EjemplosCiclos;

public class DoWhileEjemplo {

	public static void main(String[] args) {
		int b=10;
		do {
			//El código dentro del 'do' se imprime incluso si la condición es falsa
			System.out.println("El valor de b es: " + b);
			b++;
		} while (b<=20);

	}

}
