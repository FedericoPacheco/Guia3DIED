package ejercicio3;

public class App3 
{
	public static void main (String[] args)
	{
		Temperatura dia1 = new Temperatura(30.0, Temperatura.Escala.celsius); 
		Temperatura dia2 = new Temperatura(55.0, Temperatura.Escala.fahrenheit); 
		
		System.out.println("T1: " + dia1.asCelsius().toString()); 
		System.out.println("T1: " + dia1.asFahrenheit().toString()); 
		System.out.println("T2: " + dia2.asCelsius().toString()); 
		System.out.println("T2: " + dia2.asFahrenheit().toString()); 
		
		dia2.aumentar(dia1);
		
		System.out.println("T1 + T2: " + dia2.asCelsius().toString()); 
		System.out.println("T1 + T2: " + dia2.asFahrenheit().toString()); 
		
		dia1.disminuir(new Temperatura(10.0, Temperatura.Escala.celsius)); 
		
		System.out.println("T1: " + dia1.asCelsius()); 
		System.out.println("T1: " + dia1.asFahrenheit());
	}
}
