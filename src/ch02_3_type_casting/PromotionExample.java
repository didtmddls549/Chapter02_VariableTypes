package ch02_3_type_casting;

public class PromotionExample {

	public static void main(String[] args) {

//       타입(자료형) 변환
//       1. 자동(암묵적) : 컴파일러
//       2. 강제 (명시적)
		
//       값 허용범위가 큰 타입 = 작은타입
//         "값 손실"
//		 byte by = 127;
//		 int  iv = by;
		 
//       byte(1) short(2)   int(4)  long(8)   float(4)  double(8)
//                char(2)
//       (큰)  =  (작은)  자동형변환
//		 int iv = 999999999;
//		 long lv = 999999999999_999999L;
//		 float fv = 99999999999999999999_9999999999999999.0f;
		 
//		 System.out.println(5.0);
		
		 byte byteValue = 10;
		 int  intValue = byteValue;
		 System.out.println("intValue:" + intValue);
		 
		 char charValue = '가';
		 intValue = charValue;
		 System.out.println("가의 유니코드:" + intValue);
		 
		 intValue = 50;
		 long longValue = intValue;
		 System.out.println("longValue:" + longValue);
		 
		 longValue = 100;
		 float floatValue = longValue;
		 System.out.println("floatValue:" + floatValue);
		 
		 floatValue = 100.5F;
		 double doubleValue = floatValue;
		 System.out.println("doubleValue:" + doubleValue);
		 
		 
		
//      "값 손실" 발생 여부 		 
//		System.out.println((char)65);

	}

}
