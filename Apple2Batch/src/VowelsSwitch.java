import java.util.Scanner;

public class VowelsSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Character: ");
		ch=sc.next().charAt(0);//a
		
		switch(ch)//a //I  ><>=<=  ==  int,byte,short,long,char,String
		{
		case 'a': 
			
		case 'e': 
			
		case 'i': 
			
		case 'o': 
			
		case 'u': 
			
		case 'A': 
			
		case 'E': 
			
		case 'I': 
			
		case 'O': 
			
		case 'U': 
			System.out.println("Vowel");
			break;
			
		default: System.out.println("Consonant");
		}

	}

}
