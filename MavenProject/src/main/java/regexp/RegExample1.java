package regexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Number?");
		String snumber=sc.next();
		while (!Pattern.matches("[0-9]{4}", snumber)) {
			
			System.err.println("please enter student number must be digit ex:1234");
			snumber=sc.next();
		}
		int sno = Integer.parseInt(snumber);
		System.out.println("Enter Student Name?");
		String sname=sc.next();
		while(!Pattern.matches("[a-zA-Z]{7}", sname)){
			System.err.println("please enter student number must be digit ex:Chandra");
			sname=sc.next();
			
		}
		System.out.println("Enter Student Mobile Number");
		String mobile=sc.next();
		while (!Pattern.matches("\\d{10}", mobile)) {
			System.err.println("Please Enter Student Mobile Number 10 digits only Ex:123456789");
			mobile = sc.next();
		}
		
	}

}
