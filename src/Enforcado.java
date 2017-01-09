public class Enforcado 
{
	private String 	plvra				; 	
	private String 	letraR	; 	
	private int 	estado				; 	

	public Enforcado(String plvra)
	{
		//Construtor 
		this.plvra = plvra;
		this.estado = 0;
		this.letraR ="";
	}
	
	public String Tamanhodasletras ()
	{
		
		String output = "";
		
		for (char letra : this.plvra.toCharArray())
		{
			char L = Character.toUpperCase(letra);
			if(letraR.indexOf(L)>=0)
			{
				output+=Character.toUpperCase(L);
			}
			else
			{
				output+="_";
			}
		}
		return output; 
	}
	
	public boolean Verifica() 
	{
		if(this.Tamanhodasletras().contains("_")) // caso tenha underscore, vai dar erro
		{return false; }
		else{return true;}
	}
	
	public void receber(char L) 
	{
		char letra = Character.toUpperCase(L);
		if		(letraR.indexOf(letra)<0 && plvra.indexOf(letra)<0)
		{
			incrementer();
			return;
		}
		else if (letraR.indexOf(letra)>=0 && plvra.indexOf(letra)<0)
		{
		
			return;
		}
		else if (letraR.indexOf(letra)<0 && plvra.indexOf(letra)>=0)
		{
			
			letraR+= letra;
			return;
		}
		else if (letraR.indexOf(letra)>=0 && plvra.indexOf(letra)>=0)
		{
		
		}
		else
		{
			
			return;
		}
		
	}
	// GET & SEt's
	public int getestado()
	{
		return this.estado;
	}
	
	private void incrementer()
	{
		this.estado++;
	}
}
