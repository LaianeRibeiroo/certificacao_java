/* Programa para cálculo da area de uma piscina circular de uma
casa. Produzido com base no curso Programação de Computadores da UNIVESP */ 

class AreaPiscina {
	    
	//Materiais da psicina
	static final int ALVENARIA = 0; 
	static final int VINIL = 1;
	static final int FIBRA = 2;
	static final int PLASTICO = 3;
	
	//Preços dos materiais
    double [] precos;
	
	 // Nomes dos materiais
    static char[][] nomes = {
        {'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a'},
        {'V', 'i', 'n', 'i', 'l'},
        {'F', 'i', 'b', 'r', 'a'},
        {'P', 'l', 'a', 's', 't', 'i', 'c', 'o'}
    };
	
	  // Valor do raio
    double raio;

    AreaPiscina(){
        // this(new double[] {1500, 1100, 750, 500});
        double[] aux = {1500, 1100, 750, 500};
        this.precos = aux;
        this.raio = 10;
    }

    AreaPiscina(double[] precos){
        this.precos = precos;
        this.raio = 10;
    }

    AreaPiscina(double raio){
        this();
        this.raio = raio;
    }
	
	 // Calcula a área da piscina
       double area(){
        return (this.raio >= 0 ? (Math.PI * Math.pow(this.raio, 2)) : -1);
    }
	
	
	// valor do metro de acordo com o material 
	   double valorPiscina(double area, int material){
       if(material < ALVENARIA || material > PLASTICO || area < 0)
           return(-1);
       return (area * precos[material]);
    }
	
	
		
}