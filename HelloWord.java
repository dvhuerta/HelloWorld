public class HelloWord {

    public static void main(String[] args) {
        System.out.println("HelloWorld");
		Chicken chicken;
	chicken = new Chicken();
	chicken.initializeData("Lucy","coffe",2);
	chicken.print();
    }
}