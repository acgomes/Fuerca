import java.util.Random;

public class palavras {
	
	String[] palavras=
		{
				"Portugal","Angola","BMW","Mercedes",
				"Odacil","Ana","Diogo","Porto","Azul",
				"Jogador", "Benfica", "Sporting",

		};
	
	
	public String randomizeWord() // Fazer com que as palavras sejam aleatórias
	{
		Random aleatorio = new Random();

		return  palavras[aleatorio.nextInt(palavras.length)].toUpperCase();
	}

}
