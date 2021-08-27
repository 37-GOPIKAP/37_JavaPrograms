/*Create an Arithmetic package that has classes and interface for the 4 basic arithmetic operations.
Test the package by implementing all operations on two given numbers.*/
import Arithmetic.*;
public class package2
{
	public static void main(String args[])
	{
		Addition ad=new Addition();
		ad.add();
		Subtract su=new Subtract();
		su.diff();
		Multiplication mu=new Multiplication();
		mu.pro();
		Division di=new Division();
		di.divi();
	}
}