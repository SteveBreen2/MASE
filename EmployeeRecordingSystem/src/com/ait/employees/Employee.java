	package com.ait.employees;

	public class Employee {
		private String ppsNumber;
		private String name;
		int age;

		public Employee() {
			this.name = "";
			this.ppsNumber = "";
			this.age = 0;
		}

		public String getPpsNumber() {
			return ppsNumber;
		}

		public void setPpsNumber(String ppsNumber) {
			this.ppsNumber = ppsNumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}
