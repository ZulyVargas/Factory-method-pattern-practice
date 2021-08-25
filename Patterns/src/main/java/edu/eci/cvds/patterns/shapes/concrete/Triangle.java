package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Triangle class that implements the Shape interface and returns the number of edges 
 * that the represented figure has
 */
public class Triangle implements Shape {
	
	/**
	 * Returns the number of edges of a triangle
	 * @return Integer with the number of edges of a triangle 
	 */
    public int getNumberOfEdges() {
        return 3;
    }
}
