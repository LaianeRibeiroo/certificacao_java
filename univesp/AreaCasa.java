 /* Programa para caucular a area de uma casa ( e seus comodos) de 3 comodos: Uma
 sala de 10x10m, um banheiro e um quarto de 5x7m cada. */ 
 
 
 class AreaCasa { 
	
	//Valor do metro quadrado da casa
	static double valorM2 = 1500;  
   
	
	//Caucula a Area da casa
	static void areacasa( float lateral, float cquarto){  
	float areaq;
	float areas; 
	float areat; 
	
	//calculo da area
	static double area (double lateral, double cquarto){
		 if (lateral>=0 && cquarto >=0{
			 areat = lateral * lateral; 
			 areat += cquarto * lateral; 
		 } return (areat);
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
      
      double[][] calculaFinal(double[][] val, double[][] desc){
        double[][] saida = new double[val.length][val[0].length];

        for(int i = 0; i < saida.length; i++){
            for(int j = 0; j < saida[0].length ; j++){
                saida[i][j] = val[i][j] * (1 - desc[i][j]);
            }
        }

        return (saida);
     }
	
    
		
		static void imprimiMatriz(double [][] matriz){
		  for(int i=0; i<matriz.length; i++){
			for (int j=0; i<matriz[0].length; j++){
			  System.out.print(matriz [i][j] + " \t | ");   
		    }
			System.out.println();
		  }
		}
	
	
	
}

	 