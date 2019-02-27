package customerform;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Login {

	public static User setInfo()
	{
		User u=new User();
			
	Scanner sc=new Scanner(System.in);
	System.out.println("enter AccNo and pwd to Login ");
	u.setAccountno(sc.nextLong());
	u.setPwd(sc.nextLong());
	return u;
	}
	
	
	
	public static void main2() {
		User u=new User();
		Login L=new Login();
		
		u=L.setInfo();
		
		int j=1;
		while(j==1)
		{
		  try {	
			  
			  
			FileInputStream file=new FileInputStream("E:\\Programjava\\banklogin.txt");
			ObjectInputStream out=new ObjectInputStream(file);
			ArrayList<User> userlist=(ArrayList<User>)out.readObject();
			System.out.println();
		for (int i = 0; i <userlist.size(); i++)
		{
					
			
			if(userlist.get(i).getAccountno()==u.getAccountno())
			{
				if(userlist.get(i).getPwd()==u.getPwd())
				{
					System.out.println("Welcome to bank");
					 //L.disp();
			
					
					Scanner sc=new Scanner(System.in);
					  System.out.println("Enter the choice for 1.withdrawl, 2.deposit, 3.exit");
					  int x=sc.nextInt();
					  Bankingmethods b=new Bankingmethods();
					  
					 switch(x) {
					  
					  case 1: b.withdrawl(userlist.get(i).getAmount(),i);
					  			break;
					  
					  case 2: b.deposit(userlist.get(i).getAmount(),i);
					  			break;
					  
					  case 3: b.exit();	
					  			System.exit(0);
					  			break;
					  			
					  		}
				
				}
				else
				{
					System.out.println("password is wrong");
					System.exit(0);// it terminates from while loop
				}
				
			break;//if If executed once then it breaks from forloop;
			}
			
			else
			{
				if(i<userlist.size()-1)
					continue;
				else
				System.out.println("not a Registered accno");
			}
			
		}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		 /*private void disp() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the choice for 1.withdrawl, 2.deposit, 3.exit");
		  int x=sc.nextInt();
		  Bankingmethods b=new Bankingmethods();
		  switch(x) {
		  
		  case 1: b.withdrawl();
		  			break;
		  
		  case 2: b.deposit();
		  			break;
		  
		  case 3: b.exit();	
		  			break;
		  
	}
		 }*/

	}}
}
