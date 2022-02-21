class AreaCasa { //método de cauculo da area da piscina;
	
	static double valorM2 = 1500;  // declarando variavel global de metrosquadrados. 

	
	static void areacasa( float lateral, float cquarto){  //inicializando método com passagem de parametros. 
	
	float  areaq; // área do quarto
	float  areas; // área da sala
	float  areat; // área total
	
	
        System.out.println("Programa para cálculo da área da casa");
			
		areas = lateral * lateral;
		System.out.println("A área da sala é " + areas);
      
		areaq = cquarto* (lateral/2); // areaq = 7 * 5;
		
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
		return (valorM2*area); // o valor M2 é acessado globalmente. 
	}
		
	
	public static void main(String[] args) { // declarando método main para execução do código 
	   double areap; 
	   areacasa(11,7); // chamada e passagem de parametros lateral e cquarto
	   	   areap = areaPiscina (2); // chamada e passagem de  parametro
	   System.out.println (" ... " + areap);
	    
	}
}