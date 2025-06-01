package com.vr.task;

public class StudentMarks {
	public static void main(String[]args) {
		int maths=60;
		int physics=50;
		int chemistry=55;
		int english=67;
		int social=77;
		int total=maths+physics+chemistry+english+social;
		int average=total/5;
		System.out.println("total marks: "+total+"marks");
		System.out.println("average:"+average);
		if(maths<40||physics<40||chemistry<40||english<40||social<40);
		{
			System.out.println("result:fail");
		}
		 
		{
			if (average>=60)
			{
				System.out.println("result:first division");
		}
		  else if(average>=50) {
			System.out.println("result:second division");
		}
		 else if(average>=40) {
			System.out.println("result:third division");
		}
		 else {
			System.out.println("result:fail");
		}
	}
 }
}