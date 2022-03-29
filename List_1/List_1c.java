package List_1;
import java.util.Scanner;
public class List_1c {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
			      
	    int cnt=0;
		String vogais= "";
		
        System.out.println("Digite uma frase: ");            
        String frase = ler.nextLine();
        
        frase = frase.toLowerCase();
        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            
            if(c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u'){
               
               vogais= vogais+Character.toString(c);
               
            }
        }
        if(vogais.contains("a"))
        	cnt++;
        if(vogais.contains("e"))
        	cnt++;
        if(vogais.contains("i"))
        	cnt++;
        if(vogais.contains("o"))
        	cnt++;
        if(vogais.contains("u"))
    	cnt++;
        System.out.println("Na frase \"" + frase + "\" temos: " + cnt  + " vogais.");
}

		
		
	}


