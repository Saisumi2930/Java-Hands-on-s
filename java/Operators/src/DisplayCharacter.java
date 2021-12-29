import java.util.Scanner;
public class DisplayCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=4;
		int[] num=new int[n];
		System.out.println("Enter the digits:");
		for(int i=0;i<n;++i)
			num[i]=sc.nextInt();
		
		for(int i=0;i<n;++i)
			System.out.println(num[i]+"-"+(char)num[i]);
	}

}
