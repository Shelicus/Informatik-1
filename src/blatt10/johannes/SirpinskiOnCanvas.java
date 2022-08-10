package blatt10.johannes;

public class SirpinskiOnCanvas extends RecuOnCanvas {

	@Override
	protected void drawRecursive(Line2D line, int depth) {
		this.beautify(depth);  // Je nach Tiefe kolorieren
   		Point2D midPointBottom = line.getMidPoint();
   		Point2D topPoint = new Point2D(midPointBottom.getX(),
   		midPointBottom.getY() - (int) Math.round(line.getEuclideanLength() 
   				* 1));//sqrtThreeQuarters
   		
   		Line2D leftLine = new Line2D(line.getP1(), topPoint);
   		Line2D rightLine = new Line2D(topPoint, line.getP2());
   		this.drawLine(line);
   		this.drawLine(leftLine);
   		this.drawLine(rightLine);
   		
   		if (depth < 7)
    	{
   			drawRecursive(new Line2D(leftLine.getMidPoint(), rightLine.getMidPoint()),
   					depth + 1);
   			drawRecursive(new Line2D(line.getP1(), midPointBottom), depth + 1);
   			drawRecursive(new Line2D(midPointBottom, line.getP2()), depth + 1);
     	}
    }
	public static void main(String[] args) {
	        new SirpinskiOnCanvas();
	    }
}
