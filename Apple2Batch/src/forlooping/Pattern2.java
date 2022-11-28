package forlooping;
//a
//ac
//ace
//aceg
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		for(int i=1;i<=4;i++) //   i=1              i=2                    i=3
		{
			int x=96;//                         x=96 x=97 x=98     x=96  x=97  x=98  x=99
			for(int j=1;j<=i;j++)//             j=1  j=2  j=3      j=1   j=2    j=3   j=4
			{
				System.out.print((char)(j+x));//     97+2           97    99     101
				x++;
			}
			System.out.println();//a
			                     //ac
		}                        //ace
                                 //aceg
	}

}
