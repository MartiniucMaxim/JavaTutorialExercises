import java.util.Scanner;

public class BoxClass {
	public static void main(String[]args) {
		UserInterface.renderMenu();
	    int value;
		//HW:using while/for. If user choose option(yes/no
		int a = UserInterface.scanInt();
	    int b = UserInterface.scanInt();
	    char operation = UserInterface.scanOperation();
	    /*
	     * char option = UserInterface.scanOption();
	     * do{
	     *   switch(operation){
 	     *        .........
	     *   }  
	     *   
	     *   
	     *  
	     *   После того, как мы выполняем вычисление, работает кусок метода методscanOption(), но не могу выполнить ввод данных
	     *   так как потом появляется исключение.
	     *   Как мне выполнить это? пункт do-while()?
	     * } while((choice=='Y')||(choice=='y'))
	     *  
	     */
		
	    //HW: add 2 more operations(additional: you can use switch-case!!!
	    //System.out.print(a + " " +  operation + " "+ b + " = " + AdditionalClass.add(a,b));
	   /* if(operation == '+') {
	    	int value = AdditionalClass.add(a, b);
	    	System.out.print(a + " " +  operation + " "+ b + " = " + AdditionalClass.add(a,b));
	    }
	    if(operation == '-') {
	    	int value = AdditionalClass.sub(a, b);
	    	System.out.print(a + " " +  operation + " "+ b + " = " + AdditionalClass.sub(a,b));
	    }
	    if(operation =='*') {
	    	int value = AdditionalClass.mult(a,b);
	    	System.out.print(a + " " +  operation + " "+ b + " = " + AdditionalClass.mult(a,b));
	    }
	    if(operation =='/') {
	    	int value = AdditionalClass.div(a, b);
	    	System.out.print(a + " " +  operation + " "+ b + " = " + AdditionalClass.div(a,b));
	    } */
	    
	    switch(operation) {
	    case '+':
	    	int value_1 = AdditionalClass.add(a, b);
	    	System.out.print(a + " " +  operation + " "+ b + " = " + AdditionalClass.add(a,b));
	    	break;
	    case '-':
	    	int value_2 = AdditionalClass.sub(a, b);
	    	System.out.print(a + " " +  operation + " "+ b + " = " + AdditionalClass.sub(a,b));
	    	break;
	    case '*':
	    	int value_3 = AdditionalClass.mult(a, b);
	    	System.out.print(a + " " +  operation + " "+ b + " = " + AdditionalClass.mult(a,b));
	    	break;
	    case '/':
	    	int value_4 = AdditionalClass.div(a, b);
	    	System.out.print(a + " " +  operation + " "+ b + " = " + AdditionalClass.div(a,b));
	    	break;
	    default:
	    	System.out.print("Operation is invalid,pls try another operation!!!");
	    	break;
	    } 
	}

}

class AdditionalClass{
	//HW:Add multiplication and division(+)
	static int add(int a,int b) {
		return a + b; 
	} 
	static int sub(int a,int b) {
		return a - b; 
	}
	
	//Умножение
	static int mult(int a, int b) {
		return a * b;
	}
	//Деление
	static int div(int a,int b) {
		return (a / b);
	}
}

class UserInterface{
	static void renderMenu() {
		System.out.println("|-------------------------------|");
		System.out.println("|            CALCULATOR         |");
		System.out.println("|-------------------------------|");
		System.out.println("|           insert numbers:     |");
		System.out.println("|           choose operation:   |");
		System.out.println("|           +,-,/,*             |");
		System.out.println("|-------------------------------|");
		
	}
	 
	
	//Попытка сделать отдельную функцию проверки ввода.
	/*public static char scanOption() {
		char option;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Y for yes or N for no: ");
		option = input.next().charAt(0);
		return option;
	}*/



	static int scanInt() {
		int value;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value:");
	    value = input.nextInt();
		return value;
		
	}
	static char scanOperation() {
		char operation;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter operation:");
		operation = input.next().charAt(0);
		input.close();
		return operation;
		
	}
}