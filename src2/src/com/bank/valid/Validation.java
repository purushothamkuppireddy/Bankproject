package com.bank.valid;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import com.bank.model.user;
import com.bank.view.Registration;


public class Validation {

	static int count=6;
	public static user setInfo(){
		user u=new user();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user details(Adharno)"+count);
		
//		u.setFirstname(sc.next());
//		u.setLastname(sc.next());
		u.setAdharno(sc.nextLong());
//		u.setAccountno(sc.nextLong());
//		u.setPanNo(sc.next());
//		u.setPhone(sc.nextLong());
//		u.setAddress(sc.next());
	//	
		count++;
		return u;
		
	}

	
	
	public static void main(String[] args) {
		
		ArrayList<user> va=new ArrayList<>();
		
		va.add(setInfo());
		
		try {
			FileInputStream file=new FileInputStream("E:\\Programjava\\bankuser.txt");
			ObjectInputStream out=new ObjectInputStream(file);
			
			ArrayList<user> userlist2=(ArrayList<user>)out.readObject();
			//System.out.println(userlist2);
				//user ul[]=new user[5];
		//long temp[]=new long[5];
		for (int i = 0; i <5; i++)
		{
			
			if(userlist2.get(i).getAdharno()==va.get(0).getAdharno())
			{	
				System.out.println("customer already exist");
				break;
			}
			else
			{
				if(i<4)
					continue;
				else
				System.out.println("successful Registration");
			}
			
			
			//System.out.println(temp[i]);
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


