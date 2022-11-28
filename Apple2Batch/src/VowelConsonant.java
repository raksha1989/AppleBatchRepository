import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a character: ");
		ch=input.next().charAt(0);//
		
		if(ch=='A' || ch=='a')
			System.out.println("Vowel");
		else if(ch=='E' || ch=='e')
			System.out.println("Vowel");
		else if(ch=='I' || ch=='i')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
		
	

	}

}
