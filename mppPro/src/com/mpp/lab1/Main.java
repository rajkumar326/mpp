package com.mpp.lab1;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		//
		ProjectManager manager=new ProjectManager("Raj");
		manager.ssn="123asb";
		manager.projectManagerId=11;
		
		//Project 
		manager.createProject(manager,"ProjectManagement");
	//	Project project1=new Project(manager,"Project Management");
		
		//features 
			Feature features=new Feature();
			features.featureId=1;
			features.status="Open";
			features.featureName="Feature1";
			features.featureDescription="Change in logging system.";
			
			// sprints
			Sprint sprint1 =new Sprint("Sprint 1");
			sprint1.addFeature(features);
			
			// releases
			Release release=new Release("Version 1.0");
			release.releaseDate=new Date();
			release.addSprint(sprint1);
			
			manager.getRelatedProject("ProjectManagement").addRelease(release);
			
			Report report =new Report();
			
			Project pjt=manager.getRelatedProject("ProjectManagement");
			
			report.workCompleted(pjt,pjt.getRelease("Version 1.0").getSprint("Sprint 1"));
			report.workRemaining(pjt,pjt.getRelease("Version 1.0").getSprint("Sprint 1"));
			
			Developer developer =new Developer();
			developer.estimateEffort(pjt.getRelease("Version 1.0").getSprint("Sprint 1").getFeature("Feature1"));
			developer.estimateRemainingEffort(pjt.getRelease("Version 1.0").getSprint("Sprint 1").getFeature("Feature1"));
		
		
	}

}
