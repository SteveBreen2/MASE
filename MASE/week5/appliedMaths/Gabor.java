package appliedMaths;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kfitzgerald
 */

public class Gabor {
	CreateImage ci;
	private double lamda = 0;
	private double theta = 0;
	private double varphi = 0;
	private double upsi = 0;
	private double bandW = 0;
	private double B = 0;
	private double sigma = 0;
	private double kappa = 0;
	private static double[][] GaborGrid;
	private static double[][] GaborNorm;

	int size = 0;
	double toRadians = 180 / Math.PI, min = 500, max = -500, mean = 0;;
	int gaussian = 0;
	double rotation;
	double GLFmean = 0;

	// Standard Gabor no quantization
	public Gabor(double l, double t, double v, double u, double b, int sze) {
		lamda = l;
		theta = t / toRadians;
		varphi = v / toRadians;
		upsi = u;
		bandW = b;
		kappa = (2 * Math.PI) / lamda;
		Calculate_Sigma();
		size = sze;
		gaussian = sze / 2;
		GaborGrid = new double[size][size];
		GaborNorm = new double[size][size];
		RunGabor();
		NormaliseImage();
	}

	public void RunGabor() {
		double xApoc=0;
		double yApoc=0;
		int dy=0;
		int ax=0;
		
		for (int i = -gaussian; i <= gaussian; i++) {
			for (int j = -gaussian; j <= gaussian; j++) {
				xApoc= i*Math.cos(theta)+j*Math.sin(theta);
				yApoc= -i*Math.sin(theta)+j*Math.cos(theta);
				 GaborGrid[dy][ax]=(Math.exp(-(Math.pow(xApoc, 2)+(Math.pow(yApoc, 2)*
	                        Math.pow(upsi,2)))/(2*Math.pow(sigma, 2))))*
	                        (Math.cos((kappa*xApoc+varphi)));	
				 //Increment across X
				ax+=1;
			}
			//Reset across X
			ax=0;
			//Increment Y
            dy+=1;
            //Increment gaussian Y e.g. -150  --->  -149  
        }
	}

	public void NormaliseImage() {

		double temp=0;
		

		
		for (int i = 0; i < GaborGrid.length; i++) {
			for (int j = 0; j < GaborGrid.length; j++) {
				if (GaborGrid[i][j] < min) {
					min = GaborGrid[i][j];
				}
				if (GaborGrid[i][j] > max) {
					max = GaborGrid[i][j];
				}

			}
		}
		
		for (int i = 0; i < GaborNorm.length; i++) {
			for (int j = 0; j < GaborNorm[0].length; j++) {

				
				
				   temp = ((((double)(GaborGrid[i][j]-min))/((double)(max-min)))*255);
		             if (temp<=0){
					temp=0;
				}
				GaborNorm[i][j] = temp;
			}
		}

		ci = new CreateImage(GaborNorm, "Gabor");
	}

	private void Calculate_Sigma() {
		B = (1 / Math.PI) * (0.588705011) * ((Math.pow(2, bandW) + 1) / (Math.pow(2, bandW) - 1));
		sigma = B * lamda;
	}
}
