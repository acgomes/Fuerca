import java.io.IOException;
import java.util.Scanner;

public class jogo {
	 
	static palavras d = new palavras();
	static enforcado p = new enforcado(d.randomizeWord());


	public static void main(String[] args) throws IOException 
	{
		Scanner input = new Scanner(System.in);
		
	  do{
		  if(p.verifica() == false ){
			  
			  //teste
			  switch (p.getestado())
				{
			  
			  case 0: 
				  System.out.println("\n\n");
					System.out.println("  ##########***##  \n");
					System.out.println("  ####            \n");
					System.out.println("  ####            \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					break ;
				case 1: 
					
					System.out.println("\n\n");
					System.out.println("  ##########***##  \n");
					System.out.println("  ####       *    \n");
					System.out.println("  ####      ***   \n");
					System.out.println("  ##       *o o*  \n");
					System.out.println("  ##       * ^ *  \n");
					System.out.println("  ##         *    \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					
					
					System.out.println("\n _____");
					break;
				case 2:
					System.out.println("\n\n");
					System.out.println("  ##########***##  \n");
					System.out.println("  ####       *    \n");
					System.out.println("  ####      ***   \n");
					System.out.println("  ##       *o o*  \n");
					System.out.println("  ##       * ^ *  \n");
					System.out.println("  ##         *    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");

					break;
				case 3:
					System.out.println("\n\n");
					System.out.println("  ##########***##  \n");
					System.out.println("  ####       *    \n");
					System.out.println("  ####      ***   \n");
					System.out.println("  ##       *o o*  \n");
					System.out.println("  ##       * ^ *  \n");
					System.out.println("  ##         *    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##        /|    \n");
					System.out.println("  ##       / |    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					break;
				case 4:
					System.out.println("\n\n");
					System.out.println("  ##########***##  \n");
					System.out.println("  ####       *    \n");
					System.out.println("  ####      ***   \n");
					System.out.println("  ##       *o o*  \n");
					System.out.println("  ##       * ^ *  \n");
					System.out.println("  ##         *    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##        /|\\  \n");
					System.out.println("  ##       / | \\ \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##              \n");
					System.out.println("  ##              \n");
					break;
				case 5:
					System.out.println("\n\n");
					System.out.println("  ##########***##  \n");
					System.out.println("  ####       *    \n");
					System.out.println("  ####      ***   \n");
					System.out.println("  ##       *o o*  \n");
					System.out.println("  ##       * ^ *  \n");
					System.out.println("  ##         *    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##        /|\\  \n");
					System.out.println("  ##       / | \\ \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##        /     \n");
					System.out.println("  ##       /      \n");
					break;
				case 6:
					System.out.println("\n\n");
					System.out.println("  ##########***##  \n");
					System.out.println("  ####       *    \n");
					System.out.println("  ####      ***   \n");
					System.out.println("  ##       *X X*  \n");
					System.out.println("  ##       * ^ *  \n");
					System.out.println("  ##         *    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##        /|\\   \n");
					System.out.println("  ##       / | \\  \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##         |    \n");
					System.out.println("  ##        / \\   \n");
					System.out.println("  ##       /   \\  \n");
					break;
				}
			  
			  //fim de teste
			  
			  
			  
			  
			  
	  System.out.println("Introduza uma letra pf: ");
	  p.receber(input.next().charAt(0));
	  
	  System.out.println(p.tamanhodasletras());
		  }
		  else{
			  System.out.println(" !! GANHAS-TE MPT !! ");
			  break;
			  
		  }
	  }while(p.getestado() < 6 || !p.verifica());
		
	}
	
	public static void cls (){
		int linha = 0;
		while (linha <= 50){
			linha ++ ;
			System.out.println("");
		}
		
	}	
	
}
