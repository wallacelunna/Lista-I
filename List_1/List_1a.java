package List_1;
import java.util.Scanner;
public class List_1a {

	public static void main(String[] args) {
			    Scanner ler= new Scanner(System.in);
			    int tempoh, velkm, autonomia, kmpercorrido, consFinal;
			    
			    System.out.println("Digite o tempo total da viagem em Horas:");
		        tempoh=ler.nextInt();
			    
			    System.out.println("Digite a velocidade m�dia em km/h:");
			    velkm=ler.nextInt();
			    
			     System.out.println("Digite a autonomia do ve�culo em km/l:");
			    autonomia=ler.nextInt();
			    
			    kmpercorrido = tempoh*velkm;
			    
			    consFinal= kmpercorrido/autonomia;
			    
			    System.out.println("O consumo final do combust�vel foi: "+consFinal+" litros");
			  }
	}
