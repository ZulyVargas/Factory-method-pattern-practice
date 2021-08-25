package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

/**
 * ShapeFactory class that implements the factory pattern using the switch-case statement  
 */
public class ShapeFactory {
	
	/**
	 * Static method that is responsible for creating a figure taking into account the given type
	 * @param type Type of the new figure to create
	 * @return returns an instance of the given type
	 * @throws IllegalArgumentException
	 */
	public static Shape create (RegularShapeType type) throws IllegalArgumentException{
		
		switch (type) {
		case Triangle:
			return new Triangle();
			
		case Quadrilateral:
			return new Quadrilateral();
		
		case Pentagon:
			return new Pentagon();
		
		case Hexagon:
			return new Hexagon();
			
		default:
			throw new IllegalArgumentException();
		}
	}	
		
}
