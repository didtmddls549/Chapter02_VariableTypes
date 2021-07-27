package ch02_4_console_in_out;

public class PrintfExample {
  public static void main(String[] args) {
	 int value = 123;
	 System.out.printf("이름:%s%n","김자바");
	 System.out.printf("나이:%d\n",27);
	 System.out.printf("신장:%f\n", 186.5);
	 
	 System.out.printf("상품의 가격: %d원\n", value);
	 System.out.printf("상품의 가격: %6d원\n",value);
	 System.out.printf("상품의 가격: %-6d원\n",value);
	 System.out.printf("상품의 가격: %06d원\n",value);
	 
	 double area = 3.141592 * 10 * 10;
	 System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n",10,area);
	 

}
}
