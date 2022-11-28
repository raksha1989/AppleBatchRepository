package forlooping;

public class StarPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=7;
	  /*1
		12
		123
		1234
		12345
		
		1         1
		22        2
		333       3
		4444      4
		55555*/
		
		char ch='a';
		for(int i=1;i<=row;i++)     //      i=1       i=2           i=3                 i=4            i=5
		{
			for(int j=1;j<=i;j++)//      
			{
				System.out.print(ch);//
			}                        //
			System.out.println(); 
			ch++;    
		}                             
                                      
	}

}
/*a
ab
abc
abcd
abcde

a
bb
ccc
dddd
eeeee
*/

