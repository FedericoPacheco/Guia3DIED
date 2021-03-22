package ejercicio2;

public class RectaR2 
{
	private Punto p0;
	private Punto p1;
	
	public RectaR2()
	{
		this.p0 = new Punto();
		this.p1 = new Punto(1.0, 1.0);
	}
	
	public RectaR2(Punto p0, Punto p1)
	{
		this.p0 = p0;
		this.p1 = p1;
	}
	
	public double pendiente()
	{
		// https://www.geeksforgeeks.org/nan-not-number-java/
		// Cubierto tecnicamente el caso en que p0 == p1 (se retorna "NaN")
		
		return ((p1.getY() - p0.getY()) / (p1.getX() - p0.getX()));   
	}
	
	public boolean esRectaValida()
	{
		return (!p0.equals(p1));
	}
	
	public boolean paralelas(RectaR2 otraRecta)
	{
		if (this.esRectaValida() && otraRecta.esRectaValida())
			return (this.pendiente() == otraRecta.pendiente());  // supuestamente NaN == NaN -> false, igual se hace el control
		else
			return false;
	}
	
	public boolean equals(RectaR2 otraRecta)
	{
		if (this.esRectaValida() && otraRecta.esRectaValida())
		{
			RectaR2 rectaAux;
			Punto puntoAux = otraRecta.getP0();
			
			if (this.p0.equals(puntoAux))
			{
				puntoAux = otraRecta.getP1();
				if (this.p1.equals(puntoAux))
					return true;
				else
					rectaAux = new RectaR2(this.p0, puntoAux);
			}
			else
				 rectaAux = new RectaR2(this.p0, puntoAux);
				
			return (this.paralelas(rectaAux));
		}
		else
			return false;
	}

	public Punto getP0() 
	{
		return this.p0;
	}

	public void setP0(Punto p0) 
	{
		this.p0 = p0;
	}

	public Punto getP1() 
	{
		return this.p1;
	}

	public void setP1(Punto p1) 
	{
		this.p1 = p1;
	}
}
