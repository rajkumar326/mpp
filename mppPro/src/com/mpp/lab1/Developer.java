package com.mpp.lab1;

public class Developer
{
	String name;
	int developerId;
	String ssn;
	
		 
	 public double estimateEffort(Feature feature)
	 {
		 return feature.effortEstimate;
	 }
	 
	 public double estimateRemainingEffort(Feature feature)
	 {
		 return feature.effortEstimate- feature.workDone;
	 }	 

}