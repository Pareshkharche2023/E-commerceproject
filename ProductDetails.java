package com.project;

import java.util.Scanner;

public class ProductDetails {

		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);

			System.out.println("Welcome to Shop");
			System.out.println();

			
			while(true){
				System.out.println("To order Laptop, Enter 1");
				System.out.println("To order Mouse, Enter 2");
				System.out.println("To order TV, Enter 3");
				System.out.println("To order Keyboard, Enter 4");
				System.out.println("To order Clock, Enter 5");
				System.out.println("To order Mobile, Enter 6");
				System.out.println("To Exit, Enter 9");

				System.out.println();
				System.out.println("Enter your choice::");
				int choice = scan.nextInt();

				switch(choice){
				case 1: System.out.println("Welcome you have selected Laptop");
				laptop();
				break;
				case 2: System.out.println("Welcome you have selected Mouse");
				mouse();
				break;
				case 3: System.out.println("Welcome you have selected TV");
				tv();
				break;
				case 4: System.out.println("Welcome you have selected Keyboard");
				keyboard();
				break;
				case 5: System.out.println("Welcome you have selected Clock");
				clock();
				break;			
				case 6: System.out.println("Welcome you have selected Mobile");
				mobile();
				break;
				case 9: System.out.println("Thanks for ordering from our App. Visit again");
				System.exit(0);
				break;
				default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
				}
			}

		}

		public static void laptop(){
			System.out.println("Dell laptop intel i5 11th gen 1tb hdd + 256 ssd with intigrated nvidia graphics card");
			System.out.println("Laptop :  Laptop");
			System.out.println("Price 55000");
			

		}

		public static void mouse(){
			System.out.println("Dell mouse wired ");
			System.out.println("dell mouse : Mouse");
			System.out.println("Price 750 ");
			
		}

		public static void tv(){
			System.out.println("Tv sony with bluetooh feature + screen touch");
			System.out.println("Price 12000 rs");
			

		}

		public static void keyboard(){
			System.out.println("Dell keyboard 96 keys with blue buttons 1 year wranty ");
			System.out.println("Price 2500 rs ");
			
		}

		public static void clock(){
			System.out.println("Titan clock with black color belt with round dial");
			System.out.println("Price 4500 rs ");
			
		}

		public static void mobile(){
			System.out.println("Redme mobile 128 gb internal + 8 gb ram black color ");
			System.out.println("Price 16000 rs ");
			

		}
}

