package edu.eci.cvds.patterns.shapes;

/**
 * Shape interface used by the Triangle, Quadrilateral, Pentagon, and Hexagon classes
 */
public interface Shape {
	
	/**
	 * Returns the number of edges of a figure
	 * @return Integer with the number of edges of a figure 
	 */
    public int getNumberOfEdges();
}
