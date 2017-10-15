
public class FinalDemo{
	public static void main(String[] args){
		Name name = new Name("zhang","san");
		Person p = new Person(name);
		System.out.println(p.getName());
	}
}