package customerform;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



//import com.bank.model.user;

public class Registration {
 	public static User setInfo()
	{
		User u=new User();
		Random r=new Random();
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter details ");
	long acc= r.nextLong();
	//long pwd= r.nextLong();
	u.setAccountno(Math.abs(acc));
	u.setFirstname(sc.next());
	u.setPhone(sc.nextLong());
	u.setPwd(sc.nextLong());
	u.setAmount(sc.nextLong());
	System.out.println("Accno:"+u.getAccountno());
	
	return u;
	}
	
	
	public static void main1(){
		//User u=new User();
		ArrayList<User> ua=new ArrayList<User>();
		System.out.println("enter no.of users");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i <n ; i++) {
			
		
		ua.add(setInfo());
		}
		System.out.println(ua);
		try {
			FileOutputStream file=new FileOutputStream("E:\\Programjava\\banklogin.txt");
			ObjectOutputStream obj=new ObjectOutputStream(file);
			obj.writeObject(ua);
			file.close();
			System.out.println("done");
			
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public static void main(String[] args)
	{
		Registration reg=new Registration();
		reg.main1();
		
	}
	
	
	}
	
	



