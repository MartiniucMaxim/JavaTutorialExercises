
public class DataWrapApp {
	 
     public static void main(String[]args) {
    	System.out.println(DataWrapper.wrapRound("Java"));
    	System.out.println(DataWrapper.wrapSquare("Array"));
    	System.out.println(DataWrapper.wrapAngle("Tag"));
    	System.out.println("------------------------------");
    	System.out.println(DataWrapper.wrapIntRound(1));
    	System.out.println(DataWrapper.wrapDoubleRound(1.5));
    	System.out.println(DataWrapper.wrapCharRound('C'));
    	
    	
     }
     
     class DataWrapper {
    	 static String wrapRound(String text) {
    		 return "(" + text + ")";
    	 }
    	 
    	 static String wrapSquare(String text) {
    		 return "[" + text + "]"; 
    	 }
    	 static String wrapAngle(String text) {
    		 return "<" + text + ">";
    	 }
    	
    	 static String wrapIntRound(int value) {
    		 return "(" + value + ")";
    	 }
    	 
    	 static String wrapDoubleRound(double value) {
    		 return "(" + value + ")";
    	 }
    	 
    	 static String wrapCharRound(char value) {
    		 return "(" + value + ")";
    	 }
    	 
     }
}
