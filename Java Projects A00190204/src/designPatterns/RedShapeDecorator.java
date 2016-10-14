package designPatterns;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratedShapeParam) {
		super(decoratedShapeParam);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw(){
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape){
		System.out.println("Border Colour: Red");
	}

}
