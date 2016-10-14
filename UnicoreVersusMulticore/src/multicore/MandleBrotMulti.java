package multicore;
import java.io.File;
import java.util.Date;

import javax.imageio.ImageIO;

public class MandleBrotMulti
{
	final static int SCREEN_HEIGHT = 1080, SCREEN_WIDTH = 1920;
	public static long startTime = System.currentTimeMillis();

	public static void main(String[] args) {

			// Top Left Quarter
			MandleBrotThread m1 = new MandleBrotThread("ThreadOne", 0, 0, SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2,startTime);
			// Top Right Quarter
			 MandleBrotThread m2 = new MandleBrotThread("ThreadTwo", SCREEN_WIDTH / 2, 0, SCREEN_WIDTH, SCREEN_HEIGHT / 2,startTime);
			// // Bottom Left Quarter
			 MandleBrotThread m3 = new MandleBrotThread("ThreadThree", 0, SCREEN_HEIGHT / 2, SCREEN_WIDTH / 2, SCREEN_HEIGHT,startTime);
			// // Bottom Right Quarter
			 MandleBrotThread m4 = new MandleBrotThread("ThreadFour", SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2, SCREEN_WIDTH, SCREEN_HEIGHT,startTime);
			 m1.start();
			 m2.start();
			 m3.start();
			 m4.start();

		

			
			

		}
}