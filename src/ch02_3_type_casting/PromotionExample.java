package ch02_3_type_casting;

public class PromotionExample {

	public static void main(String[] args) {

//       Ÿ��(�ڷ���) ��ȯ
//       1. �ڵ�(�Ϲ���) : �����Ϸ�
//       2. ���� (�����)
		
//       �� �������� ū Ÿ�� = ����Ÿ��
//         "�� �ս�"
//		 byte by = 127;
//		 int  iv = by;
		 
//       byte(1) short(2)   int(4)  long(8)   float(4)  double(8)
//                char(2)
//       (ū)  =  (����)  �ڵ�����ȯ
//		 int iv = 999999999;
//		 long lv = 999999999999_999999L;
//		 float fv = 99999999999999999999_9999999999999999.0f;
		 
//		 System.out.println(5.0);
		
		 byte byteValue = 10;
		 int  intValue = byteValue;
		 System.out.println("intValue:" + intValue);
		 
		 char charValue = '��';
		 intValue = charValue;
		 System.out.println("���� �����ڵ�:" + intValue);
		 
		 intValue = 50;
		 long longValue = intValue;
		 System.out.println("longValue:" + longValue);
		 
		 longValue = 100;
		 float floatValue = longValue;
		 System.out.println("floatValue:" + floatValue);
		 
		 floatValue = 100.5F;
		 double doubleValue = floatValue;
		 System.out.println("doubleValue:" + doubleValue);
		 
		 
		
//      "�� �ս�" �߻� ���� 		 
//		System.out.println((char)65);

	}

}
