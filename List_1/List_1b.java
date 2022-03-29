package List_1;
import java.util.Scanner;
public class List_1b {

	public static void main(String[] args) {
		
	  Scanner ler= new Scanner(System.in);
   
    int ano, cnt=0;
    String placa, vogais;
    		
    		System.out.println("Digite a placa do carro:");
    		placa=ler.next();
    
    		System.out.println("Digite o ano do carro:");
    		ano=ler.nextInt();

    			if(ano <= 2010){
    				System.out.println("Carro Velho!");
    }
    			if(ano >= 2011 & ano <= 2021){
    				System.out.println("Carro SemiNovo!");
    }
    			if(ano > 2021){
    				System.out.println("Carro Novo!");
    }
    
    			System.out.println(placa);
        		placa=ler.next();
        		
  }
	
}

