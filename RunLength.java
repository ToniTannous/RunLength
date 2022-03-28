import java.util.Scanner;

public class RunLength{
	public static void main(String[]args){
		Scanner scan=new Scanner (System.in);
		int runlength=1;
		
                 char currentchar      ,      prevchar;
		String output="";

System.out.println("ENTER A STRING:");
String str =scan.nextLine();
currentchar=str.charAt(0);
for (int idx=1;idx<str.length();idx++){
currentchar=str.charAt(idx);
prevchar=str.charAt(idx-1);
if(currentchar!=prevchar|| runlength==9){
output+=""+runlength+prevchar;
runlength=0;
}
runlength++;
}
output+=""+runlength+currentchar;
System.out.println(output);
System.out.println(Math.ceil(4));
}
	}
				