import java.util.Random;

public class palavras {
	
	String[] palavras=
		{
				"Portugal","Angola","BMW","Mercedes",
				"Odacil","Ana","Diogo","Porto","Azul",

		};
	
	
	public String randomizeWord()
	{
		Random aleatorio = new Random();

		return  palavras[aleatorio.nextInt(palavras.length)].toUpperCase();
	}

}
