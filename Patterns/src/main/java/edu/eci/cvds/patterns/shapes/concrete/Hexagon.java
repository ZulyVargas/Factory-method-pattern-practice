package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Hexagon class that implements the Shape interface and returns the number of edges
 *  that the represented figure has
 */
public class Hexagon implements Shape {
	
	/**
	 * Returns the number of edges of a hexagon
	 * @return Integer with the number of edges of a hexagon 
	 */
	public int getNumberOfEdges() {
		return 6;
	}
}
