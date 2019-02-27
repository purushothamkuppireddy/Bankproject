package customerform;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Bankingmethods {

	Scanner sc=new Scanner(System.in);
	
	public void withdrawl(long amount,int i) 
	{
	
	 System.out.println("enter the amount to be withdraw");
	 int amt=sc.nextInt();
	 	if(amt>amount)
	 	{
		 System.out.println("insufficient balance");
	 	}
	 	else
	 	{
	 		System.out.println("current Bal:"+ (amount-amt));
	 		try
	 		{
	 		
	 		FileInputStream file=new FileInputStream("E:\\Programjava\\banklogin.txt");
			ObjectInputStream out=new ObjectInputStream(file);
			ArrayList<User> userlist=(ArrayList<User>)out.readObject();
			
			
			userlist.get(i).setAmount(amount-amt);
			//System.out.println(userlist.get(i).getAmount());
	 		
			FileOutputStream file2=new FileOutputStream("E:\\Programjava\\banklogin.txt");
			ObjectOutputStream obj=new ObjectOutputStream(file2);
			obj.writeObject(userlist);
			file.close();
			
			
	 		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		
	 		
	 		
	 	}
	 
	}
	
	
	
	public void deposit(long amount,int i)
	{
		System.out.println("enter amount to deposit");
		int amt=sc.nextInt();	
		
		System.out.println("After deposit:"+(amount+amt));
		
		try
 		{
 		
 		FileInputStream file=new FileInputStream("E:\\Programjava\\banklogin.txt");
		ObjectInputStream out=new ObjectInputStream(file);
		ArrayList<User> userlist=(ArrayList<User>)out.readObject();
		
		
		userlist.get(i).setAmount(amount+amt);
		//System.out.println(userlist.get(i).getAmount());
 		
		FileOutputStream file2=new FileOutputStream("E:\\Programjava\\banklogin.txt");
		ObjectOutputStream obj=new ObjectOutputStream(file2);
		obj.writeObject(userlist);
		file.close();
		
		
 		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		
	}
	
	public void exit()
	{
		System.out.println("Thank you");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
