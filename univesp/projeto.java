//calcula a area de uma casa com piscina

class projeto{
   public static void main(String[] args) {
        
        double valorM2_ant = AreaCasa.valorM2;
         
		 // preço casa 1 
         System.out.println(AreaCasa.valor(AreaCasa.area(15,10)));
		 
		 //novo valor do m2
		 AreaCasa.valorM2 = 1270;
		 
		 // preço casa 2 
	     System.out.println(AreaCasa.valor(AreaCasa.area(18,8)));
		 
		 // restaura valor 
		 AreaCasa.valorM2 = valorM2_ant;
		 
     }

 }