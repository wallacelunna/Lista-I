package List_1;
import java.util.Random;
import java.util.Scanner;
public class List_1d {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Random gerador = new Random();
		    
		String nome, CPF, dataVoo, horario, numVoo;
		 int num;
		   
		   System.out.println
		     ("1 - Cadastrar Passageiro\n2 -Check in\n3-Cancelar Voo\n4 - Sair "); 
		    
		     System.out.println(" Escolha uma opção");
		    num = entrada.nextInt();
		    
		for(int i=0;i<10;i++){
		  
		    switch (num){
		      
		    case 1: System.out.println(" Insira CPF, datavoo e horario");
		    CPF = entrada.next();
		    dataVoo = entrada.next();
		    horario = entrada.next();
		        System.out.println(" Cadastro Efetuado com Sucesso seu voo é: "+gerador.nextInt(999) );
		        break;
		        
		     case 2: System.out.println(" Insira CPF, Numero do vôo");
		    CPF = entrada.next();
		    numVoo = entrada.next();
		       System.out.println(" Check-in realizado com sucesso");
		        break;  
		        
		      case 3: System.out.println(" Insira CPF, Numero do vôo");
		    CPF = entrada.next();
		    numVoo = entrada.next();
		       System.out.println(" Voo Cancelado com sucesso");
		        break; 
		        
		        case 4: System.out.println("Sair ");
		        break; 
		        
		      default:
		        System.out.println(" Numero inválido");
		        
		      }
		  }
		    }
		}