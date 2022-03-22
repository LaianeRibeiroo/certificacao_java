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
	
      public static void carregaval(double[][]m){
        for (int i=0; i<m.length; i++){
          for (int j=50; j<=200; j+=50){
             m[i][j/ 50-1] = precos [i] * j;
          }
        }
      }
       public static double[][]cauculaFinal(double [][] val,double [][] desc){
	      double [][] saida = new double [val.length] [val[0].length];
		  for (int i=0; i<saida.length; i++){
			  for (int j=0; i<saida[0].length; j++){
			saida [i][j] = val [i][j] * (1-desc[i][j]);
	          }
	      }
		  return(saida);
	    }
		  
	   
	   

      public static void main(String[] args) { 
       double [][] valores = new double[4][4];
       double [][] descontos = { 
		   {0,0,0.2,0.2},
		   {0.05,0.05,0.1,0.15},
		   {0.02,0.04,0.08,0.16},
	       {0,0,0,0.05}};
	   double [][] pFinal;
	   carregaval(valores);
	   pFinal = cauculaFinal(valores,descontos);
	      for (double [] linha: valores){
			for (double valor: linha)
				System.out.print(valor + " | ");
			 System.out.println();
		  }
	  }    

}

	 