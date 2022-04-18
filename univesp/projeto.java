//calcula a area de uma casa com piscina

class projeto{
	
	Residencia[] condominio;
     int ultimo = -1; // Último concominio

     boolean adicionaRes(Residencia r){
      if(this.ultimo < this.condominio.length-1){
      ultimo++;
      this.condominio[ultimo] = r;
      return true;
      }
      return false;
	 }

     projeto(int tam){
      condominio = new Residencia[tam];
     }
	
	
   public static void main(String[] args) {
        
     projeto proj = new projeto(3);
	  for (Residencia re : proj.condominio){
	    System.out.println("Endereço do objeto:  " + re); 
	  } 	 
   }
}