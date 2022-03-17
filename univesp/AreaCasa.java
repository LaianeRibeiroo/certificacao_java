 class AreaCasa { 
	
	//Valor do metro quadrado
	static double valorM2 = 1500;  
    
	//Materiais da psicina
	static final int ALVENARIA = 0; 
	static final int VINIL = 1;
	static final int FIBRA = 2;
	static final int PLASTICO = 3;
	
	//Preços dos materiais
    static double [] precos = {1500, 1100, 750, 500};
	
	//Area da casa
	static void areacasa( float lateral, float cquarto){  
	
	    float  areaq, areas, areat; 
        System.out.println("Programa para cálculo da área da casa");
		areas = lateral * lateral;
		System.out.println("A área da sala é " + areas);
      	areaq = cquarto* (lateral/2); 
		System.out.println("A área do quarto é " + areaq);
		System.out.println("A área do banheiro é " + areaq);
        areat = areas + 2 * areaq; 
		System.out.println("A área total é " + areat); 
	}
	
	// valor do metro de acordo com o material 
	static double valorPiscina(double area, int material){
	  		if (material <ALVENARIA || material > PLASTICO || area < 0)
			  return (-1);
		 return (area * precos[material]); 	
	}
	// cauculo da area total   	
	static double areaPiscina (double raio, int material) { 
		double valor;
		double resp;
		double area = 100;
		if (raio >= 0) {
		 resp = Math.PI * Math.pow(raio,2); 
		} 
		else resp = -1;
		return resp;
	}
	
	//Cauculo do valor por metro quadrado
	static double valor (double area){
		if (area >= 0 ){ 
		 return (valorM2*area); 	
		}
		return (-1); 
	}
		
	//metodo de caulculo da média usando arranjo
    static double media(double [] arranjo){ 
		double resp = 0;
		for (double valor: arranjo){
		resp += valor;	
		}
	    	return (resp/arranjo.length); 
	}
	
	//nome dos materiais 	     
    static char [][] nomes = {
	    {'A','l','v','e','n','a','r','i','a'},
		{'V','i','n','i','l'},
		{'F','i','b','r','a'},
		{'P','l','a','s','t','i','c','o'}
	   };
	public static void main(String[] args) { 
     System.out.println (nomes.length);
	 System.out.println (nomes[0].length);
	 
	for (char [] nome :nomes){
	 System.out.println (nome.length);
	 System.out.println (" ");
	}
	System.out.println();
    }
}
	  

	 