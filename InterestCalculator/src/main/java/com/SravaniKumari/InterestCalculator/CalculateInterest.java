package com.SravaniKumari.InterestCalculator;

import org.apache.logging.log4j.*;
public class CalculateInterest implements Calculate {
	private static final Logger logger = LogManager.getLogger(CalculateInterest.class);
	public double calculateSimpleInterest(double principleAmount, double time, double rateOfInterest) {
		// TODO Auto-generated method stub
		logger.info("In calculateSimpleInterest method");
		return (principleAmount * time * rateOfInterest) / 100.0;
	}

	public double calculateCompoundInterest(double principleAmount, double time, double rateOfInterest) {
		// TODO Auto-generated method stub
		logger.info("In calculateCompoundInterest method");
		return principleAmount * Math.pow((1+rateOfInterest/100), time);
	}
	
}