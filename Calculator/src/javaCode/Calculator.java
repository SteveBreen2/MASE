package javaCode;
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.File; 
import java.io.IOException; 
import java.util.Map; 
 
import javax.imageio.ImageIO; 
 
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.ChartUtilities; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.axis.NumberAxis; 
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.renderer.xy.XYSplineRenderer; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries; 
import org.jfree.data.xy.XYSeriesCollection; 
import org.jfree.ui.RectangleInsets;
public class Calculator {

	public static void main(String[] args) {

	}
}



public void drawChart(String filename, int width, int height)
		throws IOException {
	// Create plot
	NumberAxis xAxis = new NumberAxis(xAxisLabel);
	NumberAxis yAxis = new NumberAxis(yAxisLabel);
	XYSplineRenderer renderer = new XYSplineRenderer();
	XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
	plot.setBackgroundPaint(Color.lightGray);
	plot.setDomainGridlinePaint(Color.white);
	plot.setRangeGridlinePaint(Color.white);
	plot.setAxisOffset(new RectangleInsets(4, 4, 4, 4));

	// Create chart
	JFreeChart chart = new JFreeChart(chartTitle,
			JFreeChart.DEFAULT_TITLE_FONT, plot, true);
	ChartUtilities.applyCurrentTheme(chart);
	ChartPanel chartPanel = new ChartPanel(chart, false);

	// Draw png
	BufferedImage bi = new BufferedImage(width, height,
			BufferedImage.TYPE_INT_BGR);
	Graphics graphics = bi.getGraphics();
	chartPanel.setBounds(0, 0, width, height);
	chartPanel.paint(graphics);
	ImageIO.write(bi, "png", new File(filename));
}