package ch02_3_type_casting;

public class CastingExample {
     public static void main(String[] args) {
//      강제(명시적)형변환
//      :~ 해석하는 방법을 변환 ..
    	 
    	 System.out.println((char)65);
//       확장(Promotion) : int -----> double 손실(x) 자동
//       축소(Demotion)  : double ----> int  손실(O) 강제 -- 0.5 --> 0 
//       작은 = 큰
    	 
    	 int iv = 127;
    	 iv = 1000000;
    	 byte bv = (byte)iv;
    	 System.out.println(bv);
    	 
//       (char) <------ int...long...
    	 double dv = 3.14;
    	 iv = (int)dv;
    	 
    	 System.out.println(iv);
    	 
    	 //"7810011111111"
    	//int number =(int)"7810011111111";
    	// System.out.println();
    	 
    	 int intValue = 44032;
    	 char charValue = (char) intValue;
    	 
    	 System.out.println(charValue);
    	 
    	 long longValue = 500;
    	 intValue = (int) longValue;
    	 System.out.println(intValue);
    	 
    	 double doubleValue = 3.14;
    	 intValue = (int) doubleValue;
    	 System.out.println(intValue);
	}
}
