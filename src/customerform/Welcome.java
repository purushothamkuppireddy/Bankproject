package customerform;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
	
		
		
		int j=1;
		while(j==1)
		{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice ");
		int ch=sc.nextInt();
		
			switch(ch)
			{
			case 0:		Registration registration=new Registration();
						registration.main(null);
						break;
		
			case 1:   Login login=new Login();
						login.main2();
						break;
			}
		j=1;
		}
	}

}
