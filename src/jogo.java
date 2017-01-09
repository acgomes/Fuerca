import java.io.IOException;
import java.util.Scanner;

public class jogo {
	 
	static Palavraas d = new Palavraas();
	static String palavra = d.RandomizeWord();
	static Enforcado p = new Enforcado(palavra);


	public static void main(String[] args) throws IOException 
	{
		Scanner input = new Scanner(System.in);
		
	  do{
		  if(p.Verifica() == false ){
			  
			  //teste
			  switch (p.getestado())
				{
			  
			  case 0: 
				  System.out.println("\n\n");
					System.out.println("  ##########***##  ");
					System.out.println("  ####             ");
					System.out.println("  ####             ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               \n");
					break ;
				case 1: 
					
					System.out.println("\n\n");
					System.out.println("  ##########***##  ");
					System.out.println("  ####       *     ");
					System.out.println("  ####      ***    ");
					System.out.println("  ##       *o o*   ");
					System.out.println("  ##       * ^ *   ");
					System.out.println("  ##         *     ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               ");
					System.out.println("  ##               \n");
					System.out.println("\nTEM 5 TENTATIVAS!\n");
					
					break;
				case 2:
					System.out.println("\n\n");
					System.out.println("  ##########***##  ");
					System.out.println("  ####       *     ");
					System.out.println("  ####      ***    ");
					System.out.println("  ##       *o o*   ");
					System.out.println("  ##       * ^ *   ");
					System.out.println("  ##         *     ");
					System.out.println("  ##         |     ");
					System.out.println("  ##         |     ");
					System.out.println("  ##         |     ");
					System.out.println("  ##         |     ");
					System.out.println("  ##         |     ");
					System.out.println("  ##               ");
					System.out.println("  ##              \n");
					System.out.println("\nTEM 4 TENTATIVAS!\n");

					break;
				case 3:
					System.out.println("\n\n");
					System.out.println("  ##########***## ");
					System.out.println("  ####       *    ");
					System.out.println("  ####      ***    ");
					System.out.println("  ##       *o o*   ");
					System.out.println("  ##       * ^ *   ");
					System.out.println("  ##         *     ");
					System.out.println("  ##         |     ");
					System.out.println("  ##        /|     ");
					System.out.println("  ##       / |     ");
					System.out.println("  ##         |     ");
					System.out.println("  ##         |     ");
					System.out.println("  ##               ");
					System.out.println("  ##              \n");
					System.out.println("\nTEM 3 TENTATIVAS!\n");

					break;
				case 4:
					System.out.println("\n\n");
					System.out.println("  ##########***##   ");
					System.out.println("  ####       *      ");
					System.out.println("  ####      ***     ");
					System.out.println("  ##       *o o*    ");
					System.out.println("  ##       * ^ *    ");
					System.out.println("  ##         *      ");
					System.out.println("  ##         |      ");
					System.out.println("  ##        /|\\    ");
					System.out.println("  ##       / | \\   ");
					System.out.println("  ##         |      ");
					System.out.println("  ##         |      ");
					System.out.println("  ##                ");
					System.out.println("  ##              \n");
					System.out.println("\nTEM 2 TENTATIVAS!\n");

					break;
				case 5:
					System.out.println("\n\n");
					System.out.println("  ##########***##  ");
					System.out.println("  ####       *    ");
					System.out.println("  ####      ***   ");
					System.out.println("  ##       *o o*  ");
					System.out.println("  ##       * ^ *  ");
					System.out.println("  ##         *    ");
					System.out.println("  ##         |    ");
					System.out.println("  ##        /|\\  ");
					System.out.println("  ##       / | \\ ");
					System.out.println("  ##         |    ");
					System.out.println("  ##         |    ");
					System.out.println("  ##        /     ");
					System.out.println("  ##       /      \n");
					System.out.println("\nTEM 1 TENTATIVA!\n");

					break;
				case 6:
					System.out.println("\n\n");
					System.out.println("  ##########***##  ");
					System.out.println("  ####       *    ");
					System.out.println("  ####      ***   ");
					System.out.println("  ##       *X X*  ");
					System.out.println("  ##       * ^ *  ");
					System.out.println("  ##         *    ");
					System.out.println("  ##         |    ");
					System.out.println("  ##        /|\\  ");
					System.out.println("  ##       / | \\ ");
					System.out.println("  ##         |    ");
					System.out.println("  ##         |    ");
					System.out.println("  ##        / \\  ");
					System.out.println("  ##       /   \\  \n");
					System.out.println("\nPERDEU!!!\n");
					System.out.println("\nPALAVRA CERTA: "+palavra);

					System.exit(0);
					break;
				}
			  
			  //fim de teste
			  
			  
			  
			  
			  
	  System.out.println("Introduza uma letra: ");
	  p.receber(input.next().charAt(0));
	  
	  System.out.println(p.Tamanhodasletras());
		  }
		  else{
			  System.out.println("PARABÉNS! GANHOU!!!");
			  break;
			  
		  }
	  }while(p.getestado() < 7 || !p.Verifica());
		input.close();
	}
	
	public static void Cls (){
		int linha = 0;
		while (linha <= 50){
			linha ++ ;
			System.out.println("");
		}
		
	}	
	
}
