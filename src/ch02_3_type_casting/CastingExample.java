package ch02_3_type_casting;

public class CastingExample {
     public static void main(String[] args) {
//      ����(�����)����ȯ
//      :~ �ؼ��ϴ� ����� ��ȯ ..
    	 
    	 System.out.println((char)65);
//       Ȯ��(Promotion) : int -----> double �ս�(x) �ڵ�
//       ���(Demotion)  : double ----> int  �ս�(O) ���� -- 0.5 --> 0 
//       ���� = ū
    	 
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
