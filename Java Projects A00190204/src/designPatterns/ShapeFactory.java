package designPatterns;

public class ShapeFactory {

	public Shape getShape(String shapeParam) {
		if (shapeParam == null) {
			return null;
		}
		if (shapeParam.equalsIgnoreCase("Square")) {
			return new Square();
		} else if (shapeParam.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (shapeParam.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		return null;
	}
}