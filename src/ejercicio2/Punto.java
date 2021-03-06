package ejercicio2;

public class Punto 
{
	private double x;
	private double y;
	
	public Punto()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public Punto(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX() 
	{
		return this.x;
	}

	public double getY() 
	{
		return this.y;
	}
	
	public void setX(double x) 
	{
		this.x = x;
	}

	public void setY(double y) 
	{
		this.y = y;
	}
	
	public boolean equals(Punto otroPunto)
	{
		return ((x == otroPunto.getX()) && (y == otroPunto.getY()));
	}
}
