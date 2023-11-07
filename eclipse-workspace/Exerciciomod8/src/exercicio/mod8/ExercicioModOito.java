package exercicio.mod8;

import javax.print.attribute.standard.Media;

public class ExercicioModOito { 
	public static void main (String args[]){
		operacoesNotas();
		
	}
	
	public static void operacoesNotas(){
		int nota1 = 10;
		double nota2 = 9.5;
		double nota3 = 9.5;
		int nota4 = 9;
		double nota5 = nota1 + nota2 + nota3 + nota4 ;
		double media1 = nota5 / 4;

		System.out.println("****Media**** ");

		

		System.out.println(media1);

		
		boolean media = media1 <= 8;
		System.out.println("Passou");
	}
	

	  
	  
	  

}
