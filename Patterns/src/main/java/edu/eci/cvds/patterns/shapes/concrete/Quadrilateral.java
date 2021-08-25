package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Quadrlateral class that implements the Shape interface and returns the number of edges 
 * that the represented figure has
 */
public class Quadrilateral implements Shape {
	
	/**
	 * Returns the number of edges of a quadrilateral
	 * @return Integer with the number of edges of a quadrilateral 
	 */
	public int getNumberOfEdges() {
		return 4;
	}
}
