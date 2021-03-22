package ejercicio3;

public class Temperatura 
{
	//public final Double factorDeIncrementoCF = 9.0 / 5.0;   // C = 9/5F
	//public final Double factorDeIncrementoFC = 5.0 / 9.0;	// F = 5/9C
	
	public enum Escala
	{
		fahrenheit,
		celsius
	}
	
	private Escala unidad;
	private Double valor;
	
	public Temperatura()
	{
		unidad = Escala.celsius;
		valor = 0.0;
	}
	
	public Temperatura(Double valor, Escala unidad)
	{
		this.valor = valor;
		this.unidad = unidad;
	}
	
	public String toString()
	{
		String strAux = valor.toString();
		
		switch (unidad)
		{
			case fahrenheit:
				strAux += " °F";
				break;
			case celsius:
				strAux += " °C";
				break;
		}
		
		return strAux;
	}
	
	public Temperatura asCelsius()
	{
		if (unidad == Escala.celsius)
			return this;
		else
			return new Temperatura((5.0 / 9.0) * (this.getValor() - 32.0), Escala.celsius);
	}

	public Temperatura asFahrenheit()
	{
		if (unidad == Escala.fahrenheit)
			return this;
		else
			return new Temperatura((9.0 / 5.0) * this.getValor() + 32.0, Escala.fahrenheit);
	}
	
	public void aumentar(Temperatura T)
	{
		Escala unidadAux;
		Double valorAux;
		
		if (this.unidad == Escala.celsius)
		{
			if(T.getUnidad() == Escala.celsius)
				valorAux = this.valor + T.getValor();
			else 
				valorAux = this.valor + T.asCelsius().getValor();
			
			unidadAux = Escala.celsius;
		}		
		else
		{
			if(T.getUnidad() == Escala.celsius)
				valorAux = this.valor + T.asFahrenheit().getValor();
			else
				valorAux = this.valor + T.getValor();
			
			unidadAux = Escala.fahrenheit;
		}
				
		this.valor = valorAux;
		this.unidad = unidadAux;
		
		
		/*
		
		Double doubleAux;
		
		if (this.unidad == Escala.celsius)
			if(T.getUnidad() == Escala.celsius)
				doubleAux = 1.0;
			else
				doubleAux = factorDeIncrementoFC;
		else
			if(T.getUnidad() == Escala.celsius)
				doubleAux = factorDeIncrementoCF;
			else
				doubleAux = 1.0;
		
		return new Temperatura(this.valor + doubleAux * T.getValor(), this.unidad);
		*/
	}
	
	public void disminuir(Temperatura T)
	{
		Temperatura temperaturaAux = new Temperatura((-1) * T.getValor(), T.getUnidad()); 
		this.aumentar(temperaturaAux);
	}
	
	public Escala getUnidad() {
		return unidad;
	}

	public void setUnidad(Escala unidad) {
		this.unidad = unidad;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
