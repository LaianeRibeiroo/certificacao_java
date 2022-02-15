/* Classe feita para caucular area da casa */

class CasaRet {
	public static void main(String[] args) {
		int areaq; // área do quarto
		int areas; // área da sala
		int areat; // área total

		System.out.println("Programa para cálculo da área da casa");
		
		areas = 10 * 10;
		System.out.println("A área da sala é " + areas);
      
		areaq = 7 * 5;
		System.out.println("A área do quarto é " + areaq);
		System.out.println("A área do banheiro é " + areaq);

		areat = areas + 2 * areaq;

		System.out.println("A área total é " + areat);
	}
}