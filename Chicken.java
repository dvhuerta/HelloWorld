public class Chicken{
	private String color;
	private String name;
	private int age;
	public void layAnEgg(){
		System.out.println("(>) The chicken lay an egg");
	}
	public void negationLayAnEgg(){
		System.out.println("(x) The chicken don't lay an egg");
	}
	public void poop(){
		System.out.println("(>) The chicken pooped");
	}
	public void negationPoop(){
		System.out.println("(x) The chicken don't  do poop");
	}
	public void drink(){
		System.out.println("(>) The chicken drank");
	}
	public void negationDrink(){
		System.out.println("(x) The chicken doesn't drink");
	}
	public void print(){
		System.out.println("*The name of the chicken is: "+name+", color: "+color+", age: "+age+" ");
	}
	public void initializeData(String name, String color, int age){
		this.name=name;
		this.color=color;
		this.age=age;
	}
}
	