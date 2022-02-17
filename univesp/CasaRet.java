/* Classe feita para caucular area da casa com */

class CasaRet {
	public static void main(String[] args) { // declarando método main para execução do código 
	/* public >> o método pode ser acessado por qualquer classe dentro e fora do projeto
	   static >> a classe não precisa ser instanciada para chamar o método
	   void >> este método não possui retorno */ 
	   
	   	//declarando as variaveis que serão utilizadas no cauculo; 
		double raio =2;
		double areap;
		float lateral = 10 ; // comprimento da lateral da cabana
		float cquarto = 7; // comprimento da lateral do quarto
		float  areaq; // área do quarto
		float  areas; // área da sala
		float  areat; // área total
		
        // saida no terminal informando ao usuario o que o programa executa
		System.out.println("Programa para cálculo da área da casa");
		
		
		areas = lateral * lateral;
		System.out.println("A área da sala é " + areas);
      
		// areaq = 7 * 5;
		areaq = cquarto* (lateral/2);
		
		// saida no terminal informando as areas
		System.out.println("A área do quarto é " + areaq);
		System.out.println("A área do banheiro é " + areaq);
        
		//cauculo da area total
		areat = areas + 2 * areaq;
		
        // saida no terminal informando a area total
		System.out.println("A área total é " + areat);
		
	
		// operação de cauculo da area utilizando o pi e potencia da biblioteca math do java; 
		areap = Math.PI * Math.pow(raio,2);
		
		//saida no terminal informando a area
		System.out.println ("area: " + areap);
	}
}