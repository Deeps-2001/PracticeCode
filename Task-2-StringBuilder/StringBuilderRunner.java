package runner;

import java.util.Scanner;
import logic.StringBuilderLogic;
public class StringBuilderRunner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a choice :");
		int choice = scan.nextInt();
		 StringBuilderLogic helper = new StringBuilderLogic();
	switch (choice) {
	case 1 :{
		StringBuilder input1 = new StringBuilder();
		System.out.println("Enter a String : ");
		String input2 = scan.next();
		System.out.println("The length of the StringBuilder is : "+ input1.length());
		String result = helper.addStringToStringBuilder(input1, input2);
		System.out.println("The length of the final String is : "+ result.length()+" and final string is : "+result);
		break;
		}
	case 2 :
		{	
		StringBuilder input1 = new StringBuilder("My");
		System.out.println("The length of the StringBuilder is : "+ input1.length());
		System.out.println("How many No. of String to add ? ");
		int num = scan.nextInt();
		String [] input2 = new String [num];
		int len = input2.length;
		for (int i = 1; i <= len; i++) {
			System.out.print("Enter a string"+i+" :");
			String str = scan.next();
			input2[i-1] = str;
		}
		String result = helper.addFourStringWith(input1, input2);
		System.out.println("The length of the final String is : "+ result.length()+" and Final 4 added string is "+result);
		break;
		}
	case 3 :{
		StringBuilder input1 = new StringBuilder("My name");
		System.out.println("Enter a String to add : ");
		String input2 = scan.next();
		System.out.println("The length of the StringBuilder is : "+ input1.length());
		String result = helper.printStrBuilderWithSpace(input1,input2);
		System.out.println("The length of the final String is : "+ result.length()+" and final string is :"+result);
	 
		break;
		}
	case 4 :{
		StringBuilder input = new StringBuilder("My name");
		System.out.println("The length of the StringBuilder is : "+ input.length());
		String result = helper.delFirstString(input);
		System.out.println("The length of the final String is : "+ result.length()+" and final string is :"+result);
		break;
		}
	case 5 :{
		StringBuilder input = new StringBuilder("My name is");
		System.out.println("The length of the StringBuilder is : "+ input.length());
		String result = helper.printWith(input);
		System.out.println("The length of the final String is : "+ result.length()+" and final string is :"+result);
		break;
		}
	case 6 :{
		StringBuilder input = new StringBuilder("My name is");
		System.out.println("The length of the StringBuilder is : "+ input.length());
		String result = helper.reverseString(input);
		System.out.println("The length of the final String is : "+ result.length()+" and final string is :"+result);
		break;
		}
	case 7 :{
		StringBuilder input = new StringBuilder("Friendship");
		System.out.println("The length of the StringBuilder is : "+ input.length());
		String result = helper.deleteIndex6To8(input);
		System.out.println("The length of the final String is : "+ result.length()+" and final string is :"+result);
		break;
		}
	case 8 :{
		StringBuilder input1 = new StringBuilder("Friendship");
		System.out.println("The length of the StringBuilder is : "+ input1.length());
		String input2 = "XYZ";
		String result = helper.printIndex6To8With(input1,input2);
		System.out.println("The length of the final String is : "+ result.length()+" and final string is :"+result);
		break;
		}
	case 9 :{
		StringBuilder input1 = new StringBuilder("MyName#is#Pradeep"); 
		String input2 = "#";
		int result = helper.findFirstIndexOf(input1,input2);
		System.out.println("The length of the final String is : "+input1.length()+" and first Indexof \"#\" in strbuilder is :"+result);
		break;
		}
	case 10 :{
		StringBuilder input1 = new StringBuilder("MyName#is#Pradeep"); 
		String input2 = "#";
		int result = helper.findLastIndexOf(input1,input2);
		System.out.println("The length of the final String is : "+input1.length()+" and last Indexof \"#\" in strbuilder is :"+result);
		break;
		}
	default : {
		System.out.println("No Matching found");
		break;
		}
	} 

		scan.close();
}
}