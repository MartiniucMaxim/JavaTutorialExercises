import java.util.Scanner;


public class SimpleClasses {
   public static void main(String[]args) {
	   Scanner keyboard = new Scanner(System.in);
	   //SomeClass add = new SomeClass();
	   //SomeClass substruct = new SomeClass();
	   System.out.print("Input your option: ");
	   int option = keyboard.nextInt();
	   switch(option) {
	      case 1: 
		     SomeClass add = new SomeClass();
		     System.out.println("Addition is: "  + SomeClass.add(30,40));
		     break;
	      case 2:  
	    	  SomeClass substruct = new SomeClass();
	    	  System.out.println("Addition is: "  + SomeClass.substruct(30,40));		   
	    	  break;
	      default:
	    	  System.out.println("The're is no option");
	    	  break;
	   }
   }
}

class SomeClass{
      static int add(int a, int b) {
    	  return a + b;
      }
      
      static int substruct(int a, int b){
    	  return a - b; 
      }
      
      static int scanInt() {
    	  Scanner in = new Scanner(System.in);
    	  System.out.print("enter a value: ");
    	  int value  = in.nextInt();
    	  return value;
      }
}



