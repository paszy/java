package zadanie_14;
import java.io.*;


public class Zadanie_14
{
	public static void main(String[] args)
		throws IOException
	{
		double r, objetosc;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Porgram oblicza objętość kuli.");
		System.out.println("Podaj promień r.");
		r = Double.parseDouble(br.readLine());
		
		objetosc = 4*Math.PI*r*r*r/3;
		
		System.out.print("Objętość kuli o promieniu r = ");
		System.out.printf("%2.2f", r);
		System.out.print(" wynosi: ");
		System.out.printf("%2.2f.", objetosc);
		System.out.println();
	}
}
