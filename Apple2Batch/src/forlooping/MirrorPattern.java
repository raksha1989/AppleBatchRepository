package forlooping;
//   1     1
//  1 2     2
// 1 2 3     3
//1 2 3 4     4


//   1   
//12
//123
//1234
public class MirrorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=5;
		for(int i=1;i<=r;i++)//       i=1                   i=2                i=3              i=4           i=5
		{                      //k<=4                    k<=3                  k<=2              k<=1         k<=0
			for(int k=5;k>i;k--)//k=1 k=2 k=3,4,5   k=1 k=2 k=3 k=4        k=1 k=2 k=3       k=1  k=2       k=1
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)//  j=1 j=2            j=1 j=2 j=3        j=1 j=2 j=3 j=4     j=1,2,3,4,5   j=1,2,3,4,5,6
			{
				System.out.print("* ");//____1
			}                       //___12
			System.out.println();   //__123
		}                           //_1234
		                            //12345

	}

}
