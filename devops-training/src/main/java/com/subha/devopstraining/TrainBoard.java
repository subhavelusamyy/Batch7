package com.subha.devopstraining;

public class TrainBoard {

	/*public static void main(String[] args) {

		String io = "niten";
		System.out.println(io);
		char[] temp = io.toCharArray();
		boolean flag =true;
		for(int i=0,j=temp.length-1;i<temp.length/2;i++,j--) {
			
			if(temp[i]!=temp[j]) {
				flag =false;
				break;
			}
		}
		if(flag == true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}*/

	public static void main(String[] args) {

		String io = "this is javatpoint";
		System.out.println(io);
		String d ="";
		String[] strArray = io.split("\\s");
		for (String string : strArray) {
			char[] array=string.toCharArray();
			String str="";
			for(int i=string.length()-1;i>=0;i--) {
				str = str+array[i];
			}
			String a =str.substring(0, 1);
			String b =str.substring(1);
			String c= a+b.toUpperCase()+" ";
			d =d+c;
		}
		System.out.println(d.trim());
			}
	
}
