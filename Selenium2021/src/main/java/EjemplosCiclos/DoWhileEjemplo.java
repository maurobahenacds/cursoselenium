package EjemplosCiclos;

public class DoWhileEjemplo {

	public static void main(String[] args) {
		int b=10;
		do {
			//El c�digo dentro del 'do' se imprime incluso si la condici�n es falsa
			System.out.println("El valor de b es: " + b);
			b++;
		} while (b<=20);

	}

}
