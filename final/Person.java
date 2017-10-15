public class Person{
	private final Name name;
	Person(Name name){
		this.name = name;
	}
	public Name getName(){
		return name;
	}

	public String toString(){
		return name.getFirstName()+" "+name.getLastName();
	}
}