package logic;
//methods
public class StringLogic {

	public int stringLength (String strlen) {
		int strLength =  strlen.length();
		return strLength;
	}
	public char[] charArr(String input){
		char[] arr = input.toCharArray();
		return arr;
	}
	public char findPenUltimate(String input) {
		char output = input.charAt(input.length()-2);
		return output;
	}
	public int findNoOfOccurance(String input1,char input2) {
		int count=0;
		int len = input1.length();
		for (int i = 0; i < len; i++) {
		if(input1.charAt(i)==input2) {
			count++;
		}
	}
		return count;
	}
	public int  findGreatestPosition( String input1, char input2) {
		int output = input1.lastIndexOf(input2);
		return output;
	}
	public String printLast5(String input) {
		String output = input.substring(input.length()-5, input.length());
		return output;
	}
	public String printFirst3(String input) {
		String output = input.substring(0,3);
		return output;
	}
	public String replaceFirstThree(String input1, String input2) {
		String output = input2 + input1.substring(3, input1.length());
		return output;
	}
	public boolean startsWith(String input1, String input2) {
		boolean output =  input1.substring(0,3).contains(input2);;
		return output;
	}
	public boolean endsWith(String input1, String input2) {
		boolean output = input1.substring(input1.length()-2,input1.length()).contains(input2);
		return output;
	}
	public String covertToLowercase(String input) {
		String output = input.toLowerCase();
		return output;
	}
	public String covertToUppercase(String input) {
		String output = input.toUpperCase();
		return output;
	}
	public String stringReverse(String input) {
		char[] output  = charArr(input);
		String reverse = "";
		int len = output.length;
		for (int i = len-1; i >=0; i--) {
			String temp = String.valueOf(output[i]);
			reverse = reverse.concat(temp);	
			}
		return reverse;
	}
	public String toPrintWithoutSpace(String input) {
		String output = input.replaceAll(" ", "");
		return output;
	}
	public String encloseToStringArray(String input) {
		String []strArr = input.split(" ");
		String output = "{ ";
		int len = strArr.length;
		for (int i = 0; i < len; i++) {
			if(i == len -1) {
				output = output.concat("\""+strArr[i]+"\"");
			} else {
				output = output.concat("\""+strArr[i]+"\"").concat(" ,");
			}
		}
		output = output.concat("}");
		return output;
//		for (int i = 0; i < input2.length; i++){
//			String temp = " "+ String.valueOf(input2[i]);
//			 input3 =input3.concat(temp)+" ,";
//			}
//		String input4 = input3.replaceAll(" ","\"");
//		String input5 = input4.substring(0, input4.length()-1);
//		return input5;
	}
	public String mergeEachString(String[] input)
	{	
		String output = "";
		int len = input.length;
		for (int i = 0; i < len; i++) {
			if(i == len-1) {
				output = output.concat(input[i]);
			} else {
				output = output.concat(input[i]).concat("-");
			}
		}
		return output;
	}
	public boolean checkTwoStringSensitive(String input1, String input2) {
		boolean output = input1.equals(input2);
		return output;
	}
	public boolean checkTwoStringInSensitive(String input1, String input2) {
		/*String input3 = input1.toLowerCase();
		String input4 = input2.toLowerCase();
		boolean input = input3.equals(input4);*/
		boolean output = input1.equalsIgnoreCase(input2);
		return output;
	}
	public String printProperString(String input)
	{	
		String output = input.trim();
		return output;
	}
}

