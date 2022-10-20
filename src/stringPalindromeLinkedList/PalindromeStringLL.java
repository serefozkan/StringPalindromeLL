package stringPalindromeLinkedList;

public class PalindromeStringLL {
Eleman bas;
//basi olustur
boolean isPalindrome() {
	//bir eleman olustur, su an basi göstersin
	Eleman eleman=bas;
	//
	
	String str="";
	while(eleman!=null) {
		str=str.concat(eleman.data);
		eleman=eleman.siradaki;
	}

	return isPalindromeUtil(str);


}
 boolean isPalindromeUtil(String str) {
	//kontrol basliyor
	 
	 int length=str.length();
	 for (int i = 0; i < length/2; i++) {
if(str.charAt(i)!=str.charAt(length-i-1)) {
	return false;	
}
	 }	return true;
	 
}


}

