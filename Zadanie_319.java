package zadanie_319;

public class Zadanie_319
{
	public static void main(String[] args)
	{
		int n=10, wiersze, kolumny;
		
		System.out.println("Program wyświetla tabliczkę mnożenie dla liczb od 0 do 100");
		
		for (wiersze = 1; wiersze <= n; wiersze++)
		{
			for (kolumny = 1; kolumny <= n; kolumny++)
			{
				System.out.print(wiersze*kolumny + "\t");
			}
			
			System.out.println();
		}
	}
}
