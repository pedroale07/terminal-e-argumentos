
public class ClasseDescricao {
	
	//TERMINAL E ARGUMENTOS
	/**
	 * 
	 *  Nem sempre executamos nosso programa Java pela IDE, j� pensou, nossos clientes tendo que instalar o Eclipse ou VsCode para rodar o sistema em sua empresa ?
	 *  Com a JVM devidamente configurada, n�s podemos criar um execut�vel do nosso programa e disponibilizar o instalador para qualquer sistema operacional.
	 *  No nosso caso, iremos aprender como executar um programa Java via terminal, como MS - DOS ou terminal do VsCode.
	 *  Vamos criar uma classe chamada MinhaClasse.java com o c�digo abaixo:
	 * 
	 */
	
	/**
	 * 
	 *	Observe que nosso projeto Java criado por uma IDE, ter� uma pasta chamada 
	 *bin. � nesta pasta que ficar�o os arquivos .class, o nosso bytecode
	 * 
	 */
	
		/**
		 * 
		 * Mesmo usando uma IDE, n�s sempre precisaremos identificar aonde se 
		 * encontram as classes do nosso projeto, no meu caso est� em: 
		 * C:\estudos\dio-trilha-java-basico\java-terminal.
		 * 
		 */
		
			//TERMINAL
			/**
			 * 
			 * Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.
			 *	Abra o MS-DOS ou Power Shell;
			 *	Localize o diret�rio do seu projeto: cd C:\estudos\dio-trilha-java-basico\java-terminal;
			 *	Acesse a pasta **** bin: ** cd bin**;
			 *	Agora digite o comando:**java MinhaClasse ** (nome da sua classe sem a extens�o .class).
			 * 
			 */
	
			//ARGUMENTOS
		
			/**
			 *
			 * 	Quando executamos uma classe, que contenha o m�todo main, 
			 * 	o mesmo permite que passemos um array [] de argumentos, 
			 * 	do tipo String. Logo, podemos ap�s a defini��o da classe a ser 
			 * 	executada, informar estes par�metros, exemplo:
			 *	java MinhaClasse agumentoUm argumentoDois
    		 *
			 * 
			 */
	   public static void main(String[] args) {
	        //os argumentos come�am com indice 0
	        String nome = args [0];
	        String sobrenome = args [1];
	        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
	        double altura = Double.valueOf(args[3]);

	        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
	        System.out.println("Tenho " + idade + " anos ");
	        System.out.println("Minha altura � " + altura + "cm ");
	    }
}

