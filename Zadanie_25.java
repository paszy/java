package zadanie_25;
import java.io.*;
import java.util.*;

public class Zadanie_25
{
	public static void main(String[] args)
	throws IOException
	{
		double losuj_liczbe, zgadnij_liczbe;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Program losuje liczbę z przedziału od 0 do 10. Zgadnij tę liczbę.");
		
		Random r = new Random();
		losuj_liczbe = Math.round(10*(r.nextDouble()));
		zgadnij_liczbe = Double.parseDouble(br.readLine());
		
		if (zgadnij_liczbe == losuj_liczbe)
			System.out.println("Gratulacje! Odgadnięto liczbę.");
			
		else
			System.out.println("Niestety nie udało się. Wylosowana liczba to: " + (int) losuj_liczbe + ".");
	}
}
