package les22part1;

public class Main {

	public static void main(String[] args) {
		
		PrintableFrog eat = () -> System.out.println("� ��");
		PrintableFrog sleep = () -> System.out.println("� ����");
		PrintableFrog swim = () -> System.out.println("� ������");
		PrintableFrog walk = () -> System.out.println("� �����");

		eat.print();
		sleep.print();
		swim.print();
		walk.print();
	}

}
interface PrintableFrog{
	
	public void print();
}