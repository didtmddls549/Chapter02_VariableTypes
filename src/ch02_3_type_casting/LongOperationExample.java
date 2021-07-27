package ch02_3_type_casting;

public class LongOperationExample {
	public static void main(String[] args) {
//
//    result = num1 ( + - * % )    [byte , char , short , int] num2;
	
		byte value1 = 10;
		int  value2 = 100;
		long value3 = 1000L;

// ? result = v1 + v2 + v3;
//          = 1ong + long; 
		long result = value1 + value2 + value3;
		System.out.println(result);
	}

}
