package com.mpp.lab1;

import java.util.*;
import java.util.Date;

public class Sprint {
	int sprintId;
	String name;
	Date startDate;
	Date dueDate;
	int releaseId;
	
	List<Feature> features;
	
	public List<Feature> getFeatures(){
		return this.features;
	}
	
	public Sprint(String name){
		this.name = name;
		this.features = new ArrayList<Feature>();
	}
	
	public void addFeature(Feature feature){
		
		this.features.add(feature);
	}
	
	public Feature getFeature(String name)
	{
		return features.get(0);
	}

}
