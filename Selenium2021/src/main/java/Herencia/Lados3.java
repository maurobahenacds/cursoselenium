package Herencia;

public class Lados3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1= new Triangulo();
		t1.base=4.0;
		t1.altura=4.0;
		t1.estilo="Estilo 1";
		System.out.println("Información para t1: ");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su área es: " + t1.area());
			

	}

}
