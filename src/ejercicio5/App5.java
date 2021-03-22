package ejercicio5;

public class App5 
{
	public static void main(String[] args) 
	{
		int a = 6;
		int b = 0;
		int c = 7;
		int d = 6;
		float e = 8;
		
		// A partir de acá, se corrigen todos los problemas ocasionados en la consola del IDE
		//int f = "Hola Mundo";
		//String g = "Hola Mundo";
		int g = 32;
		String i = "77";
		
		System.out.println("El cálculo de la división entre a y b sin respetar el orden es: " + b/a);//a/b );
		System.out.println("El cálculo de la división entre c y b sin respetar el orden es: " + b/c);//c/b );
		
		// Elegir cuáles de las variables definida recientemente para que funcione la sentencia if
		if (! ( a == g ) ) {
			System.out.println("a y g no son iguales");
		}
		
		// Resolver, comparandolos entre esas variables de alguna manera.
		// Investigar Integer.parseInt
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html
		if (! ( Integer.parseInt(i) == a ) ) {
			System.out.println("a y i no son iguales");
		}
		
		
		
		//Esto es un comentario, poneme como un comentario porque no está funcionando!!
	}

}
