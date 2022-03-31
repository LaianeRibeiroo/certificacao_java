/* Programa para cálculo da area de uma piscina circular de uma
casa. Produzido com base no curso Programação de Computadores da UNIVESP */ 

class AreaPiscina {
	    
	//Materiais da psicina
	static final int ALVENARIA = 0; 
	static final int VINIL = 1;
	static final int FIBRA = 2;
	static final int PLASTICO = 3;
	
	//Preços dos materiais
    static double [] precos = {1500, 1100, 750, 500};
	
	//nomes dos materiais 
	static char [][] nomes = 
	 {{'A','l','v','e','n','a','r','i','a'}
	 {'V','i','n','i','l'}
	 {'F','i','b','r','a'}
	 {'P','l','á','s','t','i','c','o'}};
	
	// cauculo da area total   	
	static double areaPiscina (double raio, int material) { 
	 return(raio >= 0) ?
	  Math.PI * Math.pow(raio,2):-1; 
		} 
	// valor do metro de acordo com o material 
	static double valorPiscina(double area, int material){
	 if (material <ALVENARIA || material > PLASTICO || area < 0)
	  return (-1);
		 return (area * precos[material]); 	
	}
		
}