package les22part2;

public class Application {

	public static void main(String[] args) {
		Pet cow =()->System.out.println("� ��� - �����-�����");
		Pet cat = ()->System.out.println("� ��- �����-�����");
		Pet dog = ()->System.out.println("� ������- ����-����");
		
		cow.voice();
		cat.voice();
		dog.voice();
	}

}
interface Pet{
	void voice();
}