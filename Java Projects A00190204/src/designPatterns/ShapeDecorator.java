package designPatterns;

public abstract class ShapeDecorator implements Shape{
	protected Shape decoratedShape;
	
	//Constructor
	public ShapeDecorator(Shape decoratedShapeParam){
		decoratedShape=decoratedShapeParam;
	}
	public void draw(){
		decoratedShape.draw();
	}

}
