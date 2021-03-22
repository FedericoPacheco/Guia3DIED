package ejercicio2;

public class App2 
{
	public static void main(String[] args)  // https://stackoverflow.com/questions/25858400/eclipse-java-error-this-selection-cannot-be-launched-and-there-are-no-recent-la/25858666
	{
		Punto p1, p2, p3;
		RectaR2 r1, r2, r3;
		
		p1 = new Punto(1.0, 1.0);
		p2 = new Punto(2.0, 2.0);
		p3 = new Punto(3.0, 3.0);
		
		r1 = new RectaR2(p1, p2);
		r2 = new RectaR2(p2, p3);
		r3 = new RectaR2(p1, p1);
		
		System.out.println("m_r1 = " + r1.pendiente());
		System.out.println("m_r2 = " + r2.pendiente());
		System.out.println("m_r3 = " + r3.pendiente());
		
		System.out.println("r1 = r2? = " + r1.equals(r2));
		System.out.println("r2 = r3? = " + r2.equals(r3));
	}
}
