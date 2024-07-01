package 다형성.과제2;

public class TestShape {
	public static void main(String[] args) {
		Shape [] shape = new Shape[2];

		Circle circle = new Circle();
		circle.setName("원");
		circle.setRadius(10);
		shape[0] = circle;
		shape[0].calculationArea();

		Rectangular rectangular = new Rectangular();
		rectangular.setName("원");
		rectangular.setWidth(10);
		rectangular.setHeight(20);
		shape[1] = rectangular;
		shape[1].calculationArea();
	}
}