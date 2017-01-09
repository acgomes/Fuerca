import java.util.Random;

public class Palavraas {
	
	String[] Palavras=
		{
				"Portugal","Angola","BMW","Mercedes",
				"Odacil","Ana","Diogo","Porto","Azul",

		};
	
	
	public String RandomizeWord()
	{
		Random aleatorio = new Random();

		return  Palavras[aleatorio.nextInt(Palavras.length)].toUpperCase();
	}

}
