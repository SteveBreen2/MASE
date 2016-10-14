package productionCode;

public class StudentGrade {

	public char Grade(int gradeParam){
		
		char gradeLetter = 0;
		
		if(gradeParam>=85){
			gradeLetter='A';
		}
		else if(gradeParam>=70){
			gradeLetter='B';
			
		}
		else if(gradeParam>=55){
			gradeLetter='C';
			
		}
		else if(gradeParam>=40){
			gradeLetter='D';
			
		}
		else if(gradeParam>=25){
			gradeLetter='E';
			
		}
		else {
			gradeLetter='F';
			
		}
		
		return gradeLetter;}
	

	
}
