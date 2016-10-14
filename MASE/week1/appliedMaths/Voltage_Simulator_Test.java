package appliedMaths;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Voltage_Simulator_Test {

	double exampleVoltage;
	double exampleAppliedVoltage;
	double exampleTime;
	double exampleResistance;
	double exampleCapacitance;

	@Before
	public void startup() {
		exampleVoltage = 1.03 * Math.pow(10, -3);
		exampleAppliedVoltage = 9;
		exampleTime = -10 * Math.pow(10, -6);
		exampleResistance = 50 * Math.pow(10, 3);
		exampleCapacitance = 1.75 * Math.pow(10, -6);
	}

	@Test
	public void voltageFormulaTest() {
		assertEquals(exampleVoltage,Voltage_Simulator.voltageFormula(exampleAppliedVoltage,exampleTime,exampleResistance,exampleCapacitance),.01);
	}

}
