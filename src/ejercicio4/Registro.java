package ejercicio4;

import ejercicio3.Temperatura;
import ejercicio3.Temperatura.Escala;

public class Registro 
{
	private final Integer cantidadDiasRegistroPorDefecto = 30;
	
	private String nombreCiudad;
	private Temperatura temperaturaDias[];
	private Integer diasRegistrados;
	private Integer cantidadDiasRegistro;
	
	public Registro(String nombreCiudad)
	{
		this.nombreCiudad = nombreCiudad;
		cantidadDiasRegistro = cantidadDiasRegistroPorDefecto;
		temperaturaDias = new Temperatura [cantidadDiasRegistro];
		diasRegistrados = 0;
	}
	
	public Registro(String nombreCiudad, Integer cantidadDiasRegistro)
	{
		this.nombreCiudad = nombreCiudad;
		this.cantidadDiasRegistro = cantidadDiasRegistro;
		temperaturaDias = new Temperatura [this.cantidadDiasRegistro];
		diasRegistrados = 0;
	}
	
	public String getCiudad()
	{
		return nombreCiudad;
	}
	
	public void imprimir(Temperatura.Escala unidad)
	{
		Temperatura temperaturaDiasAux[];
		temperaturaDiasAux = this.temperaturaDiasEnUnidadesUniformes(unidad);
		
		System.out.println("<Temperaturas registradas en " + nombreCiudad + ">");
		for (Integer i = 0; i < diasRegistrados; i++)
			System.out.println("[" + (i + 1) + "]: " + temperaturaDiasAux[i].toString());
	}
	
	public boolean agregarTemperatura(Temperatura T)
	{
		boolean registroExitoso;
		
		if (diasRegistrados < cantidadDiasRegistro)
		{
			temperaturaDias[diasRegistrados] = T;
			diasRegistrados++;
			registroExitoso = true;
		}
		else
			registroExitoso = false;
		
		return registroExitoso; 
	}
	
	private Temperatura[] temperaturaDiasEnUnidadesUniformes(Temperatura.Escala unidad) 
	{
		// Se busca no modificar el arreglo original
		
		Temperatura temperaturaDiasAux[];
		temperaturaDiasAux = new Temperatura [cantidadDiasRegistro];
		
		for (Integer i = 0; i < diasRegistrados; i++)
		{
			if (unidad == Temperatura.Escala.celsius)
				temperaturaDiasAux[i] = temperaturaDias[i].asCelsius();
			else
				temperaturaDiasAux[i] = temperaturaDias[i].asFahrenheit();
		}
		
		return temperaturaDiasAux;
	}
	
	public Temperatura temperaturaPromedio(Temperatura.Escala unidad)
	{
		Integer i;
		Double acumulador;
		Temperatura temperaturaDiasAux[];
		temperaturaDiasAux = this.temperaturaDiasEnUnidadesUniformes(unidad);
		
		for (acumulador = 0.0, i = 0; i < diasRegistrados; i++)
			acumulador += temperaturaDiasAux[i].getValor();
		
		return new Temperatura(acumulador / diasRegistrados, unidad);
	}
	
	public Temperatura temperaturaMaxima(Temperatura.Escala unidad)
	{
		return temperaturaMaximaAux(0, temperaturaDiasEnUnidadesUniformes(unidad));
	}
	
	private Temperatura temperaturaMaximaAux(Integer i, Temperatura[] temperaturaDias)
	{
		Temperatura temperaturaAux;
		
		if (i == diasRegistrados - 1)
			return temperaturaDias[diasRegistrados - 1];
		else
		{
			temperaturaAux = temperaturaMaximaAux(i + 1, temperaturaDias);
			if(temperaturaAux.getValor() > temperaturaDias[i].getValor())
				return temperaturaAux;
			else
				return temperaturaDias[i];
		}
	}
}
