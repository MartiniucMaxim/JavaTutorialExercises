
public class NumberPalindrome {
   public static void main(String[]args) {
	   System.out.println("The number is palindrome?: " + isPalindrome(11212));
   }
   
   static boolean isPalindrome(int number) {
	   int reverse = 0;
	   int lastDigit;
	   int num=number;
	   while(num!=0) {
		   lastDigit =  0;
		   lastDigit = num % 10;
		   reverse = reverse * 10;
		   reverse = reverse + lastDigit;
		   num = num / 10;
	   } if(reverse == number) {
		   return true;
	   } else {
		   return false;
	   }
	   
	   
	   
   }
}
