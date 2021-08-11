
public class DataFlowApp {
       public static void main(String[]args) {
    	  
    	   System.out.println("The data was transformed from int to byte:" + DataTransformer.integerToByte(26));
    	   System.out.println("The data was transformed from  to byte:" + DataTransformer.byteToInteger((byte) 100));
    	   System.out.println("The data was transformed from double to integer:" + DataTransformer.doubleToInteger(254.0d));
    	   System.out.println("The data was transformed from integer to double:" + DataTransformer.integerToDouble(254));
    	   System.out.println("The data was transformed from short to integer:" + DataTransformer.shortToInteger(254));
    	   System.out.println("The data was transformed from integer to short:" + DataTransformer.integerToShort(32560));
    	   
    	   double value = 1.5;
    	   short value_1 = (short)value;
    	   System.out.println(value);
    	   System.out.print(value_1);
       }
       
       
}

class DataTransformer {
	static byte integerToByte(int value){
		if(value>=Byte.MIN_VALUE && value<=Byte.MAX_VALUE) {
		    value = (byte)value;
		}else {
			System.err.print("WARNING! the value 10000 overflows \"byte\" range. DATA will be lost");
		}
		return (byte) value;
	}
	
	static int byteToInteger(byte value) {
		if(value<=Integer.MIN_VALUE && value>=Integer.MAX_VALUE) {
			System.err.println("WARNING! the value is overflowing \"byte\" range. DATA will be lost");
		}
		
		return(int)value;
	} 
	
	static int doubleToInteger(double value) {
		if(value>=Integer.MIN_VALUE && value<=Integer.MAX_VALUE) {
			value =(int)value;
		}else {
			System.err.println("Warning! The value is overflowing cause \"double\" range.Data will be lost");
		}
		return(int)value;
	}
	
	static double integerToDouble(int value) {
		if(value<=Double.MIN_VALUE && value>=Double.MAX_VALUE) {
			System.err.println("WARNING! the value is overflowing \"byte\" range. DATA will be lost");
		}
		return(double)value;
	}
	
	static short shortToInteger(int value){
		if(value<=Integer.MIN_VALUE && value>=Integer.MAX_VALUE) {
			System.err.printf("Warning. Your value is overflowing cause it isnt match with \"short\" range.DATA will be lost");
		}
		return(short)value;
	}
	
	static int integerToShort(int value) {
		if(value>=Short.MIN_VALUE && value<=Short.MAX_VALUE) {
			value=(short)value;
		}else {
			System.err.printf("Warning. Your value is overflowing cause it isnt match with \"int\" range.DATA will be lost");
		}
		return value;
	}
}
