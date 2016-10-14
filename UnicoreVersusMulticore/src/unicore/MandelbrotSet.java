package unicore;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class MandelbrotSet {

	final static String fileName = "MandleBrot";
	static double newRealNumber;
	static double oldRealNumber;
	static double newImaginaryNumber;
	static double oldImaginaryNumber;
	static double realPixel;
	static double imaginaryPixel;
	static double zoom = 1;
	static int pixelColour;
	static int maxIterations = 100000;
	static int screenHeight = 1080;
	static int screenWidth = 1920;
	public static long startTime = System.currentTimeMillis();

	public static void main(String[] args) {
		int type = BufferedImage.TYPE_INT_ARGB;
		BufferedImage image = new BufferedImage(screenWidth, screenHeight, type);

		for (int pixelY = 0; pixelY < screenHeight; pixelY++) {
			for (int pixelX = 0; pixelX < screenWidth; pixelX++) {

				realPixel = 1.5 * (pixelX - screenWidth / 2) / (.5 * screenWidth);
				imaginaryPixel = (pixelY - screenHeight / 2) / (.5 * screenHeight);

				newRealNumber = newImaginaryNumber = oldRealNumber = oldImaginaryNumber = 0;

				int iteration = 0;
				for (int i = 0; i < maxIterations; i++) {

					oldRealNumber = newRealNumber;
					oldImaginaryNumber = newImaginaryNumber;

					newRealNumber = Math.pow(oldRealNumber, 2) - Math.pow(oldImaginaryNumber, 2) + realPixel;
					newImaginaryNumber = 2 * oldRealNumber * oldImaginaryNumber + imaginaryPixel;
					iteration++;
					if (Math.pow(newRealNumber, 2) + Math.pow(newImaginaryNumber, 2) > 4) {
						break;
					}
				}

				if (iteration < maxIterations) {
					// System.out.println("Iterations["+iteration+"]");
					pixelColour = Color.HSBtoRGB(iteration % 256, 255, 255 * iteration);
				} else {
					// System.out.println("Called iterations>=max");
					pixelColour = Color.HSBtoRGB(iteration % 256, 255, 0);
				}
				image.setRGB(pixelX, pixelY, pixelColour);
				iteration = 0;
			}

		}

		try {
			ImageIO.write(image, "png", new File(fileName + ".png"));
			System.out.println("Uni-core Finished Executing in: " + (System.currentTimeMillis() - startTime) + "ms");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Writing Image");
		}
	}
}