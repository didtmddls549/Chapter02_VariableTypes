package ch02_4_console_in_out;

public class PrintfExample {
  public static void main(String[] args) {
	 int value = 123;
	 System.out.printf("�̸�:%s%n","���ڹ�");
	 System.out.printf("����:%d\n",27);
	 System.out.printf("����:%f\n", 186.5);
	 
	 System.out.printf("��ǰ�� ����: %d��\n", value);
	 System.out.printf("��ǰ�� ����: %6d��\n",value);
	 System.out.printf("��ǰ�� ����: %-6d��\n",value);
	 System.out.printf("��ǰ�� ����: %06d��\n",value);
	 
	 double area = 3.141592 * 10 * 10;
	 System.out.printf("�������� %d�� ���� ����: %10.2f\n",10,area);
	 

}
}
