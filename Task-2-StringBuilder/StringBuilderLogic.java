package logic;

public class StringBuilderLogic {
	
	public String strBuilderToString (StringBuilder input) {
		String output = input.toString();
		return output;
	}

	public String addStringToStringBuilder ( StringBuilder input1 ,String input2)
	{	
		String output = (input1.append(input2)).toString();
		return output;
	}
	
	public String addFourStringWith ( StringBuilder input1 ,String[] input2)
	{	StringBuilder strBuilder = input1.append("#");
		int len = input2.length;
		for (int i = 0; i <len; i++) {
			if(i==len-1) {
				strBuilder = strBuilder.append(input2[i]);
			}
			else
			{
				strBuilder = strBuilder.append(input2[i]).append("#");
			}
	}
		String output = strBuilder.toString();
		return output;
	}
	public String printStrBuilderWithSpace ( StringBuilder input1 ,String input2)
	{	 
	 	 String str1 = input1.toString();
	 	 String str2 = " " + input2 +" ";
	 	 String output = str1.replaceAll(" ",str2 );
		
		return output ;
	}
	
	public String delFirstString( StringBuilder input)
	{	 
		String str = input.toString();
		String []strArr = str.split(" ");
		int len = strArr.length;
		String output = "";
		for (int i = 0; i < len; i++) {
			if(i == 0) {
				output = output.replaceAll(strArr[0], "");
			} else {
				output = output.concat(strArr[i]) ;
			}
		
		} 
		return output ;
	}
	
	public String printWith( StringBuilder input)
	{	 
		String output = input.toString();
	 	 output = output.replaceAll(" ","-");
		return output ;
	}
	
	public String reverseString( StringBuilder input)
	{	String str = input.toString();
		char[] output  = str.toCharArray();
	String reverse = "";
	int len = output.length;
	for (int i = len-1; i >=0; i--) {
		String temp = String.valueOf(output[i]);
		reverse = reverse.concat(temp);	
		}
	return reverse;
//	 	 input1 = input1.reverse();
//	 	String output = input1.toString();
//		return output ;
	}
	public String deleteIndex6To8( StringBuilder input)
	{	 
		
		 	input = input.delete(5, 8);
		 	String output = input.toString();
			return output ;
	}
	

	public String printIndex6To8With( StringBuilder input1 , String input2 )
	{	 
		input1 = input1.replace(5,8, input2);
	 	String output = input1.toString();
		return output ;
	
	}
	public int findFirstIndexOf( StringBuilder input1 , String input2 )
	{	 
		int output = input1.indexOf(input2, 0);
	 
		return output ;
	}
	public int findLastIndexOf( StringBuilder input1 , String input2 )
	{	 
		String str = input1.toString();
		int output = str.lastIndexOf(input2);
	 
		return output ;
	}
}


