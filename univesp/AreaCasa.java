class AreaCasa { //método de cauculo da area da piscina;
	
	static double valorM2 = 1500;  // declarando variavel global de metrosquadrados. 

	
	static void areacasa( float lateral, float cquarto){  //inicializando método com passagem de parametros. 
	
	float  areaq; // área do quarto
	float  areas; // área da sala
	float  areat; // área total
	 
	
        System.out.println("Programa para cálculo da área da casa");
			
		areas = lateral * lateral;
		System.out.println("A área da sala é " + areas);
      
		areaq = cquarto* (lateral/2); // areaq = 7 * 5;;
		
		// saida no terminal informando as areas
		System.out.println("A área do quarto é " + areaq);
		System.out.println("A área do banheiro é " + areaq);
        
		areat = areas + 2 * areaq; //cauculo da area total
		
    	System.out.println("A área total é " + areat); // saida no terminal informando a area total
	}
	
	static double areaPiscina (double raio) { // método de cauculo da area da piscina, com passagem do parametro
	
		//retorno do método
		return Math.PI * Math.pow(raio,2);	
				
	}
	
	static double valor (double area){
		if (area >= 0 ){ // testando se a area é positiva, se sim, o cauculo será executado
		 return (valorM2*area); 	
		}
		return (-1); 
	}
		
	
	public static void main(String[] args) { // declarando método main para execução do código 
	
	   double preco; 
	   boolean valorOK = false;
	   preco = valor(20); 
	   
	   //  if (preco >= 0) valorOK = true; // testando a saida com boolean (valores lógicos) 
	   valorOK = preco >= 0;
	     if (valorOK) System.out.println (" O valor da construcao e  " + preco);  // testanto textos para unuarios. 
	     else System.out.println (" Valor de area negativo ");    
		}  
	}