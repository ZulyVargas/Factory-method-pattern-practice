package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Pentagon class that implements the Shape interface and returns the number of edges 
 * that the represented figure has
 */
public class Pentagon implements Shape {
	
	/**
	 * Returns the number of edges of a pentagon
	 * @return Integer with the number of edges of a pentagon 
	 */
	public int getNumberOfEdges() {
		return 5;
	}
}
