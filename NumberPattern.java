package com.vr.task;
import java.util.Scanner;
public class NumberPattern
{
  public static void main(String[]args)
  {
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("enter number of rows:");
	  int rows=scanner.nextInt();
	  for(int i=rows;i>=1;i--) {
		  for(int j=1;j<=i;j++) {
			System.out.println(j+" ");
			  
		  }
		  System.out.println();
	  }
	  scanner.close();
  }
}
