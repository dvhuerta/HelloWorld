public class HelloWord {
    public static void main(String[] argsOne) {
		System.out.println("");
		System.out.println("***HelloWorld***");
		System.out.println("");
		System.out.println(" -First Chicken");
        Chicken chickenOne;
	chickenOne = new Chicken();
	chickenOne.initializeData("Lucy","coffe",2);
	chickenOne.print();
	chickenOne.layAnEgg();
	chickenOne.drink();
	chickenOne.poop();
		System.out.println("");
		System.out.println(" -Second Chicken");
		Chicken chickenTwo;
	chickenTwo = new Chicken();
	chickenTwo.initializeData("Cuqui","white",1);
	chickenTwo.print();
	chickenTwo.layAnEgg();
	chickenTwo.negationDrink();
	chickenTwo.negationPoop();
		System.out.println("");
		System.out.println(" -Third Chicken");
		Chicken chickenThree;
	chickenThree = new Chicken();
	chickenThree.initializeData("Aby","black",4);
	chickenThree.print();
	chickenThree.negationLayAnEgg();
	chickenThree.drink();
	chickenThree.negationPoop();
		System.out.println("");
		System.out.println(" -Fourth Chicken");
		Chicken chickenFour;
	chickenFour = new Chicken();
	chickenFour.initializeData("Paty","yellow",3);
	chickenFour.print();
	chickenFour.negationLayAnEgg();
	chickenFour.negationDrink();
	chickenFour.poop();	
	}
}