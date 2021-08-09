
public class Application {
       public static void main(String[]args) {
    	   Drink.printInfo();
    	   System.out.println();
    	   HotDrink.printInfo();
    	   System.out.println();
    	   SportDrink.printInfo();
    	   System.out.println();
    	   ColdDrink.printInfo();
    	   

       }
}

class Drink {
	static String name = "Coca cola";
	
	static void printInfo() {
		System.out.println("------------DRINK-----------");
		System.out.printf("Text:|%21s|\n",name);
		System.out.println("----------------------------");
		
	}
	
}

class HotDrink extends Drink{
	static float temperature = 65.00f;
	static void printInfo() {
		System.out.println("------------DRINK-----------");
		System.out.printf("Temperature: |%13s|\n",temperature);
		System.out.println("----------------------------");
		
	}
}

class SportDrink extends Drink{
	static String type = "Isotonic";
	static void printInfo() {
		System.out.println("------------DRINK-----------");
		System.out.printf("Type:|%21s|\n",type);
		System.out.println("----------------------------");
		
	}
}

class ColdDrink extends Drink{
	static float lowTemperature = -12.00f;
	static void printInfo() {
		System.out.println("------------DRINK-----------");
		System.out.printf("Temperature:|%14s|\n",lowTemperature);
		System.out.println("----------------------------");
		
	}
}