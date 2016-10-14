package designPatterns;

import java.util.Scanner;

public class PatternShowcase {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternSelector();
	}

	public static void patternSelector() {
		boolean run = true;

		while (run) {
			System.out.println("Select Pattern: ");
			System.out.println("Factory                 (1) ");
			System.out.println("Singleton               (2) ");
			System.out.println("Decorator               (3) ");
			System.out.println("Builder                 (4) ");
			System.out.println("Proxy                   (5)");
			System.out.println("Template                (6) ");
			System.out.println("Adapter                 (7) ");
			System.out.println("Chain Of Responsibility (8) ");
			System.out.println("Strategy                (9) ");
			System.out.println("Fly Weight             (10) ");
			System.out.println("Exit:                  (-1) ");
			int selection = sc.nextInt();
			switch (selection) {
				case 1:
					FactoryPattern();
					break;
				case 2:
					SingletonPattern();
					break;
				case 3:
					DecoratorPattern();
					break;
				// case 4:
				// Factory();
				// break;
				// case 5:
				// Factory();
				// break;
				// case 6:
				// Factory();
				// break;
				// case 7:
				// Factory();
				// break;
				// case 8:
				// Factory();
				// break;
				// case 9:
				// Factory();
				// break;
				// case 10:
				// Factory();
				// break;
				case -1:
					run = false;
					break;
				default:
					System.out.println("Error");
					run = false;
					break;
			}
		}
	}

	public static void FactoryPattern() {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("Square");
		shape2.draw();

		Shape shape3 = shapeFactory.getShape("Rectangle");
		shape3.draw();
	}

	public static void SingletonPattern() {
		Singleton tmp = Singleton.getInstance();
		tmp.secureMethod();
	}

	public static void DecoratorPattern() {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		System.out.println("\ncircle.Draw() ");
		circle.draw();

		System.out.println("\nredCircle.Draw() ");

		redCircle.draw();

		System.out.println("\nredRectangle.Draw()\n ");

		redRectangle.draw();
	}

}
