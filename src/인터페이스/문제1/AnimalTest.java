package 인터페이스.문제1;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);

		for (int i = 1; i <= 3; i++) {
			System.out.printf("%d시간 후\n",i);
			dog.run(i);
			chicken.run(i);
			fly(cheatableChicken, i);
		}
	}

	public static void fly(Cheatable cheatable, int i){
		if(cheatable instanceof Chicken)
			cheatable.fly(i);
	}
}
