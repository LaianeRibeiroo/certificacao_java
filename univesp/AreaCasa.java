class AreaCasa { //método de cauculo da area da piscina;
	
	static double valorM2 = 1500;  // declarando variavel global de metrosquadrados. 
    static final int ALVENARIA = 0; // declarando constanstes
	static final int VINIL = 1;
	static final int FIBRA = 2;
	static final int PLASTICO = 3;
	
	static void areacasa( float lateral, float cquarto){  //inicializando método com passagem de parametros. 
	
	    float  areaq, areas, areat; // área do quarto, sala e total;
    
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
	
	static double valorPiscina(double area, int material){
	   /* switch (material){
		case ALVENARIA: return (area*1500);
        case VINIL: return (area*1100);			               
		case FIBRA: return (area*750);			               
		case PLASTICO: return (area*500);			               
		default: return (-1);
		*/ 
		if (material <ALVENARIA || material > PLASTICO || AREA < 0)
			return (-1)
		
		
		}return (area*precos[material];
	}
	   	
	static double areaPiscina (double raio, int material) { // método de cauculo da area da piscina, com passagem do parametro
		double valor;
		double resp;
		double area = 100;
		if (raio >= 0) {
		 resp = Math.PI * Math.pow(raio,2); 
		} 
		else resp = -1;
		return resp;
	}
	
	static double valor (double area){
		if (area >= 0 ){ // testando se a area é positiva, se sim, o cauculo será executado
		 return (valorM2*area); 	
		}
		return (-1); 
	}
		
		
    static double media(double [] arranjo){ //metodo de caulculo da média
		double resp=0;
		for (double valor: arranjo){
		resp += valor;	
		}
	    	return (resp/arranjo.length); 
	}
	
	
	/* public static void main(String[] args) { 
	double [] precos2 = new double [4];
	
	precos2[ALVENARIA] = 1500;
	precos2[VINIL] = 1100;
	precos2[FIBRA] = 750;
	precos2[PLASTICO] = 500; */
	
	 static char [][] nomes = 
	   {{'A','l','v','e','n','a','r','i','a'}
		{'V','i','n','i','l'}
		{'F','i','b','r','a'}
		{'P','l','á','s','t','i','c','o'}
	   };
	public static void main(String[] args) { 
    system.out.println (nomes.length);
	system.out.println (nomes[0].length);

}