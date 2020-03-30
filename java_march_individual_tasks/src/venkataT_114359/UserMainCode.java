package venkataT_114359;
package com.parexel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserMainCode 
{
	public static void main(String args[]) throws Exception
	{
		boolean isExpCorrect;
		
		Scanner scanner = new Scanner(System.in);
		String joinStrDate = scanner.next();
		String currentStrDate = scanner.next();
		int experience = scanner.nextInt();
		
		isExpCorrect = calculateExperience(joinStrDate, currentStrDate, experience);
		
		System.out.println("The Output is :"+isExpCorrect);
	}
	/**
	 * 
	 * @param joiningDateArg
	 * @param currentDateArg
	 * @param experienceArg
	 * @return
	 * @throws ParseException
	 */
	public static boolean calculateExperience(String joiningDateArg, String currentDateArg, int experienceArg)
			throws ParseException 
	{
		Date joiningDate = new Date();
		Date currentDate = new Date();
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		joiningDate = simpleDate.parse(joiningDateArg);
		currentDate = simpleDate.parse(currentDateArg);
		
	}
}


