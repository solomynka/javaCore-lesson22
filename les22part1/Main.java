package les22part1;

public class Main {

	public static void main(String[] args) {
		
		PrintableFrog eat = () -> System.out.println("я њм");
		PrintableFrog sleep = () -> System.out.println("я сплю");
		PrintableFrog swim = () -> System.out.println("я плаваю");
		PrintableFrog walk = () -> System.out.println("я гул€ю");

		eat.print();
		sleep.print();
		swim.print();
		walk.print();
	}

}
interface PrintableFrog{
	
	public void print();
}