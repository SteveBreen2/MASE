package appliedMaths;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Voltage_Simulator {

	static DecimalFormat formatter = new DecimalFormat("00.##E0");
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		final double exampleVoltage=1.03*Math.pow(10, -3);
		final double exampleAppliedVoltage=9;
		final double exampleTime=-10*Math.pow(10, -6);
		final double exampleResistance=50*Math.pow(10, 3);
		final double exampleCapacitance=1.75*Math.pow(10, -6);
		double appliedVoltage, voltage, time, resistance, capacitance;

		FormatOutput("Voltage: ",(voltageFormula(exampleAppliedVoltage,exampleTime,exampleResistance,exampleCapacitance)),"volts");
		
		System.out.println("Please Make a selection: ");
		System.out.println("1: Calculate Voltage: ");
		System.out.println("2: Calculate Applied Voltage: ");
		System.out.println("3: Calculate Time: ");
		System.out.println("4: Calculate Resistance: ");
		System.out.println("5: Calculate Capacitance: ");
		int selection = sc.nextInt();
		switch (selection) {
			case (1):
				System.out.println("Enter Applied Voltage");
				appliedVoltage = sc.nextDouble();
				System.out.println("Enter Time");
				time = sc.nextDouble();
				System.out.println("Enter Resistance");
				resistance = sc.nextDouble();
				System.out.println("Enter capacitance");
				capacitance = sc.nextDouble();
				FormatOutput("Voltage ", voltageFormula(appliedVoltage, time, resistance, capacitance), "volts");
				break;

			case (2):
				System.out.println("Enter Voltage: ");
				voltage = sc.nextDouble();
				System.out.println("Enter Time: ");
				time = sc.nextDouble();
				System.out.println("Enter Resistance: ");
				resistance = sc.nextDouble();
				System.out.println("Enter capacitance: ");
				capacitance = sc.nextDouble();
				FormatOutput("Applied Voltage ", appliedVoltageFormula(voltage, time, resistance, capacitance), "volts");

				break;

			case (3):
				System.out.println("Enter Applied Voltage: ");
				appliedVoltage = sc.nextDouble();
				System.out.println("Enter Voltage: ");
				voltage = sc.nextDouble();
				System.out.println("Enter Resistance: ");
				resistance = sc.nextDouble();
				System.out.println("Enter capacitance: ");
				capacitance = sc.nextDouble();
				FormatOutput("Time ", timeFormula(appliedVoltage, voltage, resistance, capacitance), "seconds");
				break;

			case (4):
				System.out.println("Enter Applied Voltage: ");
				appliedVoltage = sc.nextDouble();
				System.out.println("Enter Voltage: ");
				voltage = sc.nextDouble();
				System.out.println("Enter Time: ");
				time = sc.nextDouble();
				System.out.println("Enter capacitance: ");
				capacitance = sc.nextDouble();
				FormatOutput("Resistance", resistanceFormula(appliedVoltage, voltage, time, capacitance), "ohms");
				break;

			case (5):
				System.out.println("Enter Applied Voltage: ");
				appliedVoltage = sc.nextDouble();
				System.out.println("Enter Voltage: ");
				voltage = sc.nextDouble();
				System.out.println("Enter Time: ");
				time = sc.nextDouble();
				System.out.println("Enter Resistance: ");
				resistance = sc.nextDouble();
				FormatOutput("Capacitance", capacitanceFormula(appliedVoltage, voltage, time, resistance), "amps");
				break;

		}
	}

	public static double voltageFormula(double appliedVoltage, double time, double resistance, double capacitance)

	{
		double voltage = (appliedVoltage * (1 - Math.exp(-time / (resistance * capacitance))));
		return voltage;

	}

	public static double timeFormula(double appliedVoltage, double voltage, double resistance, double capacitance)

	{
		double time = -(resistance * capacitance * (Math.log1p(1 - appliedVoltage / voltage)));
		return time;

	}

	public static double resistanceFormula(double appliedVoltage, double voltage, double time, double capacitance)

	{
		double resistance = (-time / (capacitance * (Math.log1p(1 - appliedVoltage / voltage))));
		return resistance;

	}

	public static double capacitanceFormula(double appliedVoltage, double voltage, double time, double resistance)

	{
		double capacitance = (-time / (resistance * Math.log1p(1 - voltage / appliedVoltage)));
		return capacitance;

	}

	public static double appliedVoltageFormula(double voltage, double time, double resistance, double capacitance)

	{
		double appliedVoltage = voltage / (Math.exp(1 - Math.log1p(-time / (resistance * capacitance))));
		return appliedVoltage;

	}

	public static void FormatOutput(String s1, double d, String s2) {
		System.out.println(s1 + " " + d + " or " + formatter.format(d) + " " + s2);
	}

}
