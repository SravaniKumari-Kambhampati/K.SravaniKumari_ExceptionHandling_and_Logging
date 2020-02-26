package com.SravaniKumari.InterestCalculator;

import java.util.Scanner;
import org.apache.logging.log4j.*;
public class ClientApplication {
	private static Scanner scanner;
	private static final Logger logger = LogManager.getLogger(ClientApplication.class);
	public static void main(String[] args) {
		double principleAmount, rateOfInterest,  time,interest=0;
		String query;
		int choice;
		scanner = new Scanner(System.in);
		CalculateInterest calculator = new CalculateInterest();
		do {
			logger.debug("\nEnter Principle Amount,rate of interest, time period : ");
			principleAmount = scanner.nextDouble();
			rateOfInterest  = scanner.nextDouble();
			time = scanner.nextDouble();
			logger.debug("\n1.Simple Interest\n2.Compound Interest\nEnter the choice : ");
			choice = scanner.nextInt();
			if(choice == 1) {
				interest = calculator.calculateSimpleInterest(principleAmount, time, rateOfInterest);
			}
			else if(choice == 2) {
				interest = calculator.calculateCompoundInterest(principleAmount, time, rateOfInterest);
			}
			else {
				logger.debug("Wrong Choice ");
			}
			logger.debug("\nInterest = " + interest);
			logger.debug("\npress 'stop' to exit or anything to continue : ");
			query = scanner.next();
		}while(!query.equals("stop"));
	}
}