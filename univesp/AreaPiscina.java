/* Programa para cálculo da area de uma piscina circular de uma
casa. Produzido com base no curso Programação de Computadores da UNIVESP */ 

class AreaPiscina {
	public static void main ( String [] args){ // declarando método main;
		
		//declarando as variaveis que serão utilizadas no cauculo; 
		double raio =2;
		double areap;
		// operação de cauculo da area utilizando o pi e potencia da biblioteca math do java; 
		areap = Math.PI * Math.pow(raio,2);
		
		//saida no terminal informando a area
		System.out.println ("area: " + areap);
	}   
}