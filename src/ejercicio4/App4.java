package ejercicio4;

import ejercicio3.Temperatura;
import java.util.Random;

public class App4 
{
	public static void main(String[] args)
	{
		Registro r1 = new Registro("Denver", 10); 
		Registro r2 = new Registro("Nairobi", 10); 
		Random generadorAleatorio = new Random();
		
		for (Integer i = 0; i < 10; i++) 
		{
			r1.agregarTemperatura(new Temperatura(generadorAleatorio.nextDouble() * 50, Temperatura.Escala.celsius)); 
			r2.agregarTemperatura(new Temperatura(generadorAleatorio.nextDouble() * 105, Temperatura.Escala.fahrenheit)); 
		}
			
		r1.imprimir(Temperatura.Escala.celsius);
		System.out.println("temperaturaPromedio = " + r1.temperaturaPromedio(Temperatura.Escala.celsius).toString()); 
		System.out.println("temperaturaMaxima = " + r1.temperaturaMaxima(Temperatura.Escala.celsius).toString()); 
		
		System.out.println("");
		
		r2.imprimir(Temperatura.Escala.fahrenheit);
		System.out.println("temperaturaPromedio = " + r2.temperaturaPromedio(Temperatura.Escala.fahrenheit).toString()); 
		System.out.println("temperaturaMaxima = " + r2.temperaturaMaxima(Temperatura.Escala.fahrenheit).toString()); 
	}
}
