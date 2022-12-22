package runner;
import logic.StringLogic;
import java.util.Scanner; 

public class StringRunner {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a choice :");
	int choice = scan.nextInt();
	 	StringLogic helper = new StringLogic();

	switch(choice) {
	case 1 : {
		String input = "Deepspradeep";
		System.out.println("The Length of given String is :"+ helper.stringLength(input));
		break;
		}
	case 2 :{
		System.out.println("Enter a String :");
		String newString = scan.next();
		char[] arr = helper.charArr(newString);
		System.out.print("The converted string to Chararray is :");
		for (int i = 0; i < arr.length; i++) {
		 System.out.print(arr[i]);
		}
		break;
		}
	case 3 :{
		System.out.println("Enter a String :");
		String	input = scan.next();
		System.out.println(helper.findPenUltimate(input));
		break;
		}
	 
	case 4 :{
		System.out.println("Enter a String : ");
		String stringName = scan.next();
		System.out.println("Enter a Letter to find : ");
		char input = scan.next().charAt(0);
		System.out.println(helper.findNoOfOccurance(stringName, input));
		break;
		}
	case 5 :{
		System.out.println("Enter a String : ");
		String stringName = scan.next();
		System.out.println("Enter a Letter to find : ");
		char input = scan.next().charAt(0);
		System.out.println(helper.findGreatestPosition(stringName, input));
		break;
		}
	case 6 :{
		System.out.println("Enter a String : ");
		String input = scan.next();
		System.out.println("The last 5 character of the given string is : "+ helper.printLast5(input));
		break;
		}
	case 7 :{
		System.out.println("Enter a String : ");
		String input = scan.next();
		System.out.println(helper.printFirst3(input));
		break;
		}
	case 8 :{
		System.out.println("Enter a String : ");
		String stringName = scan.next();
		String input = "XYZ";
		System.out.println(helper.replaceFirstThree(stringName ,input));
		break;
		}
	case 9 :{
		System.out.println("Enter a String : ");
		String stringName = scan.next();
		String input = "ent";
		System.out.println(helper.startsWith(stringName, input));
		break;
		}
	case 10 :{
		System.out.println("Enter a String : ");
		String stringName = scan.next();
		String input = "le";
		System.out.println(helper.endsWith(stringName, input));
		break;
		}
	case 11 :{
		System.out.println("Enter a String : ");
		String input = scan.next();
		System.out.println(helper.covertToLowercase(input));
		break;
		}
	case 12 :{
		System.out.println("Enter a String : ");
		String input = scan.next();
		System.out.println(helper.covertToUppercase(input));
		break;
		}
	case 13 :{
		System.out.println("Enter a String : ");
		String input = scan.next();
		System.out.println(helper.stringReverse(input));
		break;
		}
	case 14 :{
		System.out.println("Enter a String : ");
		scan.nextLine();
		String input = scan.nextLine();
		System.out.println(input);
		break;
		}
	case 15 :{
		System.out.println("Enter a String : ");
		scan.nextLine();
		String input = scan.nextLine();
		System.out.println(helper.toPrintWithoutSpace(input));
		break;
		}
	case 16 :{
		/*System.out.println("Enter a String : ");
		scan.nextLine();
		String input = scan.nextLine();*/
		String input = "Neeraj Chopra bagged gold medal in javelin";
		
		System.out.println(helper.encloseToStringArray(input));
		break;
		}
	case 17 :{
		System.out.println("How many words do you want to enter ?");
		int words = scan.nextInt();
		String[] input = new String[words];
		for (int i = 1; i <= input.length; i++) {
			System.out.println("Enter String " + i +" : ");
			String str = scan.next();
			input[i-1] = str;
		}
		System.out.println(helper.mergeEachString(input));
//		String input1 ="Learning";
//		String input2 ="Java";
//		String input3 = "using";
//		String input4 ="Head";
//		String input5 ="First";
//		String input6 ="java";
//		String input = input1+" "+input2+" "+input3+" "+input4+" "+input5+" "+input6;
//		System.out.println(helper.mergeEachString(input));
		break;
		}
	 
	case 18 :{
		String string1 = "India";
		String string2 = "India";
		
		String string3 = "Einsteiin";
		String string4 = "einstein";
		
		System.out.println(helper.checkTwoStringSensitive(string1, string2));
		System.out.println(helper.checkTwoStringSensitive(string3, string4));
		break;
		}
	case 19 :{
		String string1 = "Edison";
		String string2 = "Edisun";
		
		String string3 = "Einstein";
		String string4 = "einstein";
		
		System.out.println(helper.checkTwoStringInSensitive(string1, string2));
		System.out.println(helper.checkTwoStringInSensitive(string3, string4));
		break;
		}
	case 20:{
		String input = " My Name is Rocky ";	
		System.out.println(helper.printProperString(input));
		break;
		}
	default :{
		System.out.println("no matching found");
		}

	scan.close();
}
}
}

