package les22part2;

public class Application {

	public static void main(String[] args) {
		Pet cow =()->System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");
		Pet cat = ()->System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");
		Pet dog = ()->System.out.println("ί κξπξβΰ- Μσσσ-Μσσσ");
		
		cow.voice();
		cat.voice();
		dog.voice();
	}

}
interface Pet{
	void voice();
}