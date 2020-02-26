package com.SravaniKumari.ConstructionCostEstimator;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class ClientApplication {
	private static Scanner scanner;
	private static final Logger logger=LogManager.getLogger(ClientApplication.class);
	public static void main(String[] args) {
		logger.info("In Client Application");
		double areaOfHouse, constructionCost;
		String materialStandard;
		String query;
		CostCalculator costCalculator = new CostCalculator();
		scanner = new Scanner(System.in);
		boolean automated=false;
		do {
			logger.debug("\nEnter cost of the house :");
			areaOfHouse = scanner.nextDouble();
			logger.debug("\nEnter the material standard [ Standard || aboveStandard || highStandard ] :");
			materialStandard = scanner.next();
			logger.debug("\nEnter if it fully automated [y/n] :");
			if(scanner.next().equals("y")) {
				automated=true;
			}
			constructionCost = costCalculator.getCost(materialStandard, areaOfHouse, automated);
			logger.debug("\nEstimated house construction cost :" + constructionCost);
			logger.debug("\nPress stop to exit or anything to continue : ");
			query=scanner.next();
		}while(!query.equals("stop"));
	}
}
