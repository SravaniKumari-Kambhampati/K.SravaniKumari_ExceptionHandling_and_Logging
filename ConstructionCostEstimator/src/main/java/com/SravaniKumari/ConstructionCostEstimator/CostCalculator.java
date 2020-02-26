package com.SravaniKumari.ConstructionCostEstimator;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class CostCalculator {
	private static final Logger logger = LogManager.getLogger(CostCalculator.class);
	private double returnCost(String materialStandard, double areaOfHouse, boolean automated) {
		logger.info("In returnCost method");
		double cost=0;
		if(materialStandard.equals("Standard")) {
			cost = 1200 * areaOfHouse;
		}
		else if(materialStandard.equals("aboveStandard")) {
			cost = 1500 * areaOfHouse;
		}
		else if(automated && materialStandard.equals("highStandard")) {
			cost = 2500 * areaOfHouse;
		}
		else {
			cost = 1800 * areaOfHouse;
		}
		return cost;
	}
	public double getCost(String materialStandard, double areaOfHouse, boolean automated) {
		logger.info("In getCost method");
		return returnCost(materialStandard,areaOfHouse,automated);
	}
}