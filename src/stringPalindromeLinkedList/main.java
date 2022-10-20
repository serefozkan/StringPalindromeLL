package stringPalindromeLinkedList;

import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PalindromeStringLL list=new PalindromeStringLL();
list.bas=new Eleman("n");
list.bas.siradaki=new Eleman("a");
list.bas.siradaki.siradaki=new Eleman("l");
list.bas.siradaki.siradaki.siradaki=new Eleman("a");
list.bas.siradaki.siradaki.siradaki.siradaki=new Eleman("x");

if(list.isPalindrome()) {
	System.out.println("yes! your string is a palindrome");
	
}else {
	System.out.println("No! your string is not a palindrome");
}
	}

}
