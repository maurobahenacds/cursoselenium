package clasesObjetos;

public class constructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Miclase t1=new Miclase(5);
		Miclase t2=new Miclase(8);
		
		System.out.println(t1.x);
		System.out.println(t2.x);
		
		
		//sobrecarga de metodos
		int resultado=suma(2,3,4);
		System.out.println(resultado);

	}
		public static int suma(int a, int b) {
			int c=a+b;
			return c;
		}
		
		public static int suma(int a, int b, int d) {
			int c=a+b+d;
			return c;
		}
		

 

}
