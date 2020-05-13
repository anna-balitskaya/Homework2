
public class Cat extends Animal{
	
	String name;
	int age;
	String longwool;
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public void meow(){
		System.out.println("Cat is meowing");
	}
	public void about() {
		System.out.println("Cat's name is "+name+","+"Cat is "+age+" years old "+","+"he "+longwool);
	}

}
