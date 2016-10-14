package testCode;

import static org.junit.Assert.*;

import org.junit.Test;

import productionCode.StudentGrade;

public class StudentGradeTest {
	@Test
	public void TestA() {
		StudentGrade s = new StudentGrade();
		assertEquals('A', s.Grade(85));
	}

	@Test
	public void TestB() {
		StudentGrade s = new StudentGrade();
		assertEquals('B', s.Grade(70));
	}

	@Test
	public void TestC() {
		StudentGrade s = new StudentGrade();
		assertEquals('C', s.Grade(55));
	}

	@Test
	public void TestD() {
		StudentGrade s = new StudentGrade();
		assertEquals('D', s.Grade(40));
	}

	@Test
	public void TestE() {
		StudentGrade s = new StudentGrade();
		assertEquals('E', s.Grade(25));
	}

	@Test
	public void TestF() {
		StudentGrade s = new StudentGrade();
		assertEquals('F', s.Grade(1));
	}

}
