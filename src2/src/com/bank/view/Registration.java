package com.bank.view;
import java.util.*;
import com.bank.model.user;
import java.io.*;

public class Registration {
	static int count=1;
public static user setInfo(){
	user u=new user();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user details"+count);
	
//	u.setFirstname(sc.next());
//	u.setLastname(sc.next());
	u.setAdharno(sc.nextLong());
//	u.setAccountno(sc.nextLong());
//	u.setPanNo(sc.next());
//	u.setPhone(sc.nextLong());
//	u.setAddress(sc.next());
//	
	count++;
	return u;
	
}
	
	public static void main(String args[]){
		ArrayList<user> ua=new ArrayList<>();
		for (int i = 1; i <=5; i++) 
		{
		ua.add(setInfo());
		}
		
		System.out.println(ua);
		try {
			FileOutputStream f=new FileOutputStream("E:\\Programjava\\bankuser.txt");
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(ua);
			f.close();
			System.out.println("done");
		FileInputStream file=new FileInputStream("E:\\Programjava\\bankuser.txt");
			ObjectInputStream out=new ObjectInputStream(file);
			//@SuppressWarnings("unchecked")
			ArrayList<user> userlist=(ArrayList<user>)out.readObject();
			//file.close();
			
			//user u1=new user();
			//u1=userlist.get(1);
			//System.out.println(u1);
			//System.out.println(u1.getFirstname());
	
		//user ul[]=new user[5];
		long temp[]=new long[5];
		for (int i = 0; i <5; i++)
		{
			
			temp[i]=(userlist.get(i)).getAdharno();
			
			System.out.println(temp[i]);
		}
		
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
