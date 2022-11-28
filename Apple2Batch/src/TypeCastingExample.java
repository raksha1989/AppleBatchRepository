
public class TypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b;
		float f,e=6.7f;
		long l;

		f=a;  //implicit

		b=(int)e;
		
		l=(long)e;
		System.out.println(b+" "+l);
		
		char ch='a';//A 65   a=97
		int i=ch;
		System.out.println(i);
		
		
		int c=75;
		char d=(char) c;
		System.out.println(d);

	}

}
