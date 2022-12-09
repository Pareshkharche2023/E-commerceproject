package com.project;

import java.util.Scanner;

//user can buy multiple products
public class Buymultipleproducts {
	
	
	public static void  laptopdetail(){
		System.out.println("Dell laptop intel core i5 11th gen 1 tb hdd + 256 ssd");
	}
	public static void mousedetails(){
		System.out.println("Dell mouse");
	}
	public static void exit(){
		int f=1;
		System.out.println("exit");
	}
	
	public static void main(String[] args) {
		System.out.print("Select which product you want to buy");
		System.out.println("\nmenu:\n Laptop:laptopdetail\n Mouse:mousedetails \n exit:exit\nenter the choice of prodct");
		Buymultipleproducts buy=new Buymultipleproducts();
		Scanner productnameinput=new Scanner(System.in);
		String user=productnameinput.nextLine();
		String Laptop=user;
		//boolean f=false;
		while(true){
			//System.out.println("\n menu:\nLaptop:laptopdetail\nMouse:mousedetails \n exit:exit\nenter the choice of prodct");
			switch (user) {
			case "Laptop":
				laptopdetail();
				
				break;
			case "Mouse":
				mousedetails();
				
			case "exit":
				System.exit(0);

			default:
				break;
			}
		}
		
		
	}

}
